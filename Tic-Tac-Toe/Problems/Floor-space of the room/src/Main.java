import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        double pi = 3.14;
        Scanner scanner = new Scanner(System.in);
        String form = scanner.nextLine();
        switch (form) {
            case "triangle":
                double a = scanner.nextDouble();
                double b = scanner.nextDouble();
                double c = scanner.nextDouble();
                double p = (a + b + c) / 2;
                System.out.println(Math.sqrt(p * (p - a) * (p - b) * (p - c)));
                break;
            case "rectangle":
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                System.out.println(a * b);
                break;
            case "circle":
                double r = scanner.nextInt();
                System.out.println(pi * Math.pow(r, 2));
                break;
            default:
                System.out.println("error!");
                break;

        }
    }
}