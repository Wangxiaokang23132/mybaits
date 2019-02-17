package com.itcast.daomain;

import java.io.Serializable;
import java.util.List;

public class Orders implements Serializable {
    private Integer user_id;
    private Integer id;
    private String  number;

    private  User user;

    private List<items> itemsList;

    public List<com.itcast.daomain.items> getItems() {
        return itemsList;
    }

    public void setItems(List<com.itcast.daomain.items> items) {
        this.itemsList = items;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Orders{" + "user_id=" + user_id + ", id=" + id + ", number='" + number + '\'' + '}';
    }
}
