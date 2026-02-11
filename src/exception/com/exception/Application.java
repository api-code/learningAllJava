package exception.com.exception;

public class Application {

    public static void main(String[] args) {

        PaymentSettlementService service = new PaymentSettlementService();

        try {
            service.processSettlementFile("settlement.json");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
