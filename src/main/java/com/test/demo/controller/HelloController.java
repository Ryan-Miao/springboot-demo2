package com.test.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Ryan Miao on 11/16/17.
 */
@Controller
public class HelloController {

    @ResponseBody
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(){
        System.out.println("he");
        return "{\"hello\":\"world\"}";
    }
}
