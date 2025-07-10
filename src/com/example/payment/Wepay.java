package com.example.payment;

public class Wepay implements Payment {
    @Override
    public boolean pay(String orderid, int amount) {
        System.out.println("微信支付" + orderid);
        return true;
    }
}
