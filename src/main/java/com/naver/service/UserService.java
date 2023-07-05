package com.naver.service;

import com.naver.dao.CommentsMapper;
import com.naver.dao.ContentsMapper;
import com.naver.domain.entitiy.Comments;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private ContentsMapper contentsMapper;

    List<Comments> (ContentsMapper ContentsMapper){
        return ContentsMapper.findAll(){}
    }

    Integer addContents(Comments comments){
        return Comments.
    }
}
