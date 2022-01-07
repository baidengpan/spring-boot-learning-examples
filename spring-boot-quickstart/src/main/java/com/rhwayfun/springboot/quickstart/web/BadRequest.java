package com.rhwayfun.springboot.quickstart.web;

import com.alibaba.fastjson.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class BadRequest {

    @RequestMapping("/test1")
    public String test(){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("key1", "value1");
        return jsonObject.toString();
    }

}
