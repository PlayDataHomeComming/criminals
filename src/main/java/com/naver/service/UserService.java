package com.naver.service;

import com.naver.dao.CommentsMapper;
import com.naver.dao.ContentsMapper;
import com.naver.domain.entitiy.Comments;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private CommentsMapper commentsMapper;

}
