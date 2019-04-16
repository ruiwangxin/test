package com.springcache.com.service;

import com.springcache.com.mapper.UserMapper;
import com.springcache.com.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class service {
    @Autowired
    private UserMapper mapper;

    @Cacheable(cacheNames = "user")
    public User getByUser(Integer id)
    {
        User user = mapper.getUserById(id);
        System.out.println("缓存开启........."+id);
        return user;
    }
}
