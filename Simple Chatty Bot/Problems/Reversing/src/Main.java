import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int number = scanner.nextInt();
        int part1 = number / 100;
        int part2 = (number - part1 * 100) / 10;
        int part3 = number - part1 * 100 - part2 * 10;
        System.out.println(part3 * 100 + part2 * 10 + part1);

    }
}