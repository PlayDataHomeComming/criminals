package com.naver.dao;

import com.naver.domain.entitiy.Contents;
import com.naver.domain.request.AddAttributeReqeust;
import com.naver.domain.request.DeleteAttributeRequest;
import com.naver.domain.request.FreeComment;
import com.naver.domain.request.InsertCommentRequest;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ContentsMapper {
    public List<Contents> getUserContents(String userId);
    public void insertAttribute(AddAttributeReqeust addAttributeReqeust);
    public void insertContent(InsertCommentRequest insertCommentRequest);
    public void deleteAttribute(DeleteAttributeRequest deleteAttributeRequest);
    public List<FreeComment> getFreeComment();
    public Integer insertFreeComments(FreeComment comment);
}
