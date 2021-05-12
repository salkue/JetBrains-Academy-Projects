import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] input = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                input[i][j] = scanner.nextInt();
            }
        }
        int counterI = 0;
        int[][] output = new int[m][n];
        for (int j = 0; j < m; j++) {
            int counterJ = 0;
            for (int i = n - 1; i >= 0; i--) {
                output[counterI][counterJ] = input[i][j];
                System.out.print(output[counterI][counterJ] + " ");
                counterJ++;
            }
            System.out.println();
            counterI++;
        }
    }
}