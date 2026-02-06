package com.payment.processor;

import com.payment.model.PaymentRequest;
import com.payment.model.PaymentResponse;

public class VisaProcessor extends BaseProcessor {

    protected void validate(PaymentRequest request) {
        System.out.println("Visa validation for " + request.getMaskedPan());
    }

    protected String buildISOMessage(PaymentRequest request) {
        return "VISA_ISO_" + request.getAmount();
    }

    protected void sendToNetwork(String isoMessage) {
        System.out.println("Sending to Visa Network: " + isoMessage);
    }

    protected PaymentResponse createResponse() {
        return new PaymentResponse("APPROVED - VISA");
    }
}
