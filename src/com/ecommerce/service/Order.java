//为啥要先写接口，再写实现类？ 假设现在的支付实现类为支付宝，后续如果新增微信支付，仅新增微信支付实现类即可，不用修改下游代码。
//详见测试类是怎么使用接口，而没有使用具体实现类


package com.ecommerce.service;

import com.ecommerce.entity.Product;
import java.util.List;

public interface Order {
    //创建订单并返回订单号
    String creatorder(List<Product> products);
    //取消订单
    boolean cancelorder(String orderID);
    //计算订单总价
    double sumorder(List<Product> products);
}
