import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[100];
        int count = 0;
        int input;
        do {
            System.out.print("Enter a number (-1 to exit and output): ");
            input = scanner.nextInt();
            if (input != -1) {
                numbers[count] = input;
                count++;
            }

        } while (input != -1);
        for (int i = 0; i < count; i++) {
            System.out.println("==========Output===========");
            System.out.println("Number " + (i + 1) + ": " + numbers[i]);
        }
    }
}