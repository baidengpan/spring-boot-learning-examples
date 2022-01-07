package com.rhwayfun.springboot.quickstart.web;

import com.alibaba.fastjson.JSON;
import org.springframework.web.bind.annotation.*;

/**
 * Created by chubin on 2017/9/10.
 */
@RestController
public class DemoController {

    @RequestMapping("/now")
    public String now(String param1){
        System.out.println("param1:" + param1);
        return "hello";
    }

    @PostMapping("/post")
    public String post(@RequestParam String key, @RequestParam String value) {
        System.out.println("key:" + key + ",value:" + value);
        return key + ":" + value;
    }

    @PostMapping("/post1")
    public String post1(@RequestBody String body) {
        System.out.println("body:" + body);
        JSON json = JSON.parseObject(body);
        return body;
    }
}
