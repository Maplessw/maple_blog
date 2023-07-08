package com.maplesong.controller;

import com.maplesong.queryvo.BlogQuery;
import com.maplesong.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @program: maple
 * @description:
 * @author: Maple
 * @create: 2023-04-04 19:15
 */
@Controller
public class ArchiveShowController {
    @Autowired
    private BlogService blogService;

    @GetMapping("/archives")
    public String archive(Model model){
        List<BlogQuery> blogs = blogService.getAllBlog();
        model.addAttribute("blogs", blogs);
        return "archives";
    }
}
