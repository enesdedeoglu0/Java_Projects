// ENES DEDEOĞLU 25.03.2023

import java.util.Scanner;

class AtmUygulamasi {
    public static void main(String[] args) {
        String sifre , kullanici;
        int yanlishakki=3 , secim=0 ;
        double bakiye=1500 ,temp = 0;

        boolean isTrue=true;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("LUTFEN KULLANICI ADINIZI GIRINIZ  :");
            kullanici = input.nextLine();

            System.out.print("LUTFEN SIFRENIZI GIRINIZ :");
            sifre = input.nextLine();

            if (kullanici.equals("enesdedeoglu") && sifre.equals("dede")){

                System.out.println("GIRIS BASARILI :)");
                while(isTrue){

                    System.out.println("LUTFEN YAPMAK ISTEDIGINIZ ISLEMI SECIN : ");
                    System.out.println("1- PARA CEKME \n2- PARA YATIRMA \n3- BAKIYE SORMA \n4-CIKIS YAPMA");
                    secim=input.nextInt();

                    switch(secim) {

                        case 1:
                            System.out.println("BAKIYENIZ :" + bakiye + " " + "\nNE KADAR CEKMEK ITIYORSUNUZ ?");
                            temp = input.nextDouble();
                            if (temp > bakiye ){
                                System.out.println("UZGUNUZ BU KADAR BAKIYENIZ YOK :(");
                            }else {
                                bakiye -= temp;
                                System.out.println("KALAN BAKIYENIZ  :" + bakiye );}
                            break;

                        case 2:
                            System.out.println("BAKIYENIZ:" + bakiye + " " + "\nNE KADAR YATIRMAK ISTIYORSUNUZ ?");
                            temp = input.nextDouble();
                            bakiye += temp;
                            System.out.println("YENI BAKIYENIZ :" + bakiye );
                            break;

                        case 3:
                            System.out.println("BAKIYENIZ  :" + bakiye);
                            break;

                        case 4:
                            System.out.println("CIKIS YAPILIYOR BIZI TECIH ETTIGINIZ ICIN TESEKKURLER  :) ");
                            isTrue=false;

                            break;

                        default:
                            System.out.println("YANLIS GIRIS YAPTINIZ ");

                    }
                }
                break;
            }else {
                yanlishakki--;
                if (yanlishakki == 0 )
                {
                    System.out.println("3 TANE HATALI GIRIS YAPTINIZ KARTINIZ BLOKE OLDU LUTFEN SUBE ILE ILETISIME GECINIZ. :(");
                    break;
                }
                System.out.println("HATALI GIRIS YAPTINIZ. KALAN HAKKINIZ :  " + yanlishakki);
            }

        }
        while(yanlishakki != 0);



    }
}