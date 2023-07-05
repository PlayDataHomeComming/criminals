package com.naver.domain.entitiy;

public class Contents {
    private Integer id;
    private  Integer userId;
    private String attribute;
    private String value;

    public Contents(Integer id, Integer userId, String attribute, String value) {
        this.id = id;
        this.userId = userId;
        this.attribute = attribute;

        this.value = value;
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

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }



    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
