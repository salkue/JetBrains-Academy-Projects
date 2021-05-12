import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int max = 0;
        int current = 0;
        for (int i = 0; i <= n - 1; i++) {
            current = scanner.nextInt();
            if (current % 4 == 0 && current > max) {
                max = current;
            }
        }
        System.out.println(max);
    }
}