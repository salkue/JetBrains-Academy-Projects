import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        System.out.println(number1 / 2 + number1 % 2 + number2 / 2
                + number2 % 2 + number3 / 2 + number3 % 2);

    }
}