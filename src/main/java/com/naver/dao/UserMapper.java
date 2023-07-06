package com.naver.dao;

import com.naver.domain.request.ChangeUserCommentRequest;
import com.naver.domain.request.UserPageRequest;

import com.naver.domain.entitiy.User;
import com.naver.domain.request.MainRequest;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

@Mapper
public interface UserMapper {


    public Integer insertComment(ChangeUserCommentRequest request);

    public Integer deleteComment(ChangeUserCommentRequest request);


    public Integer numOfVisit(int id);
    public List<User> getUser();
    public void updateImgUrl(MainRequest mainRequest);

}
