package _03_Algoritma;

import java.util.Scanner;

public class _07_ikiSayiArasiRandom {
    public static void main(String[] args) {

        //      10- Girilen 2 sayı arasında Random integer sayı üreten programı yazınız.

        Scanner read = new Scanner(System.in);
        System.out.print("Enter the smaller number = ");
        int number1 = read.nextInt();
        System.out.print("Enter the larger number = ");
        int number2 = read.nextInt();
        int mixer = (int) (Math.random() * ((number2 - number1) + 1) + number1);
        System.out.println("Random number = " + mixer);


    }
}
