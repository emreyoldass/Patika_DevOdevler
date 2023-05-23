
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Değişkenlerimizi tanımlıyoruz.
        int numberPieces,number,min=0,max=0;

        Scanner sca = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz: ");
        //Kullanıcıdan kaç adet sayı gireceğinin girdisini alıyoruz.
        numberPieces = sca.nextInt();
        //for döngüsü ile girilen sayıların içinde dönerek en büyük ve en küçük sayımızı buluyoruz.
        for (int i = 1; i<= numberPieces; i++)
        {
            System.out.println( i + ". sayıyı giriniz: ");
            number = sca.nextInt();
            if (number > max)
                max = number;
            if (number < min || min == 0)
                min = number;
        }
        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " +min);
    }

}