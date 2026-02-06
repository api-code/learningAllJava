package oops.paymentdomain.Encapsulation;

import java.math.BigDecimal;
import java.time.YearMonth;
import java.util.UUID;

//encapsulation is their mechanism where we hide the data and we provide the controller access via getter and setter
public class PaymentRequest {
    private String pan;
    private String expiry;
    private final String cvv;

    // Non-sensitive but controlled
    private final BigDecimal amount;
    private final String currency;

    // Derived / internal state
    private final String transactionId;

    public PaymentRequest(String cvv, BigDecimal amount, String currency, String pan, String expiry) {
        // Validation at construction time
        validatePan(pan);
//        validateExpiry(expiry); -> Card network spec
        validateCvv(cvv);
//        validateAmount(amount); -> Business rule

        this.cvv = cvv;
        this.amount = amount;
        this.currency = currency;
        this.pan = pan;
        this.expiry = expiry;
        this.transactionId = UUID.randomUUID().toString();
    }

    private void validatePan(String pan) {
        if (pan == null || pan.length() < 13 || pan.length() > 19) {
            throw new IllegalArgumentException("Invalid PAN");
        }
    }

    private void validateCvv(String cvv) {
        if (!cvv.matches("\\d{3,4}")) {
            throw new IllegalArgumentException("Invalid CVV");
        }
    }

    //Card network spec
    private void validateExpiry(String expiry) {

        if (expiry == null || !expiry.matches("\\d{4}")) {
            throw new IllegalArgumentException("Invalid expiry format");
        }

        int month = Integer.parseInt(expiry.substring(0, 2));
        int year  = Integer.parseInt(expiry.substring(2, 4));

        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Invalid expiry month");
        }

        // Convert YY → YYYY (assume 2000–2099)
        int fullYear = 2000 + year;

        YearMonth expiryDate = YearMonth.of(fullYear, month);
        YearMonth currentDate = YearMonth.now();

        // Card is expired if expiry month is BEFORE current month
        if (expiryDate.isBefore(currentDate)) {
            throw new IllegalArgumentException("Card is expired");
        }
    }

    private void validateAmount(BigDecimal amount) {

        if (amount == null) {
            throw new IllegalArgumentException("Amount is missing");
        }

        // 1️Amount must be greater than zero - Business rule
        if (amount.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Amount must be greater than zero");
        }

        // 2️Currency precision (example: INR allows 2 decimals) - Currency definition (ISO 4217)
        if (amount.scale() > 2) {
            throw new IllegalArgumentException("Invalid amount precision");
        }

        // Upper limit (example: card transaction limit) -- Acquirer / issuer config
        BigDecimal MAX_LIMIT = new BigDecimal("200000"); // configurable

//        Bank / regulator
        if (amount.compareTo(MAX_LIMIT) > 0) {
            throw new IllegalArgumentException("Amount exceeds transaction limit");
        }
    }

    // getters only, setters restricted
    // Controlled exposure
    public String getMaskedPan() {
        return "XXXX-XXXX-XXXX-" + pan.substring(12);
    }

    @Override
    public String toString() {
        return "PaymentRequest{" +
                "maskedPan='" + getMaskedPan() + '\'' +
                ", amount=" + amount +
                ", currency='" + currency + '\'' +
                ", transactionId='" + transactionId + '\'' +
                '}';
    }

}
