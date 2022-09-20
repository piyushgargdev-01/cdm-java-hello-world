import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Value of A: ");
        int a = scanner.nextInt();

        System.out.print("Enter Value of B: ");
        int b = scanner.nextInt();

        System.out.println("Sum: " + (a + b));
        System.out.println("Divide: " + (b - a));
        System.out.println("Multiply: " + (a * b));
        System.out.println("Divide: " + (a / b));
    }
}