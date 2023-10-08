package com.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 刘怡琛
 * @version 1.0
 * @description: TODO
 * @date 2023/9/12 23:14
 */
@Controller("loginController")
public class LoginController {
    @GetMapping("/login") 
    public String login() {
        return "login";
    }

    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "<h1>Hello,World!!</h1>";

    }
}
