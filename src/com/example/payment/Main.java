package com.example.payment;

public class Main {
    public static void main(String[] args ){
        Payment alipayshili=new Alipay();
        // 创建支付宝支付实例
        Order order1=new Order(alipayshili);
        // 创建订单并注入支付方式
        order1.ordercreat("1234",100);
        System.out.println("-------------------------");
        Payment wepayshili=new Wepay();
        Order order2=new Order(wepayshili);
        order2.ordercreat("4567",200);
    }
}

