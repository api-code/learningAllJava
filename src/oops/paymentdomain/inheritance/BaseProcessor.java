package oops.paymentdomain.inheritance;


import oops.paymentdomain.abstraction.ISOMessage;
import oops.paymentdomain.abstraction.PaymentRequest;
import oops.paymentdomain.abstraction.PaymentResponse;

//Abstraction meaning hiding the low level details(implementation part) and exposing only essential operation
public abstract class BaseProcessor {
    public abstract void validRequest(PaymentRequest request);
    public abstract ISOMessage buildISOMessage(PaymentRequest request);
    public abstract PaymentResponse sendToNetwork(ISOMessage isoMsg);

    public PaymentResponse process(PaymentRequest request){
        validRequest(request); //polymorphic call
        ISOMessage isoMsg = buildISOMessage(request); //polymorphic call
        PaymentResponse response = sendToNetwork(isoMsg);//polymorphic call
        System.out.println("BaseProcessor.process() END");
        postProcess(response);
        return response;
    }

    // Common step (optional override)
    protected void postProcess(PaymentResponse response) {
        // common logging, metrics, audit
    }
}
