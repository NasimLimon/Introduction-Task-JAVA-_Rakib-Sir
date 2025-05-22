public class BankingSystem {
    // Abstraction
    interface BankService {
        void deposit(double amount);

        void withdraw(double amount);
    }

    // Encapsulation
    class BankAccount implements BankService {
        private String accountHolder;
        private double balance;

        public BankAccount(String name) {
            accountHolder = name;
            balance = 0;
        }

        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println(amount + " টাকা জমা হলো। বর্তমান ব্যালেন্স: " + balance);
            }
        }

        public void withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.println(amount + " টাকা উত্তোলন হলো। বর্তমান ব্যালেন্স: " + balance);
            } else {
                System.out.println("অপর্যাপ্ত ব্যালেন্স।");
            }
        }
    }
}