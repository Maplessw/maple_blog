package com.maplesong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @program: maple
 * @description:
 * @author: Maple
 * @create: 2023-04-04 19:19
 */
@Controller
public class MusicShowController {
    @GetMapping("/music")
    public String about() {
        return "music";
    }
}
