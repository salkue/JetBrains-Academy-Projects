import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        long m = scanner.nextLong();
        long result = 1L;
        int n = 1;
        while (result <= m) {
            result *= n;
            n++;
        }
        System.out.println(n - 1);
    }
}