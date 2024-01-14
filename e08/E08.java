import java.util.Scanner;

class E08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = 1;

        while (number != 0) {
            System.out.println("Give a number (0 to quit):");
            number = scanner.nextInt();

            if (number != 0) {
                String result = (number % 2 == 0) ? "Number is even" : "Number is odd";
                System.out.println(result);
            }
        }

        scanner.close();
    }
}