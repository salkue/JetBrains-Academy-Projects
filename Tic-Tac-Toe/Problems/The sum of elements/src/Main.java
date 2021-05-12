import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int current = 0;
        while (scanner.hasNext()) {
            current = scanner.nextInt();
            if (current != 0) {
                sum += current;
            } else {
                System.out.println(sum);
                sum = 0;
                break;
            }
        }
    }
}