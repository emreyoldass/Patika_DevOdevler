import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
      double _boy,_kilo,_vucutKitleIndeksi;

        Scanner _scanner=  new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz: ");
        _boy=_scanner.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz: ");
        _kilo=_scanner.nextDouble();
        _vucutKitleIndeksi=_kilo/(_boy*_boy);

        System.out.println("Vücut Kitle İndeksiniz: " + _vucutKitleIndeksi);
    }
}