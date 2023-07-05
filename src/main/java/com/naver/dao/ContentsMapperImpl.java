package com.naver.dao;

import com.naver.domain.entitiy.Contents;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class ContentsMapperImpl implements ContentsMapper{


    private final SqlSessionTemplate sessionTemplate;

    public ContentsMapperImpl(SqlSessionTemplate sessionTemplate) {
        this.sessionTemplate = sessionTemplate;
    }

    @Override
    public List<Contents> findAll() {
        return sessionTemplate.insert();
    }

    @Override
    public Integer addContents(Contents) {
        return sessionTemplate.insert("addContents", Contents);
}
