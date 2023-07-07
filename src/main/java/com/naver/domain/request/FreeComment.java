package com.naver.domain.request;

public class FreeComment {
    private int id;
    private String content;
    private String name;
    private String createTime;

    public FreeComment(int id, String content, String name, String createTime) {
        this.id = id;
        this.content = content;
        this.name = name;
        this.createTime = createTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}
