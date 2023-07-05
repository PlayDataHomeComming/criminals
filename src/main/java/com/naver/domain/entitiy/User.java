package com.naver.domain.entitiy;

public class User {
    private Integer id;
    private String name;
    private Integer numOfVisit;
    private String subData;
    private String imgUrl;

    public User(Integer id, String name, Integer numOfVisit, String subData,String imgUrl) {
        this.id = id;
        this.name = name;
        this.numOfVisit = numOfVisit;
        this.subData = subData;
        this.imgUrl=imgUrl;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getSubData() {
        return subData;
    }

    public void setSubData(String subData) {
        this.subData = subData;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumOfVisit() {
        return numOfVisit;
    }

    public void setNumOfVisit(Integer numOfVisit) {
        this.numOfVisit = numOfVisit;
    }
}


