package com.naver.dao;

import com.naver.domain.entitiy.User;
import com.naver.domain.request.ChangeUserCommentRequest;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CommentsMapper {
    public Integer insertComment(ChangeUserCommentRequest request);

    public Integer deleteComment(ChangeUserCommentRequest request);
    public User getUser(int n);
}
