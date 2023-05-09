import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
     double _armut,_elma,_domates,_muz,_patlican,_toplamTutar;

        Scanner _scanner = new Scanner(System.in);

        System.out.print("Armut kaç kilo: ");
        _armut= _scanner.nextDouble();

        System.out.print("Elma kaç kilo: ");
        _elma= _scanner.nextDouble();

        System.out.print("Domates kaç kilo: ");
        _domates= _scanner.nextDouble();

        System.out.print("Muz kaç kilo: ");
        _muz= _scanner.nextDouble();

        System.out.print("Patlican kaç kilo: ");
        _patlican= _scanner.nextDouble();

        _toplamTutar = (_armut*2.14)+(_elma*3.67)+(_domates*1.11)+(_muz*0.95)+(_patlican*5.00);
        System.out.println("Toplam tutar: " +_toplamTutar + " TL");
    }
}