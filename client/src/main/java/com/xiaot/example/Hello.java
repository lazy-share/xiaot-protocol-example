package com.xiaot.example;

import java.util.List;

/**
 * <p>
 *
 * </p>
 *
 * @author lzy
 * @since 2021/5/30.
 */
public class Hello {

    private String name;
    private int age;
    private long version;
    private double price;
    private List<String> likes;

    public String getName() {
        return name;
    }

    public Hello setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Hello setAge(int age) {
        this.age = age;
        return this;
    }

    public long getVersion() {
        return version;
    }

    public Hello setVersion(long version) {
        this.version = version;
        return this;
    }

    public double getPrice() {
        return price;
    }

    public Hello setPrice(double price) {
        this.price = price;
        return this;
    }

    public List<String> getLikes() {
        return likes;
    }

    public Hello setLikes(List<String> likes) {
        this.likes = likes;
        return this;
    }
}
