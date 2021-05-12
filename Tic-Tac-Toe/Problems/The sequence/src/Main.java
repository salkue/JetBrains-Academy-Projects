import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        int current;
        while (scanner.hasNext()) {
            current = scanner.nextInt();
            if (current % 4 == 0 && current > max) {
                max = current;
            }
        }
        System.out.println(max);
    }
}