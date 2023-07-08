package com.maplesong.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.maplesong.annotation.AccessLimit;
import com.maplesong.domain.Message;
import com.maplesong.domain.User;
import com.maplesong.service.MessageService;
import com.maplesong.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @program: maple
 * @description:
 * @author: Maple
 * @create: 2023-04-04 15:08
 */
@Controller
public class MessageController {
    @Autowired
    private MessageService messageService;

    @Value("${message.avatar}")
    private String avatar;

    @GetMapping("/message")
    public String message(Model model,HttpSession session,@RequestParam(defaultValue = "1",value = "pageNum") Integer pageNum) {
        User user = (User) session.getAttribute("user");
        //设置头像
        if (user == null) {
            //如果没有用户记录，给一个匿名用户
            User user1 = new User();
            user1.setType(0);
            session.setAttribute("user",user1);
        }
        PageHelper.startPage(pageNum,15);
        List<Message> messages = messageService.listMessage();
        PageInfo<Message> pageInfo = new PageInfo<Message>(messages);
        model.addAttribute("messages", pageInfo);
        return "message";
    }

    //    查询留言
    @GetMapping("/messagecomment")
    public String messages(Model model,@RequestParam(defaultValue = "1",value = "pageNum") Integer pageNum) {

        PageHelper.startPage(pageNum,15);
        List<Message> messages = messageService.listMessage();
        PageInfo<Message> pageInfo = new PageInfo<Message>(messages);
        model.addAttribute("messages", pageInfo);

        return "message::messageList";
    }

    //    新增留言
    @PostMapping("/message")
    @AccessLimit(seconds = 15, maxCount = 3) //15秒内 允许请求3次
    public String post(Message message, HttpSession session, Model model,@RequestParam(defaultValue = "1",value = "pageNum") Integer pageNum) {
        User user = (User) session.getAttribute("user");
        //设置头像
        if(user.getType() == 1){
            message.setAvatar(user.getAvatar());
            message.setAdminMessage(true);
        }
        else{
            message.setAvatar(avatar);
            user.setEmail(message.getEmail());
            user.setNickname(message.getNickname());
            //user.setType(0); 进入页面时已经设置过了
            session.setAttribute("user",user);
        }

        Long parentId = message.getParentMessage().getId();
        Message parentMessage = null;
        if (parentId != null) {
            message.setParentMessageId(parentId);
            // 根据父评论id查询留言信息
            parentMessage = messageService.getEmailByParentId(parentId);
        }
        messageService.saveMessage(message,parentMessage);

        PageHelper.startPage(pageNum,15);
        List<Message> messages = messageService.listMessage();
        PageInfo<Message> pageInfo = new PageInfo<Message>(messages);
        model.addAttribute("messages", pageInfo);
        return "message";

        // return "redirect:/message";
    }

    //    删除留言
    @GetMapping("/messages/{id}/delete")
    public String delete(@PathVariable Long id, RedirectAttributes attributes, Model model, HttpSession session){
        User user = (User) session.getAttribute("user");
        if(user != null){
            messageService.deleteMessage(id);
        }
        return "redirect:/message";
    }
}
