public class TestBank {
    public static void main(String[] args) {
        Bank bank = new Bank(1000.0, 10.0);
        double interest = bank.calculateInterest();
        System.out.println("Monthly interest: $" + interest);
    }
}
