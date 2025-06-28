package com.bosscoder.oop.design.pattern.adapter;

public class StripeApp {
    public void makePayment(String token, double amount) {
        System.out.println("Making payment for token: " + token);
    }
}
