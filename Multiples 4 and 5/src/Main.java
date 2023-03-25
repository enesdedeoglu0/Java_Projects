// ENES DEDEOĞLU 25.03.2023

import java.util.Scanner;

 class Döngü {
    public static void main(String[] args){
        int gsayi;
        int toplam=0;
        Scanner x = new Scanner(System.in);
        do{
            System.out.print("LUTFEN SAYI GIRINIZ :  ");
            gsayi=x.nextInt();
            if((gsayi % 2 == 0) && (gsayi % 4 == 0)){
                toplam+=gsayi;
            }
        }while(gsayi%2 == 0);
        System.out.println("TOPLAM : " +toplam);
    }
}