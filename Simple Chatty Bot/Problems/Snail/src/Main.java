import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int h = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int progress = 0;
        int counter = 0;
        while (progress < h) {
            counter++;
            if (progress + a >= h) {
                break;
            } else {
                progress = progress + a - b;
            }
/*
            System.out.println(progress);
            System.out.println(counter);*/
        }
        System.out.println(counter);
    }
}