package com.bosscoder.oop.design.pattern.adapter;

public interface PaymentGateway {
    void pay(String orderId, double amount);
}
