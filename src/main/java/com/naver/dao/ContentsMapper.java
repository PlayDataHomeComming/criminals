package com.naver.dao;

import com.naver.domain.entitiy.Contents;
import com.naver.domain.request.AddAttributeReqeust;
import com.naver.domain.request.InsertContent;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ContentsMapper {
    public List<Contents> getUserContents(String userId);
    public void insertAttribute(AddAttributeReqeust addAttributeReqeust);
    public void insertContent(InsertContent insertContent);
}
