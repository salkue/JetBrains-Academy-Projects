import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        if (text.substring(0, 1).equalsIgnoreCase("j")) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}