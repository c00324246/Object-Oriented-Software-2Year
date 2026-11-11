
public class SavingsAccount {

    // Static variables
    private static int nextAccountNumber = 1;
    private static double annualInterestRate;

    // Instance variables
    private int accountNumber;
    private double savingsBalance;

    // Constructor
    public SavingsAccount(double savingsBalance) {

        this.accountNumber = nextAccountNumber;
        nextAccountNumber++;

        this.savingsBalance = savingsBalance;
    }

    // Calculate monthly interest
    public void calculateMonthlyInterest() {

        double monthlyInterest = savingsBalance * annualInterestRate / 12;

        savingsBalance = savingsBalance + monthlyInterest;
    }

    // Change annual interest rate
    public static void modifyInterestRate(double newRate) {

        annualInterestRate = newRate;
    }

    // Getter for account number
    public int getAccountNumber() {
        return accountNumber;
    }

    // Getter for savings balance
    public double getSavingsBalance() {
        return savingsBalance;
    }
}
