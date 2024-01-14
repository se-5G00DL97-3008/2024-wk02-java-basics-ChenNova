import java.util.Scanner;

class E02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give a number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Give another number: ");
        double num2 = scanner.nextDouble();

        double sum = num1 + num2;
        double product = num1 * num2;
        double difference = num1 - num2;

        double quotient;
        if (num2 != 0) {
            quotient = num1 / num2;
        } else {
            quotient = Double.NaN;
        }

        System.out.println(num1 + " + " + num2 + " = " + sum);
        System.out.println(num1 + " * " + num2 + " = " + product);
        System.out.println(num1 + " - " + num2 + " = " + difference);
        System.out.println(
                num1 + " / " + num2 + " = " + (Double.isNaN(quotient) ? "Undefined (division by zero)" : quotient));

        scanner.close();
    }
}