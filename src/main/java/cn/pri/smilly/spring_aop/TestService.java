package cn.pri.smilly.spring_aop;

import org.springframework.stereotype.Service;

@Service
public class TestService {

    public void say(String name){
        System.out.println("Hello, " + name);
    }

}
