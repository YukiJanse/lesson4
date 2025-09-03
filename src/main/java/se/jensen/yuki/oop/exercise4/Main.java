package se.jensen.yuki.oop.exercise4;

public class Main {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount(1234);
        System.out.println("Saldot: " + myAccount.getBalance());
        myAccount.deposit(10000);
        System.out.println("Saldot: " + myAccount.getBalance());
        myAccount.withdraw(3000);
        System.out.println("Saldot: " + myAccount.getBalance());
    }
}
