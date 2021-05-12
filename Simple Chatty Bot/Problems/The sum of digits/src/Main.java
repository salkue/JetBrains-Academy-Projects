import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int input = scanner.nextInt();
        int number1 = input / 100;
        int number2 = (input - number1 * 100) / 10;
        int number3 = input - number1 * 100 - number2 * 10;
        System.out.println(number1 + number2 + number3);
    }
}