import java.util.Scanner;

class E09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0;
        int count = 0;

        while (true) {
            System.out.println("Give a test score (-1 to quit):");
            int score = scanner.nextInt();

            if (score == -1) {
                break;
            }
            total += score;
            count++;

            double average = total / count;
            System.out.println("Average: " + average);
        }

        scanner.close();
    }
}