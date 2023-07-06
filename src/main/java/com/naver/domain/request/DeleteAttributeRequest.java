package com.naver.domain.request;

public class DeleteAttributeRequest {
    private String userId;
    private String attribute;

    public DeleteAttributeRequest(String userId, String attribute) {
        this.userId = userId;
        this.attribute = attribute;
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
}
