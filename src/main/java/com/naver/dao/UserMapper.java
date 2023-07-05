package com.naver.dao;

import com.naver.domain.entitiy.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    public List<User> user();
}
