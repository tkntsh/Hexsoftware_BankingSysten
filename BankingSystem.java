//customer class to store customer information
class Customer
{
    //customer characteristics
    private String name;
    private String customerId;

    //constructor initializing customer
    public Customer(String name, String customerId)
    {
        this.name = name;
        this.customerId = customerId;
    }

    //return customer name
    public String getName()
    {
        return name;
    }

    //return customer ID
    public String getCustomerId()
    {
        return customerId;
    }
}

//bank account class to manage account operations
class BankAccount
{
    //bank account characteristics
    private String accountNumber;
    private double balance;
    private Customer customer;

    //constructor initializing bank account
    public BankAccount(String accountNumber, Customer customer)
    {
        this.accountNumber = accountNumber;
        this.customer = customer;
        this.balance = 0.0;
    }

    //void method to deposit money into the account
    public void deposit(double amount)
    {
        if(amount <= 0)
        {
            throw new IllegalArgumentException("Deposit amount must be positive");
        }
        balance += amount;
        System.out.println("Successfully deposited $" + amount);
    }

    //void method to withdraw money from the account
    public void withdraw(double amount)
    {
        if(amount <= 0)
        {
            throw new IllegalArgumentException("Withdrawal amount must be positive");
        }
        if(amount > balance)
        {
            throw new IllegalArgumentException("Insufficient funds: Cannot withdraw $" + amount + ". Current balance: $" + balance);
        }
        balance -= amount;
        System.out.println("Successfully withdrew $" + amount);
    }

    //returning balance
    public double getBalance()
    {
        return balance;
    }

    //returning account details
    public String getAccountDetails()
    {
        return "Account Number: " + accountNumber + "\n" +
                "Customer: " + customer.getName() + "\n" +
                "Balance: $" + balance;
    }
}

//main class to test the banking system
public class BankingSystem
{
    public static void main(String[] args)
    {
        try
        {
            //creating a customer object
            Customer customer = new Customer("John Doe", "C001");

            //creating a new bank account object
            BankAccount account = new BankAccount("A12345", customer);

            //testing account operations
            System.out.println("Initial Account Details:");
            System.out.println(account.getAccountDetails());
            System.out.println();

            //testing deposit
            account.deposit(1000.0);
            System.out.println("Balance after deposit: $" + account.getBalance());
            System.out.println();

            //testing withdrawal
            account.withdraw(500.0);
            System.out.println("Balance after withdrawal: $" + account.getBalance());
            System.out.println();

            //test insufficient funds withdrawal
            try
            {
                account.withdraw(1000.0); //this should throw an exception
            }
            catch(IllegalArgumentException e)
            {
                System.out.println("Error: " + e.getMessage());
            }
            System.out.println();

            //testing negative deposit
            try
            {
                account.deposit(-100.0); //this should throw an exception
            }
            catch(IllegalArgumentException e)
            {
                System.out.println("Error: " + e.getMessage());
            }
            System.out.println();

            //updated account details printed
            System.out.println("Updated Account Details:");
            System.out.println(account.getAccountDetails());
        }
        catch(Exception e)
        {
            System.out.println("Unexpected error: " + e.getMessage());
        }
    }
}