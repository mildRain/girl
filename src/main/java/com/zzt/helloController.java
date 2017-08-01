package com.zzt;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zzt on 2017/4/5.
 */
@RestController
public class helloController {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String say(){
        return "hello Spring Boot";
    }
}
