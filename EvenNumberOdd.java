package Programing.Day1_5May;

import java.util.Scanner;
//Even Number is Divisible by 0 and Odd Number is not  Divisible by 0
public class EvenNumberOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number :");
       int number =  sc.nextInt();
       if (number %2==0){
           System.out.println("Number is Even");
       }else {
           System.out.println("Number is Odd");
       }
    }
}
