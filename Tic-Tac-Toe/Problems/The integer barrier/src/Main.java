import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (scanner.hasNext()) {
            int number = scanner.nextInt();
            if (number == 0) {
                System.out.println(sum);
                break;
            }
            sum += number;
            if (sum >= 1000) {
                System.out.println(sum - 1000);
                break;
            }
        }
    }
}