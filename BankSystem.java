// Base Account class
abstract class Account {
    private String accountNumber;
    private double balance;
    private String accountType;

    public Account(String accountNumber, String accountType) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }
}

// CurrentAccount class
class CurrentAccount extends Account {
    private double minDepositAmount;

    public CurrentAccount(String accountNumber, double minDepositAmount) {
        super(accountNumber, "Current");
        this.minDepositAmount = minDepositAmount;
    }

    public void generateMonthlyStatement() {
        System.out.println("Generating statement for Current Account: " + getAccountNumber());
    }

    @Override
    public void deposit(double amount) {
        if (amount >= minDepositAmount) {
            super.deposit(amount);
        } else {
            System.out.println("Deposit amount must be at least: " + minDepositAmount);
        }
    }
}

// JointAccount class
class JointAccount extends Account {
    private String[] accountHolders;

    public JointAccount(String accountNumber, String[] accountHolders) {
        super(accountNumber, "Joint");
        this.accountHolders = accountHolders;
    }

    @Override
    public boolean withdraw(double amount) {
        System.out.println("Withdrawal from joint account requires authorization.");
        return super.withdraw(amount);
    }

    public String[] getAccountHolders() {
        return accountHolders;
    }
}

// Customer class
class Customer {
    private String customerId;
    private String name;
    private Account account;

    public Customer(String customerId, String name, Account account) {
        this.customerId = customerId;
        this.name = name;
        this.account = account;
    }

    public void getAccountInfo() {
        System.out.println("Customer: " + name);
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Account Type: " + account.getAccountType());
        System.out.println("Balance: $" + account.getBalance());
    }

    public void depositToAccount(double amount) {
        account.deposit(amount);
    }

    public void withdrawFromAccount(double amount) {
        if (!account.withdraw(amount)) {
            System.out.println("Withdrawal failed. Check balance or authorization.");
        }
    }
}

public class BankSystem {
    public static void main(String[] args) {
        CurrentAccount currentAccount = new CurrentAccount("CA123", 100);
        Customer customer1 = new Customer("C001", "Alice", currentAccount);

        customer1.depositToAccount(150);
        customer1.withdrawFromAccount(50);
        customer1.getAccountInfo();

        JointAccount jointAccount = new JointAccount("JA456", new String[] { "Bob", "Carol" });
        Customer customer2 = new Customer("C002", "Bob", jointAccount);

        customer2.depositToAccount(200);
        customer2.withdrawFromAccount(100);
        customer2.getAccountInfo();
    }
}
