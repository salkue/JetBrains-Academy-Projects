import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        long sum = 1L;
        for (int i = a; i < b; i++) {
            sum = sum * i;
        }
        System.out.println(sum);
    }
}