package com.naver.domain.request;

public class AddAttributeReqeust {
    private String userId;
    private String attribute;
    private String value;

    public AddAttributeReqeust(String userId, String attribute, String value) {
        this.userId = userId;
        this.attribute = attribute;
        this.value = value;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
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
