import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int nextNumber = 0;
        int sum = 0;
        for (int i = 0; i <= count - 1; i++) {
            nextNumber = scanner.nextInt();
            if (nextNumber % 6 == 0) {
                sum = sum + nextNumber;
            }
        }
        System.out.println(sum);
    }
}