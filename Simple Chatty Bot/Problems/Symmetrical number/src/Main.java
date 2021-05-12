import java.util.Random;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        Random random = new Random();
//        System.out.println(number % 100 / 10);
//        System.out.println(number / 100 % 10);

        if (number / 100 % 10 == 0) {
            if (number % 10 == number / 1000) {
                System.out.println(1);
            } else {
                System.out.println(random.nextInt());
            }
        } else if (number % 10 == number / 1000 && number % 100 / 10 == number / 100 % 10) {
            System.out.println(1);
        } else {
            System.out.println(random.nextInt());
        }
    }
}
