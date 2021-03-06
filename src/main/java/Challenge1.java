/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 David Santamaria
 */
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 David Santamaria
 */
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class Challenge1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int first, second;
        do {
            try {
                System.out.print("What is the first number?");
                first = in.nextInt();
                System.out.print("What is the second number?");
                second = in.nextInt();
                break;
            } catch (InputMismatchException e) {
                in.nextLine();
                System.out.println("Input must be a number!");
            }
        } while (true);
        System.out.printf("%d + %d = %d\n", first, second, first + second);
        System.out.printf("%d - %d = %d\n", first, second, first - second);
        System.out.printf("%d * %d = %d\n", first, second, first * second);
        System.out.printf("%d / %d = %d\n", first, second, first / second);
    }
}