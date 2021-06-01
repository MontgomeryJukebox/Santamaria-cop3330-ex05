import java.util.Scanner;

public class Challenge2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int first, second;
        do {
            System.out.print("What is the first number?");
            first = Integer.parseInt(in.next());
            System.out.println("What is the second number?");
            second = Integer.parseInt(in.next());
        } while (first < 0 || second < 0);
        System.out.printf("%d + %d = %d\n", first, second, first + second);
        System.out.printf("%d - %d = %d\n", first, second, first - second);
        System.out.printf("%d * %d = %d\n", first, second, first * second);
        System.out.printf("%d / %d = %d\n", first, second, first / second);
    }
}
