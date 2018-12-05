package com.zcz.o2o.entity;

/**
 * 店铺类别实体
 *
 * @author zhangchenzhao
 * @create 2018-11-18  下午1:17
 */
public class ShopCategory extends BaseEntity {
    private String shopCategoryName;
    private String shopCategoryDesc;
    private String shopCategoryImg;
    private ShopCategory parent;

    public String getShopCategoryName() {
        return shopCategoryName;
    }

    public void setShopCategoryName(String shopCategoryName) {
        this.shopCategoryName = shopCategoryName;
    }

    public String getShopCategoryDesc() {
        return shopCategoryDesc;
    }

    public void setShopCategoryDesc(String shopCategoryDesc) {
        this.shopCategoryDesc = shopCategoryDesc;
    }

    public String getShopCategoryImg() {
        return shopCategoryImg;
    }

    public void setShopCategoryImg(String shopCategoryImg) {
        this.shopCategoryImg = shopCategoryImg;
    }

    public ShopCategory getParent() {
        return parent;
    }

    public void setParent(ShopCategory parent) {
        this.parent = parent;
    }
}
