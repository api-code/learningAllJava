package com.payment.processor;

import com.payment.model.PaymentRequest;
import com.payment.model.PaymentResponse;

public class MasterCardProcessor extends BaseProcessor {
    protected void validate(PaymentRequest request) {
        System.out.println("MasterCard validation");
    }
    protected String buildISOMessage(PaymentRequest request) {
        return "MC_ISO_" + request.getAmount();
    }
    protected void sendToNetwork(String isoMessage) {
        System.out.println("Sending to MasterCard Network: " + isoMessage);
    }
    protected PaymentResponse createResponse() {
        return new PaymentResponse("APPROVED - MC");
    }
}
