
public class BankCustomer {

    // Instance variables
    private String name;
    private String address;

    // Array to store three savings accounts
    private SavingsAccount[] accounts = new SavingsAccount[3];

    // Number of accounts added
    private int numberOfAccounts = 0;

    // Constructor
    public BankCustomer(String name, String address) {

        this.name = name;
        this.address = address;
    }

    // Add a savings account
    public boolean addAccount(SavingsAccount account) {

        if (account != null && numberOfAccounts < 3) {

            accounts[numberOfAccounts] = account;
            numberOfAccounts++;

            return true;
        }

        return false;
    }

    // Calculate total balance
    public double balance() {

        double total = 0;

        for (int i = 0; i < numberOfAccounts; i++) {

            total = total + accounts[i].getSavingsBalance();
        }

        return total;
    }

    // Print customer information and accounts
    public void summary() {

        System.out.println("Customer Name: " + name);
        System.out.println("Address: " + address);

        System.out.println("Accounts:");

        for (int i = 0; i < numberOfAccounts; i++) {

            System.out.println(
                    "Account Number: " +
                            accounts[i].getAccountNumber() +
                            " | Balance: €" +
                            String.format("%.2f",
                                    accounts[i].getSavingsBalance()));
        }

        System.out.printf("Total balance: €%.2f%n", balance());
    }
}
