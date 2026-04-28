class Account {
    int accountNumber;
    String accountHolder;
    double balance;

    Account(int accNo, String name, double bal) {
        accountHolder = name;
        accountNumber = accNo;
        balance = bal;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        balance -= amount;
        System.out.println("Withdraw: " + amount);
    }

    void display() {
        System.out.println(accountHolder + " Balance: " + balance);
    }
}

class SavingsAccount extends Account {
    SavingsAccount(int accNo, String name, double bal) {
        super(accNo, name, bal);
    }

    void calculateInterest() {
        double interest = balance * 0.044;
        System.out.println("Savings Interest: " + interest);
    }
}

class CurrentAccount extends Account {
    CurrentAccount(int accNo, String name, double bal) {
        super(accNo, name, bal);
    }

    void overdraftLimit() {
        System.out.println("Overdraft Limit Available");
    }
}

public class BankingTest {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount(1001, "Ram", 10000);
        s.deposit(1000);
        s.calculateInterest();
        s.display();

        CurrentAccount c = new CurrentAccount(1002, "Kumar", 9000);
        c.withdraw(2000);
        c.overdraftLimit();
        c.display();
    }
}
