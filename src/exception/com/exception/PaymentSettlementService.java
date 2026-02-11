package exception.com.exception;

import java.io.File;

public class PaymentSettlementService {

    public void processSettlementFile(String filePath) {

        File file = new File(filePath);

        // Validate JSON first
        CheckPayload.validate(file);

        // Continue business logic
        System.out.println("Settlement file validated successfully.");
        System.out.println("Processing payment settlements...");
    }
}
