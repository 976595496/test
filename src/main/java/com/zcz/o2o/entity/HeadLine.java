package com.zcz.o2o.entity;


/**
 * 头条实体类
 *
 * @author zhangchenzhao
 * @create 2018-11-18  下午1:06
 */
public class HeadLine extends BaseEntity{
    private String lineName;
    private String lineLink;
    private String lineImg;
    //0.不可用 1.可用
    private Integer enableStatus;


    public String getLineName() {
        return lineName;
    }

    public void setLineName(String lineName) {
        this.lineName = lineName;
    }

    public String getLineLink() {
        return lineLink;
    }

    public void setLineLink(String lineLink) {
        this.lineLink = lineLink;
    }

    public String getLineImg() {
        return lineImg;
    }

    public void setLineImg(String lineImg) {
        this.lineImg = lineImg;
    }

    public Integer getEnableStatus() {
        return enableStatus;
    }

    public void setEnableStatus(Integer enableStatus) {
        this.enableStatus = enableStatus;
    }
}
