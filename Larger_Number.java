package Programing.Day1_5May;

public class Larger_Number {
    public static void main(String[] args) {
        int a = 133;
        int b= 95;
        int c= 76;
        if(a>b && a>c){
            System.out.println("large Number is "+ a);
        }else if (b>a  && b>c){
            System.out.println("large Number is "+ b);
        }else {
            System.out.println("large Number is "+c);
        }
    }
}
