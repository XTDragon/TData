package com.xt.tdata.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author XTDragon
 * @version V1.0
 * @Package com.xt.tdata.controller
 * @date 2022/7/10 17:20
 */
@Controller
public class firstController {
    @RequestMapping("/first")
    public String first8080(){
        System.out.println(8080);
        return "8080";
    }
}
