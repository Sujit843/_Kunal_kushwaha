package DSA_withJava.Lectures.lecture_2.CaseCheck;

import java.util.Scanner;

public class Alphabet {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
         char ch = in.next().trim().charAt(0);

         if (ch >= 'a' && ch <= 'z'){
             System.out.println("Lowercase");
         }else {
             System.out.println("Uppercase");
         }
        System.out.println(ch);

        //  && operator (both condition true )
        //  ||  operator (atleast one condition true)

         // Trim() is remove the extra spaces
        // charAt(0) that means give the string at this index (0)

  /*      String word = " hello ";
        System.out.println(word.charAt(0));  // output is the [ h]
        System.out.println(word.charAt(2));  // output is the [ l ]
        */

    }
}
