package _06_Algoritma;

import java.util.Scanner;

public class _02_ {
    public static void main(String[] args) {

//        5- Girilen bir sayının faktöriyel değerini bulmak için bir program yazın.
//                number:6
//        factorial:1*2*3*4*5*6=720
//        output ---> 720
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number = ");
        int number = sc.nextInt();
        int total = 1;
        for (int i = 1; i <= number; i++) {
            total = total * i;

        }
        System.out.println(number + " Factorial = " + total);
    }
}
