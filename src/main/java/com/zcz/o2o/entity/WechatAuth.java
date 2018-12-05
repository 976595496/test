package com.zcz.o2o.entity;

/**
 * 微信账号实体
 *
 * @author zhangchenzhao
 * @create 2018-11-18  下午12:50
 */
public class WechatAuth extends BaseEntity {

    private String openId;

    private PersonInfo personInfo;


    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public PersonInfo getPersonInfo() {
        return personInfo;
    }

    public void setPersonInfo(PersonInfo personInfo) {
        this.personInfo = personInfo;
    }
}
