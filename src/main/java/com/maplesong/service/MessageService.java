package com.maplesong.service;

import com.maplesong.domain.Message;

import java.util.List;

public interface MessageService {
    //查询留言列表
    List<Message> listMessage();

    //保存留言
    int saveMessage(Message message,Message parentMessage);

    //删除留言
    void deleteMessage(Long id);


    Message getEmailByParentId(Long parentId);
}
