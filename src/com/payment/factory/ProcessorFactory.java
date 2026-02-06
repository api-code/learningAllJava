package com.payment.factory;

import com.payment.processor.*;

public class ProcessorFactory {

    public static BaseProcessor getProcessor(String network) {

        switch (network) {
            case "VISA":
                return new VisaProcessor();
            case "MASTERCARD":
                return new MasterCardProcessor();
            case "RUPAY":
                return new RuPayProcessor();
            default:
                throw new IllegalArgumentException("Unsupported network");
        }
    }
}
