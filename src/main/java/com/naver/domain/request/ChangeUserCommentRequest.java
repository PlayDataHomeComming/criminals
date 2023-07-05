package com.naver.domain.request;

public class ChangeUserCommentRequest {
    private int user_id;
    private String attribute;
    private String value;

    public ChangeUserCommentRequest() {
    }

    public ChangeUserCommentRequest(int user_id, String attribute, String value) {
        this.user_id = user_id;
        this.attribute = attribute;
        this.value = value;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
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
