package com.zcz.o2o.entity;

/**
 * 用户信息实体
 *
 * @author zhangchenzhao
 * @create 2018-11-18  下午12:26
 */
public class PersonInfo extends BaseEntity {
    private String name;
    private String iconImg;
    private String email;
    private String gender;
    private Integer enableStatus;
    //1.顾客   2 .店家   3.管理员
    private Integer userType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIconImg() {
        return iconImg;
    }

    public void setIconImg(String iconImg) {
        this.iconImg = iconImg;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getEnableStatus() {
        return enableStatus;
    }

    public void setEnableStatus(Integer enableStatus) {
        this.enableStatus = enableStatus;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

}
