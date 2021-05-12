import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String cityName = scanner.nextLine();
        if (cityName.length() > 4) {
            if (cityName.substring(cityName.length() - 4).equals("burg")) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        } else {
            System.out.println("false");
        }
    }
}