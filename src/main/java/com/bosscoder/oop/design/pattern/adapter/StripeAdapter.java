package com.bosscoder.oop.design.pattern.adapter;

public class StripeAdapter implements PaymentGateway{
    private final StripeApp stripeApp;
    private final String token;

    public StripeAdapter(StripeApp stripeApp, String token) {
        this.stripeApp = stripeApp;
        this.token = token;
    }

    @Override
    public void pay(String orderId, double amount) {
        this.stripeApp.makePayment(this.token, amount);
    }
}
