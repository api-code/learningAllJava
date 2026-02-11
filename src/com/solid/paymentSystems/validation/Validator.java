package com.solid.paymentSystems.validation;

import com.solid.paymentSystems.model.PaymentRequest;

public interface Validator {
    void validate(PaymentRequest request);
}
