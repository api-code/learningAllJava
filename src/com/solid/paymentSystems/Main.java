package com.solid.paymentSystems;

import com.solid.paymentSystems.model.PaymentRequest;
import com.solid.paymentSystems.processor.VisaProcessor;
import com.solid.paymentSystems.service.PaymentService;
import com.solid.paymentSystems.validation.CardValidator;
import com.solid.paymentSystems.validation.Validator;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        PaymentService service =
                new PaymentService(
                        new CardValidator(),
                        new VisaProcessor()
                );

        PaymentRequest request =
                new PaymentRequest("4111111111111111", "0126",
                        new BigDecimal("500"));

        System.out.println(service.authorize(request).getStatus());
    }
}
