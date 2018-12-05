package com.zcz.o2o.entity;

/**
 * 商品类别实体
 *
 * @author zhangchenzhao
 * @create 2018-11-18  下午4:14
 */
public class ProductCategory extends BaseEntity{
    private String shopId;
    private String productCategoryName;

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }
}
