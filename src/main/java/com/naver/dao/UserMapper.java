package com.naver.dao;

import com.naver.domain.request.ChangeUserCommentRequest;
import com.naver.domain.request.UserPageRequest;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.SqlSessionTemplate;

@Mapper
public interface UserMapper {

    public Integer insertComment(ChangeUserCommentRequest request);

    public Integer deleteComment(ChangeUserCommentRequest request);


}
