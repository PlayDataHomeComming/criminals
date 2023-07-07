package com.naver.dao;

import com.naver.domain.entitiy.Comments;
import com.naver.domain.entitiy.User;
import com.naver.domain.request.ChangeUserCommentRequest;
import com.naver.domain.request.InsertCommentRequest;
import com.naver.domain.request.UpdateCommentRequest;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CommentsMapper {
    public List<Comments> getComments(String userId);
    public Integer deleteComment(ChangeUserCommentRequest request);
    public User getUser(int n);
    public void insertComment(InsertCommentRequest insertCommentRequest);
    public void updateComment(UpdateCommentRequest updateCommentRequest);
}
