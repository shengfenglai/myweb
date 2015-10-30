package com.shengfeng.po;

import java.io.Serializable;


public class User implements Serializable{

    /**
     * 
     */
    private static final long serialVersionUID = -7020619477594468968L;
    
    private long id;
    private String username;
    private String password;
    private int level;
    private int sex;
    private String mobilephone;
    private String img;
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }
    public int getSex() {
        return sex;
    }
    public void setSex(int sex) {
        this.sex = sex;
    }
    public String getMobilephone() {
        return mobilephone;
    }
    public void setMobilephone(String mobilephone) {
        this.mobilephone = mobilephone;
    }
    public String getImg() {
        return img;
    }
    public void setImg(String img) {
        this.img = img;
    }
    
}
