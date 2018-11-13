package com.jay.com.springboot.demo.json.controller;

import com.jay.com.springboot.demo.json.domain.User;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import java.util.Date;


/**
 * Author:jidingzhi
 * Date:2018-11-12 14:51
 * Description:<描述>
 */
@Controller
public class Demojson {

    //@GetMapping("/testjson")
    //public Object testJson(){
    //    return new User("赵月","1234567",null,new Date());
    //}

    @RequestMapping("/a/indextest")
    public Object  indextest(){

        System.out.println("这下可以了吧");

        return "index";
    }

}

