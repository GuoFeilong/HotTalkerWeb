package com.hot.hottalker.web.bean;

/**
 * @author by user on 17/7/12.
 */
public class User {
    private String name;
    private int sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public User(String name, int sex) {
        this.name = name;
        this.sex = sex;
    }
}
