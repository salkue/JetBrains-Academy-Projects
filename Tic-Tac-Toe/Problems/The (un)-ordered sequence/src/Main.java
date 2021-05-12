
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);
        boolean asc = true;
        boolean desc = true;
        int prevDesc = scanner.nextInt();
        int prevAsc = prevDesc;
        while (scanner.hasNext()) {
            int input = scanner.nextInt();
            if (input == 0) {
                break;
            }
            if (prevAsc > input) {
                asc = false;
            } else {
                prevAsc = input;
            }
            if (prevDesc < input) {
                desc = false;
            } else {
                prevDesc = input;
            }
        }
        if (asc || desc) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}