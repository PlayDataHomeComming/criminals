package com.naver.domain.entitiy;

public class Comments {
    private Integer id;
    private Integer userId;
    private String nickName;
    private String content;
    private String password;

    public Comments(Integer id, Integer userId, String nickName, String content, String password) {
        this.id = id;
        this.userId = userId;
        this.nickName = nickName;
        this.content = content;
        this.password = password;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
