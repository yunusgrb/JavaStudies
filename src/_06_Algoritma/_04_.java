package _06_Algoritma;

import java.util.Scanner;

public class _04_ {
    public static void main(String[] args) {

//        - Girilen pozitif bir sayının tam kare olup olmadığını bulunuz, tam kare ise true değilse false
//        yazdırınız.
//        Not: sqrt gibi fonksiyonları kullanmayın.
//        Example 1:
//        Input: 16
//        Output: true
//        Not: bu sayı tam kare çünkü 4*4 = 16
//        Example 2:
//        Input: 14
//        Output: false (14 tam kare degil)

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number = ");

        int number = sc.nextInt();
        int i = 1;
        int fullFrame = 0;
        while (i < number) {
            i++;
            if (i * i == number) {
                fullFrame = i;
                System.out.println("This number is a perfect square because " + fullFrame + "*" + fullFrame + " = " + number);
                break;
            }
        }
        if (fullFrame <= 0)
            System.out.println(number + " is not perfect square");
    }
}
