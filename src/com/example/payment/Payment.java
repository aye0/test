package com.example.payment;

public interface Payment {
    boolean pay(String orderid, int amount);
}
//注意，接口这里没有public
//凡是方法，必须注明返回类型！！！