package com.naver.dao;

import com.naver.domain.entitiy.User;
import com.naver.domain.request.ChangeUserCommentRequest;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;


@Mapper
public class CommentsMapperImpl implements CommentsMapper{
    private final SqlSessionTemplate sessionTemplate;

    public CommentsMapperImpl(SqlSessionTemplate sessionTemplate) {
        this.sessionTemplate = sessionTemplate;
    }

    @Override
    public Integer insertComment(ChangeUserCommentRequest request) {
        return sessionTemplate.insert("user.insertComment",request);
    }

    @Override
    public Integer deleteComment(ChangeUserCommentRequest request) {
        return sessionTemplate.delete("user.deleteComment",request);
    }

    @Override
    public User getUser(int n) {
        return sessionTemplate.selectOne("user.getUser",n);
    }
}
