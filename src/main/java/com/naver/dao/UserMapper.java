package com.naver.dao;

import com.naver.domain.entitiy.User;
import com.naver.domain.request.MainRequest;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    public List<User> getUser();
    public void updateImgUrl(MainRequest mainRequest);
}
