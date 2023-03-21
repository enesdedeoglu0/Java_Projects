// ENES DEDEOĞLU 21.03.2023

import java.util.Scanner;
  class UcgenAlan {
    public static void main(String[] args){
        int a,b,c;
        double alan,u;
        Scanner x=new Scanner(System.in);
        System.out.print("ilk kenar: ");
        a=x.nextInt();
        System.out.print("ikinci kenar: ");
        b=x.nextInt();
        System.out.print("üçüncü kenar: ");
        c=x.nextInt();
        u=(a+b+c)/2;
        alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.print("Üçgenin alanı: "+alan);
    }
}