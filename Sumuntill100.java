import java.util.Scanner;

public class Sumuntill100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers(Sum will stop when it exceeds 100):");
        int sum = 0;
        while (sum <= 100) {
            System.out.print("Enter number:");
            int number = scanner.nextInt();
            sum += number;

        }
        System.out.println("Done! The total sum exceeded 100.");
        scanner.close();
    }
}