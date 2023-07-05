package com.naver.dao;


import com.naver.domain.request.ChangeUserCommentRequest;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.SqlSessionTemplate;

@Mapper
public class UserMapperImpl implements UserMapper{

    private final SqlSessionTemplate sessionTemplate;

    public UserMapperImpl(SqlSessionTemplate sessionTemplate) {
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

}
