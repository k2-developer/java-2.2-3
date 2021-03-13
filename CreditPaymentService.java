public class CreditPaymentService {
    public double calculate(int creditValue, int creditTerm) {
        float rate = 9.99F / 12F / 100F;
        float a = (1F + rate);
        double a1 = Math.pow(a, creditTerm);
        double a2 = a1 * rate;
        float b = (1F + rate);
        double b1 = Math.pow(b, creditTerm);
        double b2 = (b1 - 1F);
        int monthlyPayment = (int) (a2 / b2 * creditValue);
        return monthlyPayment;
    }
}
