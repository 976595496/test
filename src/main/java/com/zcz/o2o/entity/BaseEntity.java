package com.zcz.o2o.entity;

import java.util.Date;

/**
 * 基本类实体
 *
 * @author zhangchenzhao
 * @create 2018-11-18  下午1:17
 */
public class BaseEntity {
    //主键 id uuid
    private String id;
    //创建时间
    private Date createTime;
    //权重
    private Integer Priority;
    //最后修改时间
    private Date lastEditTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getPriority() {
        return Priority;
    }

    public void setPriority(Integer priority) {
        Priority = priority;
    }

    public Date getLastEditTime() {
        return lastEditTime;
    }

    public void setLastEditTime(Date lastEditTime) {
        this.lastEditTime = lastEditTime;
    }
}
