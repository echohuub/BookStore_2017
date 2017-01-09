package com.hqb.web.po;

/**
 * Created by heqingbao on 17/1/9.
 */
public class Bookcase {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bookcase{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
