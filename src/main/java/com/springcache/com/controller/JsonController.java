package com.springcache.com.controller;

import com.springcache.com.pojo.User;
import com.springcache.com.service.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JsonController {
    @Autowired
    private service service;

    @RequestMapping("/User/{id}")
    public User getUser(@PathVariable("id") Integer id){
        return service.getByUser(id);
    }
}
