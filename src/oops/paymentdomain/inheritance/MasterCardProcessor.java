package oops.paymentdomain.inheritance;

import oops.paymentdomain.abstraction.ISOMessage;
import oops.paymentdomain.abstraction.PaymentRequest;
import oops.paymentdomain.abstraction.PaymentResponse;

public class MasterCardProcessor extends BaseProcessor{
    @Override
    public void validRequest(PaymentRequest request) {

    }

    @Override
    public ISOMessage buildISOMessage(PaymentRequest request) {
        return null;
    }

    @Override
    public PaymentResponse sendToNetwork(ISOMessage isoMsg) {
        return null;
    }
}
