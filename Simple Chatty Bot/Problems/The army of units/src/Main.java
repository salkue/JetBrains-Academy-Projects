import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number >= 1000) {
            System.out.println("legion");
        } else if (number >= 250 && number <= 999) {
            System.out.println("zounds");
        } else if (number >= 20 && number <= 249) {
            System.out.println("throng");
        } else if (number >= 1 && number <= 19) {
            System.out.println("pack");
        } else {
            System.out.println("no army");
        }
    }
}