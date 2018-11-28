package com.jay.demo;

import com.jay.DemoApplication;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestComponent;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

/**
 * Author:jidingzhi
 * Date:2018-11-27 9:35
 * Description:<描述>
 */
@RunWith(SpringRunner.class)//底层用junit  SpringJUnit4ClassRunner
@SpringBootTest(classes = {DemoApplication.class})//启动整个SpringBoot工程
@AutoConfigureMockMvc
public class SpringBootTestDemo {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void apiTest()throws Exception{
        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/test/home"))
                .andExpect(MockMvcResultMatchers.status().isOk()).andReturn();
        int status = mvcResult.getResponse().getStatus();
        System.out.println(status);
    }

    @Test
    public void testOne() {
        System.out.println("test testting!");
        TestCase.assertEquals(1,1);
    }
    @Before
    public  void testBefore(){
        System.out.println("say Hello!");
    }

    @After
    public  void testAfter(){
        System.out.println(" after say goodbye");
    }

}
