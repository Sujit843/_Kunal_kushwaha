package DSA.withJava.Lectures.lecture_1.Input;

import java.util.Scanner;

public class input {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter some input: ");
        int rollNo = input.nextInt();
        System.out.println("Your rollNumber is " + rollNo);
    }
}
