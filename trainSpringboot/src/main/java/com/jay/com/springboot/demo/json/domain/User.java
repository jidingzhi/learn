package com.jay.com.springboot.demo.json.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

/**
 * Author:jidingzhi
 * Date:2018-11-12 14:52
 * Description:<描述>
 */

public class User {

    private  String name;
    private  int  age;

    @JsonIgnore
    private  String pwd;

    @JsonProperty("account")
  //  @JsonInclude(JsonInclude.Include.NON_NULL)
    private  String phone;

    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss" ,locale = "zh",timezone = "GMT+8")
    private Date createTime;

    public User(String name, String pwd, String phone, Date createTime) {
        this.name = name;
        this.pwd = pwd;
        this.phone = phone;
        this.createTime = createTime;
    }

    public User(String name, int age, String pwd, String phone, Date createTime) {
        this.name = name;
        this.age = age;

        this.pwd = pwd;
        this.phone = phone;
        this.createTime = createTime;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }



}
