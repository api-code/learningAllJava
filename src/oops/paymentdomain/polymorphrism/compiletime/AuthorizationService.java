package oops.paymentdomain.polymorphrism.compiletime;

import oops.paymentdomain.abstraction.PaymentRequest;
import oops.paymentdomain.abstraction.PaymentResponse;

import java.math.BigDecimal;

//compile time polymorprism happence in compile time  before the execution
class AuthorizationService {

    //same method, diff parameter list
    // Case 1: Raw card details (e-commerce)
    public PaymentResponse authorize(
            String pan,
            String expiry,
            BigDecimal amount) {

        System.out.println("Authorize using raw card details");
        return new PaymentResponse("APPROVED");
    }

    // Case 2: Tokenized card (saved card / vault)
    public PaymentResponse authorize(
            String cardToken,
            BigDecimal amount) {

        System.out.println("Authorize using card token");
        return new PaymentResponse("APPROVED");
    }

    // Case 3: Full request object (internal systems)
    public PaymentResponse authorize(
            PaymentRequest request) {

        System.out.println("Authorize using PaymentRequest object");
        return new PaymentResponse("APPROVED");
    }
}
