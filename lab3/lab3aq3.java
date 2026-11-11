


public class lab3aq3 {

    public static void main(String[] args) {

        // Create customer
        BankCustomer customer =
            new BankCustomer("Olga", "Carlow, Ireland");

        // Create savings accounts
        SavingsAccount account1 =
            new SavingsAccount(2000.00);

        SavingsAccount account2 =
            new SavingsAccount(3000.00);

        SavingsAccount account3 =
            new SavingsAccount(1500.00);

        SavingsAccount account4 =
            new SavingsAccount(500.00);

        // Add accounts to customer
        System.out.println("Adding accounts:");

        System.out.println(customer.addAccount(account1));
        System.out.println(customer.addAccount(account2));
        System.out.println(customer.addAccount(account3));

        // Try to add fourth account
        System.out.println(customer.addAccount(account4));

        System.out.println();

        // Print customer summary
        customer.summary();

        System.out.println();

        // Print total balance
        System.out.printf("Customer total savings: €%.2f%n",
                customer.balance());
    }
}
