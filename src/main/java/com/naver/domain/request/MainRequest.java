package com.naver.domain.request;

public class MainRequest {
    private String imgUrl;
    private String userId;

    public MainRequest(String imgUrl, String userId) {
        this.imgUrl = imgUrl;
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}
