package com.solid.paymentSystems.validation;

import com.solid.paymentSystems.model.PaymentRequest;

public class CardValidator implements Validator{
    public void validate(PaymentRequest request) {
        if (request.getPan() == null || request.getPan().length() < 13) {
            throw new IllegalArgumentException("Invalid PAN");
        }
    }
}
