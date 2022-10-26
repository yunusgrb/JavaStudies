package _05_Calismalar;

import java.util.Scanner;

public class EKOK {
    public static void main(String[] args) {

        // Kullanıcıdan 2 tane sayı alarak bu sayıların
        // en küçük ortak katlarını (EKOK) dönen bir tane fonksiyon yazın.
        Scanner sc= new Scanner(System.in);
        System.out.println("1.num= ");
        int a= sc.nextInt();
        System.out.println("2.num= ");
        int b = sc.nextInt();
        ekokAl(a,b);





    }
    static void ekokAl(int a, int b){
        int ekok=1;
        for (int i = Math.max(a,b); i <(a*b)+1; i++) {
            if (i%a==0 && i%b==0){
                ekok=i;
                break;
            }

        }
        System.out.println("Ekok= " + ekok);



    }
}
