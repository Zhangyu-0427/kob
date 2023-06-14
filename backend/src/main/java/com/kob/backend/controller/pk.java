package com.kob.backend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("pk")
public class pk {

    @RequestMapping("getinfo")
    public Map<String, String> getInfo() {
        Map<String, String> map = new HashMap<>();
        map.put("name", "zhangyu");
        map.put("rating", "2000");
        return map;
    }

}
