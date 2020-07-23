import java.util.Scanner;

public class homework3task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Веедите n: ");
        int n = scanner.nextInt();
        int count = 0;
        int sum = 0;

        for (int i = 1; count < n; i++) {
            if (i % 3 == 0) {
                sum += i;
                count++;
            }
        }
        System.out.println("сумма " + sum);
    }
}