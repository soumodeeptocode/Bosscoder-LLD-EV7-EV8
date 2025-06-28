package com.bosscoder.oop.design.pattern.adapter;

public class PaypalAdapter implements PaymentGateway{
    private final PaypalApp paypalApp;
    private final String customerEmailId;

    public PaypalAdapter(PaypalApp _paypalApp, String customerEmailId){
        this.paypalApp = _paypalApp;
        this.customerEmailId = customerEmailId;
    }

    @Override
    public void pay(String orderId, double amount) {

        this.paypalApp.sendPayment(this.customerEmailId, orderId, amount);
    }
}
