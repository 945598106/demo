package com.controller;


import com.entity.UserMsg;
import com.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class HelloController {
@Autowired
    RegisterService registerService;

    @RequestMapping("name")
    public String Hello(){
        return "猪";
    }
    @RequestMapping("rel")
    public  Object reg(){
        UserMsg userMsg =new UserMsg();
        userMsg.setPersonAccount("1230");
        userMsg.setPersonPassword("123456");
        int num =registerService.Register(userMsg);
        return userMsg ;
    }

}
