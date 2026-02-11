package com.solid.paymentSystems.model;

import java.math.BigDecimal;

public class PaymentRequest {

    private final String pan;
    private final String expiry;
    private final BigDecimal amount;

    public PaymentRequest(String pan, String expiry, BigDecimal amount) {
        this.pan = pan;
        this.expiry = expiry;
        this.amount = amount;
    }

    public String getPan() {
        return pan;
    }

    public String getExpiry() {
        return expiry;
    }

    public BigDecimal getAmount() {
        return amount;
    }
}
