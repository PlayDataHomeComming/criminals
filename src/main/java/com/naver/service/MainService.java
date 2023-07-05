package com.naver.service;


import com.naver.dao.UserMapper;
import com.naver.domain.entitiy.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MainService {
    @Autowired
    private UserMapper userMapper;

    public List<User> user() {
        return userMapper.user();
    }
}
