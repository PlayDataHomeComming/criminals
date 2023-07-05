package com.naver.domain.entitiy;

public class User {
    private Integer id;
    private String name;
    private Integer num_of_visit;
    private String sub_data;

    public User(Integer id, String name, Integer num_of_visit, String sub_data) {
        this.id = id;
        this.name = name;
        this.num_of_visit = num_of_visit;
        this.sub_data = sub_data;
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

    public Integer getNum_of_visit() {
        return num_of_visit;
    }

    public void setNum_of_visit(Integer num_of_visit) {
        this.num_of_visit = num_of_visit;
    }

    public String getSub_data() {
        return sub_data;
    }

    public void setSub_data(String sub_data) {
        this.sub_data = sub_data;
    }
}
