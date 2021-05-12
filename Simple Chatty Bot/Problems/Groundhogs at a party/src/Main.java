import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int numberOfCups = scanner.nextInt();
        boolean weekend = scanner.nextBoolean();
        if (weekend) {
            System.out.println(numberOfCups >= 15 && numberOfCups <= 25);
        } else {
            System.out.println(numberOfCups >= 10 && numberOfCups <= 20);
        }

    }
}