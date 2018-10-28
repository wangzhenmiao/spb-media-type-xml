package com.wangzhen.spb.spbmediatypexml.controller;

import com.wangzhen.spb.spbmediatypexml.domain.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName UserController
 * @Description
 * @Author wangzhen
 * @Date 2018/10/28 下午2:59
 **/

@RestController
@RequestMapping("/users")
public class UserController {

    @RequestMapping("/{id}")
    public User getUser(@PathVariable("id")Long id){
        return  new User(id,"wangzhen","wangzhen@gmai.com");
    }
}
