package com.ecommerce.service.lmpl;

import com.ecommerce.entity.Product;
import com.ecommerce.service.Order;
import com.ecommerce.utils.Utils;

import java.util.List;

public class Orderlmpl implements Order  {
    //传入商品集合，生成订单实例，生成订单编号、计算总价
    @Override
    public String creatorder(List<Product> products) {
        String orderID=Utils.generateId();
        double totalprice=sumorder( products);

        System.out.println("订单编号是"+orderID+",总价为"+totalprice+"，商品总数为"+products.size());
        return orderID;
    }
    //取消订单实例
    @Override
    public boolean cancelorder(String orderID) {
        System.out.println( "取消订单号"+orderID );
        return true;
    }
    //计算总价实例
    @Override
    public double sumorder(List<Product> products) {
        double total=0;
        for (Product p:products){
            total+=p.getPrice();
        }
        //掌握这个用法对于List集合，如何遍历，如何使用对象，如何调用方法
        return total;
    }
}
