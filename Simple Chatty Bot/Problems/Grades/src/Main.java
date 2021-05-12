import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int countD = 0;
        int countC = 0;
        int countB = 0;
        int countA = 0;
        for (int i = 0; i < n; i++) {
            int currentGrade = scanner.nextInt();
            if (currentGrade == 2) {
                countD++;
            } else if (currentGrade == 3) {
                countC++;
            } else if (currentGrade == 4) {
                countB++;
            } else {
                countA++;
            }
        }
        System.out.println(countD + " " + countC + " " + countB + " " + countA);
    }
}