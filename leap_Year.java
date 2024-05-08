package Programing.Day1_5May;

import java.awt.*;
/*leap year is rule
1. divisible by 4 is leap year
2. divisible by 100 is not leap year
3. divisible by 400 is leap year
 */

public class leap_Year {
    public static void main(String[] args) {
        int year =2024;
//        if (year %4==0){
//            if (year%100==0){
//                if (year%400==0){
//                    System.out.println("Its Leap Year ");
//                }else {
//                    System.out.println("Its Not Leap Year ");
//                }
//            }else {
//                System.out.println("Its Leap Year ");
//            }
//        }else {
//            System.out.println("Its Not leap year");
//        }

        if (year %4==0 || year%400==0){
            System.out.println("Its Leap Year");
        }
        else {
            System.out.println("its not leap year");
        }
    }
}
