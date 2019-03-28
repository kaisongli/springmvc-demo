package com.lks.entities;

import java.util.Date;

/**
 * Created by likaisong on 2019/3/27.
 */
public class Book {
    private int id;

    private String title;

    private double price;

    private Date publishDate;

    public Book(int id, String title, double price, Date publishDate) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.publishDate = publishDate;
    }

    public Book() {
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }
}
