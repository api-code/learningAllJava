package com.payment.processor;

import com.payment.model.PaymentRequest;
import com.payment.model.PaymentResponse;

public abstract class BaseProcessor {

    // TEMPLATE METHOD (fixed flow)
    public final PaymentResponse process(PaymentRequest request) {

        System.out.println("---- Transaction Started ----");
        validate(request);
        String iso = buildISOMessage(request);
        sendToNetwork(iso);
        PaymentResponse response = createResponse();
        System.out.println("---- Transaction Finished ----");
        return response;

    }

    protected abstract void validate(PaymentRequest request);
    protected abstract String buildISOMessage(PaymentRequest request);
    protected abstract void sendToNetwork(String iso);
    protected abstract PaymentResponse createResponse();
}
