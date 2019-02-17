package com.itcast.daomain;

public class items {
    private Integer id;
    private String name;
    private float price;
    private String detail;

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

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "items{" + "id=" + id + ", name='" + name + '\'' + ", price=" + price + ", detail='" + detail + '\'' + '}';
    }
}
