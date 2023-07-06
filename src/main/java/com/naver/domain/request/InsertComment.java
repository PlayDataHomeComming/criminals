package com.naver.domain.request;

public class InsertComment {
    private String userId;
    private String nickName;
    private String passWord;
    private String comment;

    public InsertComment(String userId, String nickName, String passWord, String comment) {
        this.userId = userId;
        this.nickName = nickName;
        this.passWord = passWord;
        this.comment = comment;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
