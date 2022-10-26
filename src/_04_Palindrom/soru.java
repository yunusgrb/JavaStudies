package _04_Palindrom;

import java.util.Scanner;

public class soru {
    public static void main(String[] args) {


        String inputString;
        Scanner in = new Scanner(System.in);

        System.out.println("Stringi girin");
        inputString = in.nextLine();

        int length  = inputString.length();
        int i, begin, end, middle;

        begin  = 0;
        end    = length - 1;
        middle = (begin + end)/2;

        for (i = begin; i <= middle; i++) {
            if (inputString.charAt(begin) == inputString.charAt(end)) {
                begin++;
                end--;
            }
            else
                break;
        }
        if (i == middle+1)
            System.out.println("Palindrom");
        else
            System.out.println("Palindrom değil");
    }
}
