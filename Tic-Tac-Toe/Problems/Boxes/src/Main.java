import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int[] box1 = new int[3];
        int[] box2 = new int[3];
        for (int i = 0; i < box1.length; i++) {
            box1[i] = scanner.nextInt();
        }
        for (int i = 0; i < box2.length; i++) {
            box2[i] = scanner.nextInt();
        }
        Arrays.sort(box1);
        Arrays.sort(box2);
        int first = 0;
        int second = 0;
        if (box1[0] > box2[0]) {
            first++;
        } else {
            if (box1[0] < box2[0]) {
                second++;
            }
        }
        if (box1[1] > box2[1]) {
            first++;
        } else {
            if (box1[1] < box2[1]) {
                second++;
            }
        }
        if (box1[2] > box2[2]) {
            first++;
        } else {
            if (box1[2] < box2[2]) {
                second++;
            }
        }
        if (first == 3) {
            System.out.println("Box 1 > Box 2");
        } else {
            if (second == 3) {
                System.out.println("Box 1 < Box 2");
            } else {
                System.out.println("Incompatible");
            }
        }
    }
}