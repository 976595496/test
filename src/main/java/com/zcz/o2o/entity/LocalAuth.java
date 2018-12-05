package com.zcz.o2o.entity;

/**
 * 本地账号实体
 *
 * @author zhangchenzhao
 * @create 2018-11-18  下午12:52
 */
public class LocalAuth extends BaseEntity{
    private String userName;
    private String password;
    private PersonInfo personInfo;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public PersonInfo getPersonInfo() {
        return personInfo;
    }

    public void setPersonInfo(PersonInfo personInfo) {
        this.personInfo = personInfo;
    }
}
