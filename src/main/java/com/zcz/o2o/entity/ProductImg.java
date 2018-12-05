package com.zcz.o2o.entity;

/**
 * 商品图片实体
 *
 * @author zhangchenzhao
 * @create 2018-11-18  下午4:19
 */
public class ProductImg extends BaseEntity {
    private String imgAddr;
    private String imgDesc;
    private String productId;


    public String getImgAddr() {
        return imgAddr;
    }

    public void setImgAddr(String imgAddr) {
        this.imgAddr = imgAddr;
    }

    public String getImgDesc() {
        return imgDesc;
    }

    public void setImgDesc(String imgDesc) {
        this.imgDesc = imgDesc;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }
}
