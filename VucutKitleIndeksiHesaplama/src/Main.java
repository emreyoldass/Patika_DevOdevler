import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Değişkenlerimizi tanımlıyoruz.
      double size,kilo,bodyMassIndex;

        Scanner _scanner=  new Scanner(System.in);
        //Kullanıcıdan girdileri alıyoruz.
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz: ");
        size=_scanner.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz: ");
        kilo=_scanner.nextDouble();
        //Aldığımız girdileri vucüt kitle endeksi formülüne göre hesaplamamızı yaptırıyoruz.
        bodyMassIndex=kilo/(size*size);
        //Sonuçu konsol ekranına yazdırıyoruz.
        System.out.println("Vücut Kitle İndeksiniz: " + bodyMassIndex);
    }
}