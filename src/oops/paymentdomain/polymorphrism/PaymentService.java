package oops.paymentdomain.polymorphrism;

import oops.paymentdomain.abstraction.PaymentRequest;
import oops.paymentdomain.abstraction.PaymentResponse;
import oops.paymentdomain.inheritance.BaseProcessor;
import oops.paymentdomain.inheritance.VisaProcessor;

public class PaymentService {

    public static void main(String[] args) {

        BaseProcessor processor = new VisaProcessor(); //

        PaymentResponse response =
                processor.process(new PaymentRequest());

        System.out.println(response.getStatus());
    }
}

