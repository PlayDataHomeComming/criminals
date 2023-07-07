package com.naver.service;


import com.naver.dao.ContentsMapper;
import com.naver.dao.UserMapper;
import com.naver.domain.entitiy.User;
import com.naver.domain.request.FreeComment;
import com.naver.domain.request.InsertComment;
import com.naver.domain.request.MainRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MainService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private ContentsMapper contentsMapper;

    public List<User> getUser(){
        return userMapper.getUser();
    }

    public void updateImgUrl(MainRequest mainRequest){
        userMapper.updateImgUrl(mainRequest);
    }
    public List<FreeComment> getFreeComments()
    {
        return contentsMapper.getFreeComment();
    }
    public Integer insertFreeComments(InsertComment comment)
    {

        return contentsMapper.insertFreeComment(comment);
    }
}
