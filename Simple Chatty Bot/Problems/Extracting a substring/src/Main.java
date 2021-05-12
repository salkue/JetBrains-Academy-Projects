import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        System.out.println(string.substring(first, second + 1));
    }
}