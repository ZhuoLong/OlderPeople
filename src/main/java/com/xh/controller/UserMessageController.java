package com.xh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by KAIRUN on 2017/10/27.
 */
@Controller
public class UserMessageController {
    @RequestMapping("/TestController.action")
    public String TestController(){
        return "/jsp/admin/login.jsp";
    }
}
