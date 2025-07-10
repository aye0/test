//所谓实体类，就是先定义一下系统操作的所有商品的属性，及对应的set和get方法
//先新建父类，定义系统所有商品的属性和set、get方法。

package com.ecommerce.entity;

import com.ecommerce.utils.Utils;

public class Product {
    private String name;
    private String id;
    private double price;

    public Product(){
        this.id=Utils.generateId();
    }
    //创建商品后，其他属性都可以为null，唯独id不能为null，所以在构造方法进行定义

    public String getId(){
        return id;
    }

    public void setName(String nameshili  ){
        this.name=nameshili;
    }
    //如果什么也不用返回，写void,否则如果写了具体类型String，必须return字符串。
    public String getName(){
        return name;
    }

    public void setPrice(double priceshili  ){
        if (priceshili>0){
            this.price=priceshili;
        }else {
            System.out.println("输入大于0的价格");
        }
    }
    //添加校验逻辑

    public double getPrice(){
        return price;
    }
}
