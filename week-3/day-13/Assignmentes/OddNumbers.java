//Write a program that prints all odd numbers between 1 and 100. Use the continue statement to skip even numbers. Implement a menu that allows the user to continue or exit the program.
import java.util.Scanner;

public class OddNumbers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 100;
        while (true) {
            System.out.println("1. Print odd numbers between 1 and 100");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    for (int i = 1; i <= n; i++) {
                        if (i % 2 == 0) {
                            continue;
                        }
                        System.out.print(i + " ");
                    }
                    System.out.println();
                    break;
                case 2:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}


