package oops.paymentdomain.abstraction;


//Abstraction meaning hiding the low level details(implementation part) and exposing only essential operation
public abstract class BaseProcessor {
    public abstract void validRequest(PaymentRequest request);
    public abstract ISOMessage buildISOMessage(PaymentRequest request);
    public abstract PaymentResponse sendToNetwork(ISOMessage isoMsg);

    public PaymentResponse process(PaymentRequest request){
        validRequest(request);
        ISOMessage isoMsg = buildISOMessage(request);
        return sendToNetwork(isoMsg);
    }
}
