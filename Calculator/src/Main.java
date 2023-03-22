//ENES DEDEOĞLU 22.03.2023

import java.util.Scanner;
 class HesapMakinesi {
    public static void main(String[] args) {
        int no1,no2,secim;
        double sonuc;

        Scanner input = new Scanner(System.in);

        System.out.println("LUTFEN ILK SAYIYI GIRINIZ  :");
        no1 = input.nextInt();

        System.out.println("LUTFEN IKINCI SAYIYI GIRINIZ :");
        no2 = input.nextInt();
        System.out.println("LUTFEN HANGI ISLEMI YAPMAK ISTEDIGINIZI SECINIZ ");

        System.out.println("1-TOPLAMA\n2-ÇIKARMA\n3-ÇARPMA\n4-BÖLME");
        secim = input.nextInt();

        switch(secim) {

            case 1:
                sonuc = no1 + no2;
                System.out.println("İşlemin sonucu : " + sonuc);
                break;

            case 2:
                sonuc = no1 - no2;

                System.out.println("İşlemin sonucu : " + sonuc);
                break;

            case 3:
                sonuc = no1 * no2;
                System.out.println("İşlemin sonucu : " + sonuc);
                break;

            case 4:
                if (no2 == 0) {
                    System.out.println("MAT ERROR (BIR SAYI SIFIRA BOLUNEMEZ !");
                    break;
                }

                else{
                    sonuc = no1 / no2;
                    System.out.println("İşlemin sonucu : " + sonuc);
                }

                break;
            default:
                System.out.println("HATALI GIRIS YAPTINIZ ");
        }


    }
}