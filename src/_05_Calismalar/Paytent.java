package _05_Calismalar;

public class Paytent {
    public static void main(String[] args) {

        int[] array= {1, 3, 5, 7, 9,11, 13, 15, 17, 19,23,25,27,29};
        System.out.println(getNumber(array));

    }
    public static int getNumber(int[] array){

        int num=0;
        for (int i = 1; i < array.length ; i++) {

            if(array[i]-array[i-1]!=2){
                num=(array[i]-2);

            }

        }
        return num;
    }
}
