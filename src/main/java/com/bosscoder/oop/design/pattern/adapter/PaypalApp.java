package com.bosscoder.oop.design.pattern.adapter;

public class PaypalApp {
    public void sendPayment(String email, String orderId, double amount){
        System.out.println("Payment email: " + email);
    }
}
