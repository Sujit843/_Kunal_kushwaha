package DSA.withJava.Lectures.lecture_1.Input;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        // yaha scanne he input ke liye
        // input hame kaha se lena he file , document , keyboard eta.
        // ham yaha keyboard se lenge isiliye (System.in)  likha he
        // new word creating a new object

        Scanner input = new Scanner(System.in);
       System.out.println(input.nextInt());
        // only input pass in integer
       System.out.println(input.next());
        // pass the string in input only first word

        System.out.println(input.nextLine());
     // pass the input full line
    }
}
