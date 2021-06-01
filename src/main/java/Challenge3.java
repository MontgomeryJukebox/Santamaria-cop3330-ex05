import java.util.Scanner;

public class Challenge3 {
    public static void printAddition(int a, int b) {
        System.out.printf("%d + %d = %d\n", a, b, a + b);
    }
    public static void printSubtraction(int a, int b) {
        System.out.printf("%d - %d = %d\n", a, b, a - b);
    }
    public static void printMultiplication(int a, int b) {
        System.out.printf("%d * %d = %d\n", a, b, a * b);
    }
    public static void printDivision(int a, int b) {
        System.out.printf("%d / %d = %d\n", a, b, a / b);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("What is the first number?");
        int first = Integer.parseInt(in.next());
        System.out.println("What is the second number?");
        int second = Integer.parseInt(in.next());
        printAddition(first, second);
        printSubtraction(first, second);
        printMultiplication(first, second);
        printDivision(first, second);
    }
}
