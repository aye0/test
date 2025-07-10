package com.ecommerce.service;


public interface Payment {
    //执行支付
    boolean pay(double amount,String orderID);
    String paytype();
}
