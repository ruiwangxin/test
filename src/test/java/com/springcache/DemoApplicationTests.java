package com.springcache;

import com.springcache.com.mapper.UserMapper;
import com.springcache.com.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    private UserMapper mapper;
    @Test
    public void contextLoads() {
        User user = mapper.getUserById(1);
        System.out.println(user);
    }

}
