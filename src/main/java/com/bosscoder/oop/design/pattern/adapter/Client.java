package com.bosscoder.oop.design.pattern.adapter;

import java.util.UUID;

public class Client {
    public static void main(String[] args) {
        PaypalApp legacyPaypalApp = new PaypalApp();
        PaymentGateway paymentGateway = new PaypalAdapter(legacyPaypalApp, "xyz@gmail.com");
        paymentGateway.pay("order123", 2312.90);

        StripeApp stripeApp = new StripeApp();
        PaymentGateway paymentGateway1 = new StripeAdapter(stripeApp, UUID.randomUUID().toString());
        paymentGateway1.pay("order123", 2312.90);

    }
}
