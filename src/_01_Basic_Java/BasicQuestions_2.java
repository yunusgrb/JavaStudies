package _01_Basic_Java;

import java.util.Arrays;
import java.util.Scanner;

public class BasicQuestions_2 {
    public static void main(String[] args) {

        //Girilen 3 sayıdan büyük olanı yazdırınız

        Scanner sc= new Scanner(System.in);
        int[] numbers=new int[3];
        int biggestNum=0;
        for (int i = 0; i < 3; i++) {
            System.out.print((i+1)+". number: ");
            numbers[i]=sc.nextInt();
            if (numbers[i]>biggestNum){
                biggestNum=numbers[i];
            }
        }
        System.out.println("numbers = " + Arrays.toString(numbers));
        System.out.println("biggestNum = " + biggestNum);

        // Girilen bir sayının birler ve onlar basamağının hem tek hem de eşit olup oladığını kontrol ediniz.

        System.out.print("Enter a number: ");
        int num1=sc.nextInt();
        int birler=num1%10;
        int birlerOddEven=birler%2;
        num1=num1/10;
        int onlar=num1%10;
        int onlarOddEven=onlar%2;

        if (birler==onlar && birlerOddEven==1)
            System.out.println("Both equal and odd numbers");
        if (birler==onlar && birlerOddEven==0)
            System.out.println("Equal but not odd");
        if (birler!=onlar)
            System.out.println("not equal");


        // Girilen Bir öğrencinin notunu belirleyen bir Java programı yazın.
        // Program üç tür puan (sınav, ara sınav ve final puanı) okuyacak ve notu aşağıdaki
        // kurallara göre belirleyecektir:
        // Eğer ortalama not >=90 =>not=A
        // Eğer ortalama not >= 70 ve<90 => not=B
        // Eğer ortalama not >=50 ve <70 =>not=C
        // Eğer ortalama not <50 =>note=F
        // Aşağıdaki örnek çıktıya bakın:
        // int Quiz_score: 80
        // int mid_term_score: 68
        // int Final_score: 90
        // print (Your grade is B)
        // (Notunuz B'dir)

        System.out.print("First exam note= ");
        double note1=sc.nextInt();
        System.out.print("Second exam note= ");
        double note2=sc.nextInt();
        System.out.print("Final exam note= ");
        double noteFinal=sc.nextInt();
        double avg= (note1+note2+noteFinal)/3;
        if (avg>=90) System.out.println("Your grade is A");
        if (avg>=70 && avg<90) System.out.println("Your grade is B");
        if (avg>=50 && avg<70) System.out.println("Your grade is C");
        else System.out.println("Your grade is F, failed");


    }
}
