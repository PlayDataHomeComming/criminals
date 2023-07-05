package com.naver.dao;

import com.naver.domain.entitiy.Contents;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

@Mapper
public interface ContentsMapper {
    List<Contents> findAll();

    Integer addContents();
}
