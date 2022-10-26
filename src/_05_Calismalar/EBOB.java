package _05_Calismalar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class EBOB {
    public static void main(String[] args) {

        //Kullanıcıdan 2 tane sayı alarak bu sayıların en büyük ortak bölenini
        // (EBOB) dönen bir tane fonksiyon yazın.
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.print("1. num= ");
        int num1=sc.nextInt();
        System.out.print("2. num= ");
        int num2= sc.nextInt();

        Ebob(list,num1,num2);

    }

    static void Ebob(ArrayList<Integer> list,int a, int b) {


        for (int i = 1; i < (Math.min(a, b) + 1); i++) {
            if (a % i == 0 && b % i == 0)
                list.add(i);
        }
        System.out.println(Arrays.toString(list.toArray()));
        int max = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (max < list.get(i)) max = list.get(i);
        }
        System.out.println("EBOB= "+ max);

    }
}
