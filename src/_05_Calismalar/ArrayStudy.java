package _05_Calismalar;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayStudy {
    public static void main(String[] args) {

        // Bir öğretmenden girmek istediği kadar notu alınız, ve
        // ortalamayı geçen öğrenci sayısını bulunuz.
        // Öğretmene devam etmek istiyormusunuz (E/H) şeklinde sorunuz

        Scanner sc= new Scanner(System.in);
        Scanner scStr= new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();

        String devamMi="";
        int toplam=0;

        do {
            System.out.print("Not giriniz=");
            int not=sc.nextInt();
            list.add(not);
            toplam+=not;
            System.out.print("Devam etmek istiyor musunuz?(E/H)=");
            devamMi=scStr.nextLine();

        }while (devamMi.equalsIgnoreCase("e"));
        System.out.println(list);

        System.out.println("ort="+toplam/list.size());


    }
}
