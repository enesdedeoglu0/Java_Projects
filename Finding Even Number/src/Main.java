//ENES DEDEOĞLU 25.03.2023

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("LUTFEN BIR SAYI GIRINIZ :  ");
        int gsayi = input.nextInt(), k=1, toplam = 0, Cift_Sayı_Adeti = 0;

        while (k < gsayi && gsayi> 0) {
            k++;
            if(k % 12 == 0) {
                toplam += k;
                Cift_Sayı_Adeti++;
            }
        }
        double average = toplam / Cift_Sayı_Adeti;
        System.out.print(" 3 VE 4 E TAM BOLUNEN SAYILARIN ORTALAMASI  " + average);
    }
}