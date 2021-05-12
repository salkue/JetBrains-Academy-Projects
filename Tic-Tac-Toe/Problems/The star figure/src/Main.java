import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[][] star = new String[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                star[i][j] = ".";
                if (i == n / 2 || j == n / 2) {
                    star[i][j] = "*";
                } else {
                    if (i == j) {
                        star[i][j] = "*";
                    } else {
                        if (j == n - 1 - i) {
                            star[i][j] = "*";
                        }

                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(star[i][j] + " ");
            }
            System.out.println();
        }
    }
}
