import java.util.Scanner;

 class Logi {
    public static void main(String[] args) {
        int secim;
        Scanner input = new Scanner(System.in);
        String UserName = "enesdedeoglu", Password = "patika.dev", NewPassword;
        System.out.println("LUTFEN KULLANICI ADINIZI GIRINIZ ");
        String LoginUserName = input.next();
        System.out.println("LUTFEN SIFRENIZI GIRINIZ ");
        String LoginPassword = input.next();
        if (UserName.equals(LoginUserName) && (Password.equals(LoginPassword))) {
            System.out.println("TESEKKURLER BASARILI GIRIS YAPTINIZ ");

        } else {
            System.out.println("YANLIS KULLANICI ADI VEYA SIFRE GIRDINIZ \n SIFIRLAMAK ISTERMISIN  \n 1 =>EVET \n 2=>HAYIR");
            secim = input.nextInt();
            switch (secim) {
                case 1:
                    System.out.println("SIFRENIZI GIRINIZ ");
                    NewPassword = input.next();
                    if (NewPassword.equals(Password)) {
                        System.out.println("UZGUNUZ YENI SIFREN ESKISIYLE AYNI OLAMAZ :(");
                    } else {
                        System.out.println("SIFREN BASARILI BIR SEKILDE DEGISTIRILDI :)");
                    }
                    break;
                case 2:
                    System.out.println("BAY BAY KENDINE IYI BAK :)");
                    break;
                default:
                    System.out.println("YANLIS GIRDINIZ ");
            }
        }
    }
}