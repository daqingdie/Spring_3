package com.lq.service.impl;

import com.lq.service.CountService;

import java.util.Date;

public class CountServiceImpl2 implements CountService {



    String name;
    int age;
    Date birthday;

    public void save() {
        System.out.println("haha");
        System.out.println(name+"..."+age+"..."+birthday);
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

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
