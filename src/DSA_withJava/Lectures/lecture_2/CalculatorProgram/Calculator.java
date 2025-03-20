package DSA_withJava.Lectures.lecture_2.CalculatorProgram;

import java.util.Scanner;


public class Calculator {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int ans = 0;
        while (true) {
            System.out.print("Enter the operator : ");
            char ch = in.next().trim().charAt(0);
            if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%') {
                System.out.print(" Enter two numbers : ");
                int num1 = in.nextInt();
                int num2 = in.nextInt();
                System.out.println();

                if (ch == '+') {
                    ans = num1 + num2;
                }
                if (ch == '-') {
                    ans = num1 - num2;
                }
                if (ch == '*') {
                    ans = num1 * num2;
                }
                if (ch == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    }
                }
                if (ch == '%') {
                    ans = num1 % num2;
                } else if (ch == 'x' || ch == 'X') {
                    break;
                } else {
                    System.out.println(" invalid operation");
                }
            }
            System.out.println(ans);
        }
    }
}