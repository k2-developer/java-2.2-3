public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int Payment = (int) service.calculate(1_000_000, 24);
        System.out.println("Monthly Payment: " + Payment+" рублей");

    }
}
