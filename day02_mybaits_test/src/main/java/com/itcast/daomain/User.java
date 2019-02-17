package com.itcast.daomain;

import java.io.Serializable;

public class User implements Serializable {
    private Integer id;
    private  String username;
    private  String user_grander;
    private Integer age;
    private String address;
    private long qq;
    private  String user_email;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUser_grander() {
        return user_grander;
    }

    public void setUser_grander(String user_grander) {
        this.user_grander = user_grander;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getQq() {
        return qq;
    }

    public void setQq(long qq) {
        this.qq = qq;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", username='" + username + '\'' + ", user_grander='" + user_grander + '\'' + ", age=" + age + ", address='" + address + '\'' + ", qq=" + qq + ", user_email='" + user_email + '\'' + '}';
    }
}
