import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int sayiadet,sayi,min=0,max=0;
        Scanner sca = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz: ");
        sayiadet = sca.nextInt();
        for (int i = 1; i<= sayiadet; i++)
        {
            System.out.println( i + ". sayıyı giriniz: ");
            sayi = sca.nextInt();
            if (sayi > max)
                max = sayi;
            if (sayi < min || min == 0)
                min = sayi;
        }
        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " +min);
    }

}