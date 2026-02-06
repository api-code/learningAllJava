package com.payment.service;

import com.payment.factory.ProcessorFactory;
import com.payment.model.PaymentRequest;
import com.payment.model.PaymentResponse;
import com.payment.processor.BaseProcessor;
import com.payment.util.NetworkResolver;

import java.math.BigDecimal;

public class PaymentService {

    public PaymentResponse authorize(PaymentRequest request) {

        String network = NetworkResolver.resolve(request.getPan());
        BaseProcessor processor = ProcessorFactory.getProcessor(network);
        return processor.process(request); // 🔥 polymorphism
    }

    public PaymentResponse authorize(String pan, String expiry,
                                     BigDecimal amount, String currency) {

        PaymentRequest request =
                new PaymentRequest(pan, expiry, amount, currency);
        return authorize(request);
    }
}
