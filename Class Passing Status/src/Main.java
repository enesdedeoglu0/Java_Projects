// ENES DEDEOĞLU 23.03.2023

import  java.util.Scanner;
 class DersOrt {
    public static void main(String[] args) {
        int Matematik, Fizik, Turkce, Kimya, Muzik;
        double ort;
        Scanner input = new Scanner(System.in);

        System.out.print("LUTFEN MATEMATİK NOTUNUZU GIRINIZ : ");
        Matematik = input.nextInt();

        System.out.print("LUTFEN FIZIK NOTUNUZU GIRINIZ : ");
        Fizik = input.nextInt();

        System.out.print("LUTFEN TURKCE NOTUNUZU GIRINIZ : ");
        Turkce = input.nextInt();

        System.out.print("LUTFEN KIMYA NOTUNUZU GIRINIZ : ");
        Kimya = input.nextInt();

        System.out.print("LUTFEN MUZIK NOTUNUZU GIRINIZ : ");
        Muzik = input.nextInt();

        ort = (Matematik + Fizik + Turkce + Kimya + Muzik) / 5.0;

        if ((0 <= Matematik && Matematik <= 100) && (0 <= Fizik && Fizik <= 100) && (0 <= Turkce && Turkce <= 100) &&
                (0 <= Kimya && Kimya <= 100) && (0 <= Muzik && Muzik <= 100))
        {
            if (ort<=55){
                System.out.print("UZGUNUZ SINIF TEKRARI YAPMANIZ GEREKIYOR \n  ORTALAMANIZ  "+ ort);
            }
            else{
                System.out.print("TEBRİKLER SINIFI GEÇTINIZ \n ORTALAMANIZ : "+ ort);}
        }
        else {
            System.out.print("YANLIS DEGER GIRDINIZ 1-100 ARASINDA BIR DEGER GIRINIZ ");
        }

    }

}
