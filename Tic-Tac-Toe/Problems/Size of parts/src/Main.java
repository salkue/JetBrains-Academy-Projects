import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int larger = 0;
        int smaller = 0;
        int perfect = 0;
        int part;
        for (int i = 0; i < n; i++) {
            part = scanner.nextInt();
            if (part == 1) {
                larger++;
            } else {
                if (part == -1) {
                    smaller++;

                } else {
                    perfect++;
                }
            }
        }
        System.out.println(perfect + " " + larger + " " + smaller);
    }
}