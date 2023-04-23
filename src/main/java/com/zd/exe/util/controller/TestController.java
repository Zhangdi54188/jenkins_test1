package com.zd.exe.util.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/a")
public class TestController {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("/test")
    public String test(){
        String sql = "select * from test";
        List<Map<String, Object>> maps = jdbcTemplate.queryForList(sql);
        return maps.toString();
    }
}
