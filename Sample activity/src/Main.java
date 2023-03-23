//ENES DEDEOĞLU 23.03.2023

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int heat;
        Scanner input = new Scanner(System.in);
        System.out.print(" LUTFEN BIR SICAKLIK DEGERI GIRNIZ  ");
        heat = input.nextInt();

        if (heat > 25) {
            System.out.print("OO HAVA COK GUZEL HADI SAHILE GIDELIM ");
        }else if (heat > 15) {
            System.out.print(" SUCUK EKMEK MANGAL YAPMANIN TAM SIRASI HAYDI PIKNIGE ");
        }else if (heat < 15 && heat > 5) {
            System.out.print(" YENI FILM CIKMIS HADI ONA GIDELIM");
        }else {
            System.out.print(" ULUDAĞA GITMENIN TAM SIRASI ");
        }
    }
}