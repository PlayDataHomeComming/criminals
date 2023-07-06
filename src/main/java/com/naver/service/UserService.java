package com.naver.service;

import com.naver.dao.CommentsMapper;
import com.naver.dao.ContentsMapper;
import com.naver.domain.entitiy.Comments;
import com.naver.domain.entitiy.Contents;
import com.naver.domain.entitiy.User;
import com.naver.domain.request.AddAttributeReqeust;
import com.naver.domain.request.ChangeUserCommentRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private CommentsMapper commentsMapper;
    @Autowired
    private ContentsMapper contentsMapper;


    public Integer insertComment(ChangeUserCommentRequest request)
    {
        return commentsMapper.insertComment(request);
    }
    public Integer deleteComment(ChangeUserCommentRequest request)
    {
        return commentsMapper.deleteComment(request);
    }
    public User getUser(int n)
    {
        return commentsMapper.getUser(n);
    }

    public List<Contents> getUserContents(String userId){
        return contentsMapper.getUserContents(userId);
    }

    public void insertAttribute(AddAttributeReqeust addAttributeReqeust){
        contentsMapper.insertAttribute(addAttributeReqeust);
    };




}
