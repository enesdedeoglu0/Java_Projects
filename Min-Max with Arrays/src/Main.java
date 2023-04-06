//ENES DEDEOĞLU 6.04.2023

import java.util.Arrays;
import java.util.Scanner;

 class MinMax {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("LUTFEN BIR SAYI GIRINIZ  :  ");
        int sayi= scan.nextInt();

        int[] numbers={15,12,788,1,-1,-778,2,0};
        Arrays.sort(numbers);
        int Max=0, Min=0;

        for(int a:numbers){
            if (sayi<a){
                Max=a;
                System.out.println("GIRILEN SAYIDAN BUYUK EN YAKIN SAYI :"+Max);
                break;
            }
        }
        for (int i=numbers.length-1; i>0; i--){
            if (sayi>numbers[i]){
                Min=numbers[i];
                System.out.println("GIRILEN SAYIDAN KUCUK EN YAKIN SAYI:"+Min);
                break;
            }
        }
    }
}