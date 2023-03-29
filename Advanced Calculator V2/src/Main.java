//ENES DEDEOĞLU 29.03.2023

import java.util.Scanner;

class GelismisHesapMakinesi {

    static void toplama() {
        Scanner scan = new Scanner(System.in);
        int number, result = 0, i = 1;
        while (true) {
            System.out.print(i++ + ". SAYI:");
            number = scan.nextInt();
            if (number == 0) {
                break;
            }
            result += number;
        }
        System.out.println("SONUC : " + result);
    }

    static void cıkarma() {
        Scanner scan = new Scanner(System.in);
        System.out.print("KAC ADET SAYI GIRECEKSINIZ  :");
        int counter = scan.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". SAYI :");
            number = scan.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }

        System.out.println("SONUC: " + result);
    }

    static void carpma() {
        Scanner scan = new Scanner(System.in);
        int number, result = 1, i = 1;

        while (true) {
            System.out.print(i++ + ". sayı :");
            number = scan.nextInt();

            if (number == 1)
                break;

            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }

        System.out.println("SONUC : " + result);
    }

    static void bölme() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = scan.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = scan.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("Böleni 0 giremezsiniz.");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }

        System.out.println("SONUC : " + result);
    }

    static void usalma() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değeri giriniz :");
        int base = scan.nextInt();
        System.out.print("Üs değeri giriniz :");
        int exponent = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("SONUC : " + result);
    }

    static void faktöriyel() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz :");
        int n = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("SONUC : " + result);
    }
    static void dikdörtgenhesap() {
        Scanner scan = new Scanner(System.in);
        System.out.print("DIRTDORTGEN KISA KENARI GIRINIZ :");
        int kkenar = scan.nextInt();

        System.out.print("DIRTDORTGEN UZUN KENARI GIRINIZ :");
        int ukenar = scan.nextInt();

        System.out.println("DIKDORTGENIN ALANI  : " + kkenar*ukenar);
        System.out.println("DIKDORTGENIN CEVRESI  : " + ((kkenar*2) + (2*ukenar)));

    }
    static void modalma() {
        Scanner scan = new Scanner(System.in);
        System.out.print("LUTFEN SAYI GIRINIZ  :");
        int n = scan.nextInt();
        System.out.print("LUTFEN SAYI GIRINIZ  :");
        int x = scan.nextInt();

        System.out.println("SAYILARINIZ MODU : " +  n % x );




    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        String menu = "1- TOPLAMA ISLEMI \n"
                + "2- CIKARMA ISLEMI \n"
                + "3- CARPMA  ISLEMI \n"
                + "4- BOLME  ISLEMI i\n"
                + "5- USLU SAYI HESAPLAMA\n"
                + "6- FAKTORIYEL HESAPLAMA \n"
                + "7- MOD ALMA\n"
                + "8- DIKDORTGEN ALAN VE CEVRE HESABI\n"
                + "0- CIKIS YAP";

        do {
            System.out.println(menu);
            System.out.print("LUTFEN BIR ISLEM SECINIZ :");
            select = scan.nextInt();
            switch (select) {
                case 1:
                    toplama();
                    break;
                case 2:
                    cıkarma();
                    break;
                case 3:
                    carpma();
                    break;
                case 4:
                    bölme();
                    break;
                case 5:
                    usalma();
                    break;
                case 6:
                    faktöriyel();
                    break;
                case 7:
                    modalma();
                    break;
                case 8:
                    dikdörtgenhesap();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("YANLIS BIR ISLEM GIRDINIZ. LUTFEN TERAR DENEINIZ ");
            }
        } while (select != 0);


    }
}