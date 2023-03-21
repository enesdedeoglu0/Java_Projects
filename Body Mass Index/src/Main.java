
// ENES DEDEOĞLU 21.03.2023
import java.util.Scanner;
class main {
    public static void main(String[] args) {
        float boy,bki;
        int kilo;
        Scanner inp = new Scanner(System.in);

        System.out.print("LUTFEN BOYUNUZU M CINSINDEN GIRINIZ ',' KULLANINIZ  : ");
        boy = inp.nextFloat();
        System.out.print("LUTFEN KILONUZU KG CINSINDEN GIRINIZ   : ");
        kilo = inp.nextInt();
        bki = kilo*(boy*boy);
        System.out.println("VUCUT KITLE INDEXI : " + bki);

    }
}