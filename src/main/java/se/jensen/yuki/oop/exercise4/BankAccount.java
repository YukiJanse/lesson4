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

    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Ogiltig deposit number");
        }
    }

    public void withdraw(int amount) {
        if (amount > 0) {
            if (balance > amount) {
                balance -= amount;
            } else {
                System.out.println("Saldot är inte tillräckligt");
            }
        } else {
            System.out.println("Ogiltig deposit number");
        }
    }
}
