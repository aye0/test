package com.example.payment;
//包声明：确保所有类都在同一个包下（如 com.example.payment）
public class Alipay implements Payment{
    @Override
    public boolean pay(String orderid, int amount) {
        System.out.println("支付宝支付" + orderid);
        return true;
    }
}
