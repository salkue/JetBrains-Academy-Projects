import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String first = scanner.nextLine();
        String[] firstSplited = first.split(" ");
        int[] numbers = new int[firstSplited.length];
        for (int i = 0; i < firstSplited.length; i++) {
            numbers[i] = Integer.parseInt(firstSplited[i]);
        }
        int n = scanner.nextInt();
        int[] result = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            if (n > numbers.length) {

                if (i + n % numbers.length < numbers.length) {
                    result[i + n % numbers.length] = numbers[i];
                } else {
                    result[i + (n % numbers.length) - numbers.length] = numbers[i];
                }
            } else {
                if (i + n < numbers.length) {
                    result[i + n] = numbers[i];
                } else {
                    result[i + n - numbers.length] = numbers[i];
                }
            }
        }
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}