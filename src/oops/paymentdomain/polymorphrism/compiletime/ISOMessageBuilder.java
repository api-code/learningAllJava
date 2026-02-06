package oops.paymentdomain.polymorphrism.compiletime;

import oops.paymentdomain.abstraction.ISOMessage;

class ISOMessageBuilder {

    // ATM transaction
    public ISOMessage buildISO(ATMRequest request) {
        System.out.println("Build ATM ISO");
        return new ISOMessage();
    }

    // POS transaction
    public ISOMessage buildISO(POSRequest request) {
        System.out.println("Build POS ISO");
        return new ISOMessage();
    }

    // E-commerce transaction
    public ISOMessage buildISO(EcomRequest request) {
        System.out.println("Build ECOM ISO");
        return new ISOMessage();
    }
}
