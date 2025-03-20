package DSA_withJava.Lectures.lecture_2.Loops;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {


    /*
      Syntax of for loop:

      for (initialisation; conditions ; increment / decrement ) {
      // body
      }
*/

    //  Q : Print numbers from  1 to 5
//for (int num = 1; num<= 5; num++){
//    System.out.println(num);
//}

    // Print numbers from 1 to n
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();

//        for(int num = 1; num <= n; num++){
          //  System.out.print(num + " ");
//            System.out.println("hello");
//        }

        // while loop
        /*
        Syntax:
        while (condition){
        //body
        */

/*
        int num = 1;
        while (num <= 5){
            System.out.println(num);
            num += 1;
        }
*/

        // do while loop
/*
         syntax:
         do {
        // body
          } while (conditions);  */

        int n = 1;
        do {
            System.out.println("hello world");
        }while (n!= 1);
    }
}
