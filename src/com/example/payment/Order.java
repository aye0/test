package com.example.payment;

public class Order {
    private Payment orderpay;
    //创建接口对象，要想使用接口，先声明接口对象。 orderpay是Order类的成员变量（类型为 Payment 接口）

    public Order(Payment payshili){
        this.orderpay=payshili;
    }
    //给接口对象进行实例化依赖注入
    //定义order类的构造方法，传参的参数类型是Payment 接口的实例，参数名为payshili。学名：通过构造方法接收接口实现类的对象
    //this.orderpay=payshili是将传来的接口实例参数 alipay，注入到orderpay这个接口对象，使得可以通过调用这个接口对象来调用接口实例的方法。

    public void ordercreat(String orderid, int amount){
        boolean payresult=orderpay.pay(orderid, amount);
        if(payresult){
            System.out.println("创建成功");
        }else{
            System.out.println("创建失败");
        }
    }
}
