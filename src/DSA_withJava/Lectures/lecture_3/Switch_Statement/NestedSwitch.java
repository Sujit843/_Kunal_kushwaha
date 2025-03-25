package DSA_withJava.Lectures.lecture_3.Switch_Statement;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {

        Scanner in  = new Scanner(System.in);
                int empId = in.nextInt();
        String department = in.next();
        switch (empId){
            case 1:
                System.out.println("sujit");
                break;
            case 2:
                System.out.println("gautam");
                break;
            case 3:
                switch (department){
                    case "IT":
                        System.out.println("it");
                        break;
                    case "Management":
                        System.out.println("management");
                        break;
                    default:
                        System.out.println("No");

                }

        }
    }
}
