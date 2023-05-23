import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       //Değişkenlerimizi tanımlıyoruz.
     double pear,apple,tomatoes,banana,aubergine,totalAmount;

         //Kullanıcıdan girdiler alıyoruz.
        Scanner _scanner = new Scanner(System.in);

        System.out.print("Armut kaç kilo: ");
        pear= _scanner.nextDouble();

        System.out.print("Elma kaç kilo: ");
        apple= _scanner.nextDouble();

        System.out.print("Domates kaç kilo: ");
       tomatoes= _scanner.nextDouble();

        System.out.print("Muz kaç kilo: ");
        banana= _scanner.nextDouble();

        System.out.print("Patlican kaç kilo: ");
       aubergine= _scanner.nextDouble();
      //Toplam tutarı hesaplıyoruz.
       totalAmount = (pear*2.14)+(apple*3.67)+(tomatoes*1.11)+(banana*0.95)+(aubergine*5.00);
       //Sonuçu konsol ekranına yazdırıyoruz.
        System.out.println("Toplam tutar: " +totalAmount + " TL");
    }
}