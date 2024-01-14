import java.util.Scanner;

class E07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Which multiplicand multiplication table to show?");
        int multiplicand = scanner.nextInt();

        System.out.println("Until which multiplier?");
        int multiplierLimit = scanner.nextInt();

        for (int i = 1; i <= multiplierLimit; i++) {
            System.out.println(i + " x " + multiplicand + " = " + (i * multiplicand));
        }

        scanner.close();
    }
}