import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int bridge = scanner.nextInt();
            if (height >= bridge) {
                System.out.println("Will crash on bridge " + (i + 1));
                break;
            }
//            System.out.println("i=" + i + " n=" + n);
            if (i == n - 1) {
                System.out.println("Will not crash");
            }
        }
    }
}
