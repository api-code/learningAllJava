package com.solid.paymentSystems.processor;

import com.solid.paymentSystems.model.PaymentRequest;
import com.solid.paymentSystems.model.PaymentResponse;

public interface PaymentProcessor {
    PaymentResponse process(PaymentRequest request);
}

