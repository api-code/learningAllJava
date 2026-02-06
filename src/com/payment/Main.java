package com.payment;

import com.payment.model.PaymentRequest;
import com.payment.service.PaymentService;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        PaymentRequest request =
                new PaymentRequest("4111111111111111", "0126",
                        new BigDecimal("500"), "INR");

        PaymentService service = new PaymentService();
        System.out.println(service.authorize(request).getStatus());
    }
}
