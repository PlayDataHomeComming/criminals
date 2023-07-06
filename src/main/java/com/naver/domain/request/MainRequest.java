package com.naver.domain.request;

public class MainRequest {
    private String imgUrl;
    private String userId;

    private Integer numOfVisit;

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getNumOfVisit() {
        return numOfVisit;
    }

    public void setNumOfVisit(Integer numOfVisit) {
        this.numOfVisit = numOfVisit;
    }

    public MainRequest(String imgUrl, String userId, Integer numOfVisit) {
        this.imgUrl = imgUrl;
        this.userId = userId;
        this.numOfVisit = numOfVisit;

    }
}
