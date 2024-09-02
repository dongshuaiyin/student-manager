package com.dsy.studentmanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author: dongshuaiyin
 * @Description:
 * @Date: 2024/8/26 23:53
 * @Modified by:
 */
@Controller
public class HomeController {
    @GetMapping("/")
    public String index() {
        return "index";  // 返回 index.html
    }

    @GetMapping("/student")
    public String student() {
        return "student";  // 返回 index.html
    }

    @GetMapping("/home")
    public String home() {
        return "home";  // 返回 index.html
    }

    @GetMapping("/teachers")
    public String teachers() {
        return "teachers";  // 返回 index.html
    }
}
