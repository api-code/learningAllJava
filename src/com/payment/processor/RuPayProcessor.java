package com.payment.processor;

import com.payment.model.PaymentRequest;
import com.payment.model.PaymentResponse;

public class RuPayProcessor extends BaseProcessor {

    protected void validate(PaymentRequest request) {
        System.out.println("RuPay validation");
    }

    protected String buildISOMessage(PaymentRequest request) {
        return "RUPAY_ISO_" + request.getAmount();
    }

    protected void sendToNetwork(String isoMessage) {
        System.out.println("Sending to RuPay Network: " + isoMessage);
    }

    protected PaymentResponse createResponse() {
        return new PaymentResponse("APPROVED - RUPAY");
    }
}
