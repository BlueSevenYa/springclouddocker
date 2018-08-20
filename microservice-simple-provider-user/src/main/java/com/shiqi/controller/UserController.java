package com.shiqi.controller;

import com.shiqi.dao.UserRepository;
import com.shiqi.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by
 *
 * @author=蓝十七
 * @on 2018-08-20-21:42
 */
@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id){
        User findOne =this.userRepository.findOne(id);
        return findOne;
    }

}
