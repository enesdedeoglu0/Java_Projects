// ENES DEDEOĞLU 21.03.2023

import java.util.Scanner;
 class DaireHesap {
    public static void main(String[] args){
        int r,aci;
        double alan;
        double pi = 3.14;
        Scanner inp = new Scanner(System.in);
        System.out.print("LUTFEN DAIRE YARICAPI GIRINIZ :  ");
        r = inp.nextInt();

        System.out.print("LUTFEN DAIRE DILIMININ ACISINI  GIRINIZ (0-360)   :  ");
        aci = inp.nextInt();
        alan = (pi*(r*r)*aci)/360;
        System.out.print("GIRDIGINIZ VERILERE GÖRE DAIRE DILIMINIZIN ALANI : "+ alan );



    }
}