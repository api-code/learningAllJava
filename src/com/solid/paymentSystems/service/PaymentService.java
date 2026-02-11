package com.solid.paymentSystems.service;

import com.solid.paymentSystems.model.PaymentRequest;
import com.solid.paymentSystems.model.PaymentResponse;
import com.solid.paymentSystems.processor.PaymentProcessor;
import com.solid.paymentSystems.validation.Validator;

public class PaymentService {

    private final Validator validator;
    private final PaymentProcessor processor;

    public PaymentService(Validator validator, PaymentProcessor processor) {
        this.validator = validator;
        this.processor = processor;
    }

    public PaymentResponse authorize(PaymentRequest request) {
        validator.validate(request);
        return processor.process(request);
    }
}
