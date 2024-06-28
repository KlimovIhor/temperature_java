import java.sql.SQLOutput;
import java.util.Scanner;

public class TemperatureChek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number : ");
        double tempereture = scanner.nextDouble();

        if (tempereture < 0) {
            System.out.println("Cold");

        } else if (tempereture > 0) {
            System.out.println("Hot");
        } else {
            System.out.println("so-so");
        }
        scanner.close();

    }
}