package com.lq;

import com.lq.service.CountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.applet.AppletContext;


public class test {

    @Test
    public void test_1(){
//        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
//        CountService countService = (CountService) ac.getBean("countService");
//        countService.save();
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        CountService countService = (CountService) ac.getBean("countService2");
        countService.save();
    }


}
