package com.yueya.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by 02 on 2017/1/10.
 */
@Controller
public class TestController {


    @RequestMapping(value = "/testmvc")
    public String test(){
        Map map = new HashMap();
        map.put("name","xiaoluo");
        map.put("telephone","36889631");
        System.out.printf("test mvc");
        System.out.printf("test mvc");
        System.out.printf("test mvc");
        System.out.printf("test mvc");
        System.out.printf("test mvc");System.out.printf("test mvc");System.out.printf("test mvc");
        return "success";
    }

    /*@ResponseBody
    @RequestMapping(value = "/testRequestBody")
    public Map testRequestBody(){
        Map map = new HashMap();
        map.put("name","xiaoluo");
        map.put("telephone","36889631");
        return map;
    }*/
}
