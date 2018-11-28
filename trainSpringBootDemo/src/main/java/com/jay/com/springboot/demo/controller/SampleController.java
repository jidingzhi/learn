package com.jay.com.springboot.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author:jidingzhi
 * Date:2018-11-27 9:57
 * Description:<描述>
 */
@RestController
public class SampleController {
    @RequestMapping("/test/home")
    public String  testDemo(){

        return "jay";
    }
}
