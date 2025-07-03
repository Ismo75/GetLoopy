import java.util.Random;
import java.util.Scanner;

public class DieRollar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        String choice;

        do {
            System.out.printf("%-6s\t%-6s\t%-6s\t%-6s\t%-6s\n", "Roll", "Die1", "Die2", "Die3", "Sum");
            System.out.println("------------------------------------------------------------");

            int rollCount = 0;
            while (true) {
                rollCount++;
                int die1 = rand.nextInt(6) + 1;
                int die2 = rand.nextInt(6) + 1;
                int die3 = rand.nextInt(6) + 1;
                int sum = die1 + die2 + die3;

                System.out.printf("%-6d\t%-6d\t%-6d\t%-6d\t%-6d\n", rollCount, die1, die2, die3, sum);

                if (die1 == die2 && die2 == die3) {
                    break;
                }
            }

            System.out.print("\nThrow again? (y/n): ");
            choice = scanner.nextLine().trim().toLowerCase();
            System.out.println();

        } while (choice.equals("y"));

        System.out.println("Thanks for playing!");
        scanner.close();
    }
}