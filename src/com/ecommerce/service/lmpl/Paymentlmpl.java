package com.ecommerce.service.lmpl;

import com.ecommerce.service.Payment;
import com.ecommerce.service.lmpl.Orderlmpl;
import com.ecommerce.utils.Utils;

public class Paymentlmpl implements Payment{
    @Override
    public boolean pay(double amount,String orderID) {
        System.out.println("支付成功"+orderID+"金额"+amount);
        return true;
    }

    @Override
    public String paytype() {
        return "支付宝";
    }
}
