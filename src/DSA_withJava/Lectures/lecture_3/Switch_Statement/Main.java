package DSA_withJava.Lectures.lecture_3.Switch_Statement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String  fruits = in.next();
         switch (fruits){
             case "Mango":
                 System.out.println("The kong of fruits");
                 break;
             case "apple":
                     System.out.println(" A red color");
                     break;
             case "orange":
                         System.out.println("A round fruits");
                         break;
             default:
                 System.out.println(" please enter valid ");
         }
    int day = in.nextInt();
         switch (day){
             case 1-> System.out.println("mon..");
             case 2-> System.out.println("tue..");
             case 3-> System.out.println("wed..");
             case 4-> System.out.println("thus..");
             case 5-> System.out.println("fri..");

             // new style
         }

        }
    }


