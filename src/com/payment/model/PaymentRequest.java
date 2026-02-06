package com.payment.model;

import java.math.BigDecimal;

public class PaymentRequest {

    // 🔒 Private data (encapsulation)
    private final String pan;
    private final String expiry;
    private final BigDecimal amount;
    private final String currency;

    public PaymentRequest(String pan, String expiry, BigDecimal amount, String currency) {
        validatePan(pan);
        validateExpiry(expiry);
        validateAmount(amount);

        this.pan = pan;
        this.expiry = expiry;
        this.amount = amount;
        this.currency = currency;
    }

    private void validatePan(String pan) {
        if (pan == null || pan.length() < 13 || pan.length() > 19) {
            throw new IllegalArgumentException("Invalid PAN");
        }
    }

    private void validateExpiry(String expiry) {
        if (expiry == null || !expiry.matches("\\d{4}")) {
            throw new IllegalArgumentException("Invalid Expiry");
        }
    }

    private void validateAmount(BigDecimal amount) {
        if (amount == null || amount.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Invalid Amount");
        }
    }


    // ❌ No direct PAN getter
    public String getMaskedPan() {
        return "XXXX-XXXX-XXXX-" + pan.substring(pan.length() - 4);
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public String getCurrency() {
        return currency;
    }

    public String getPan() {
        return pan; // internal use only
    }

}
