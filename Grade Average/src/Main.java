import java.util.Scanner;
 class main {
    public static void main(String[] args) {

        int matematik,fizik,kimya,turkce,tarih,muzik;
        Scanner inp = new Scanner(System.in);

        // Kullanıcıdan değerleri al
        System.out.print("Matematik Notunuz : ");
        matematik = inp.nextInt();
        System.out.print("Fizik Notunuz : ");
        fizik = inp.nextInt();
        System.out.print("Kimya Notunuz : ");
        kimya = inp.nextInt();
        System.out.print("Türkçe Notunuz : ");
        turkce = inp.nextInt();
        System.out.print("Tarih Notunuz : ");
        tarih = inp.nextInt();
        System.out.print("Müzik Notunuz : ");
        muzik = inp.nextInt();

        int toplam = (matematik + fizik + kimya + turkce + tarih + muzik);
        double ortalama = toplam / 6.0;
        System.out.print("Ortalamanız : " + ortalama);

        boolean kosul = ortalama >= 60;
        String sonuc = kosul ? " Sınıfı Geçtin :)" : " Sınıfta kaldın :( ";
        System.out.println(sonuc);
    }
}