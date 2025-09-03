package se.jensen.yuki.oop.exercise4;

public class BankAccount {
    private int accountNumber;
    private int balance = 0;

    public BankAccount(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int depositNumber) {
        if (depositNumber > 0) {
            balance += depositNumber;
        } else {
            System.out.println("Ogiltig deposit number");
        }
    }

    public void withdraw(int withdrawNumber) {
        if (withdrawNumber > 0) {
            balance -= withdrawNumber;
            if (balance < 0) {
                balance = 0;
            }
        } else {
            System.out.println("Ogiltig deposit number");
        }
    }
}
