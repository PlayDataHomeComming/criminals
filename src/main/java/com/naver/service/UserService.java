package com.naver.service;

import com.naver.dao.CommentsMapper;
import com.naver.dao.ContentsMapper;
import com.naver.dao.UserMapper;
import com.naver.domain.entitiy.Comments;
import com.naver.domain.entitiy.Contents;
import com.naver.domain.entitiy.User;
import com.naver.domain.request.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private CommentsMapper commentsMapper;
    @Autowired
    private ContentsMapper contentsMapper;
    @Autowired
    private UserMapper userMapper;



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

    public List<Comments> getComments(String userId){
        return commentsMapper.getComments(userId);
    };

    public void insertComment(InsertCommentRequest insertCommentRequest){
        commentsMapper.insertComment(insertCommentRequest);
    };
    public Integer numOfVisit(int id) {
        return userMapper.numOfVisit(id);
    }

    public void updateComment(UpdateCommentRequest updateCommentRequest){
        commentsMapper.updateComment(updateCommentRequest);
    }

    public void deleteAttribute(DeleteAttributeRequest deleteAttributeRequest){
        contentsMapper.deleteAttribute(deleteAttributeRequest);
    }

}
