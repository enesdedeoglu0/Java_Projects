// ENES DEDEOĞLU 7.04.2023

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int j = 0;
        System.out.print("DIZININ BOYUTU  : ");
        int number = sc.nextInt();
        int[] list = new int[number];
        System.out.println("DIZININ ELEMANLARINI GIRINIZ :");
        for (int i = 0; i < list.length; i++) {
            j ++;

            System.out.print(j +"."+" ELEMAN : ");
            int numbers = sc.nextInt();
            list[i] =  numbers;
        }
        Arrays.sort(list);
        System.out.println("SIRALAMA : "+ Arrays.toString(list)+" ");

    }

}