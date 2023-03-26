//ENES DEDEOĞLU 26.03.2023

import java.util.Scanner;

class ekok_ebob {
    public static void main(String[] args) {
        //While Döngüsü ile ebob - ekok

        Scanner scan = new Scanner(System.in);

        int sayi1, sayi2, ebob = 1, ekok, i = 1;

        System.out.println("LUTFEN ILK SAYIYI GIRINIZ  : ");
        sayi1 = scan.nextInt();

        System.out.println("LUTFEN IKINCI  SAYIYI GIRINIZ  : ");
        sayi2 = scan.nextInt();

        while (i <= sayi1) {
            i++;
            if (sayi1 % i == 0 && sayi2 % i == 0) {
                ebob = i;
            }
        }
        System.out.println("SAYILARIN EBOB'U :  " + ebob);

        ekok = (sayi1 * sayi2) / ebob;
        System.out.println("SAYILARIN EKOK'U  : " + ekok);
    }
}