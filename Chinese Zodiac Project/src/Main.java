// ENES DEDEOĞLU 24.03.2023

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int birthDay;
        System.out.print(" DOĞUM YILINIZI GIRINIZ :  ");
        birthDay = input.nextInt();
        int kalan = birthDay % 12;

        if (birthDay <= 2023) {
            System.out.print(" Çin Zodyağı Burcunuz: ");
            switch (kalan) {
                case 0:
                    System.out.print(" Maymun ");
                    break;
                case 1:
                    System.out.print(" Horoz ");
                    break;
                case 2:
                    System.out.print(" Köpek ");
                    break;
                case 3:
                    System.out.print(" Domuz ");
                    break;
                case 4:
                    System.out.print(" Fare ");
                    break;
                case 5:
                    System.out.print(" Öküz ");
                    break;
                case 6:
                    System.out.print(" Kaplan ");
                    break;
                case 7:
                    System.out.print(" Tavşan ");
                    break;
                case 8:
                    System.out.print(" Ejderha ");
                    break;
                case 9:
                    System.out.print(" Yılan ");
                    break;
                case 10:
                    System.out.print(" At ");
                    break;
                default:
                    System.out.print(" Koyun ");}
        }
        else System.out.print(" Lütfen 2023 ve öncesi bir yıl giriniz. ");

    }
}