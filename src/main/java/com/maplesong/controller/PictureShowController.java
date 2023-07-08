package com.maplesong.controller;

import com.maplesong.service.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @program: maple
 * @description:
 * @author: Maple
 * @create: 2023-04-04 19:21
 */
@Controller
public class PictureShowController {
    @Autowired
    private PictureService pictureService;

    @GetMapping("/picture")
    public String friends(Model model) {
        model.addAttribute("pictures",pictureService.listPicture());
        return "picture";
    }
}
