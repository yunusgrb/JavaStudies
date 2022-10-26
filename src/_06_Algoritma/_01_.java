package _06_Algoritma;

import java.util.Scanner;

public class _01_ {
    public static void main(String[] args) {

        //     3- Girilen bir string de kaç tane b harfi olduğunu yazdırınız.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence or word = ");
        String enteded = sc.nextLine();
        String smallLetter = enteded.toLowerCase();
        int piece = 0;
        for (int i = 0; i < smallLetter.length(); i++) {
            if (smallLetter.charAt(i) == 'b')
                piece++;
        }
        System.out.println("There ara "+piece+" letters B");
    }
}
