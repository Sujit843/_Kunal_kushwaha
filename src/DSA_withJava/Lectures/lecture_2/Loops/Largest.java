package DSA_withJava.Lectures.lecture_2.Loops;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        // Q: find the largest of the 3 numbers
        int max = a;
        if (b > max){
            max = b;
        }
    if ( c > max ){
        max = c;
    }
        System.out.println("The max numbers is : " + max);

    int max2 = Math.max(c, Math.max(a,b));
        System.out.println(max2);
    }
}
