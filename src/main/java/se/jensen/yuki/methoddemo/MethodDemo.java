package se.jensen.yuki.methoddemo;

public class MethodDemo {
    public static void main(String[] args) {
        printMenu();
        int result = multiply(10, 5);
        int number = 5;
        int result2 = add(result, number);
        System.out.println("Resultat blev: " + result2);
    }

    private static void printMenu() {
        System.out.println("**********************");
        System.out.println("Välcommen till spelet");
        System.out.println("Tryck 1 för att spela, tryc 2 för att avsluta");
        System.out.println("**********************");
    }

    private static int multiply(int a, int b) {
        return a * b;
    }

    private static int add(int a, int b) {
        return a + b;
    }
}
