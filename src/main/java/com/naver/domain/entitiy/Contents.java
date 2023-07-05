package com.naver.domain.entitiy;

public class Contents {
    private int uid;
    private String attribute;
    private String value;

    public Contents(int uid, String attribute, String value) {
        this.uid = uid;
        this.attribute = attribute;
        this.value = value;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
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
