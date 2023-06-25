import java.util.Scanner;

public class Main {
    /*
    Java dilinde, taban ve üs değerleri kullanıcıdan alınan üs alma işlemini
     "Recursive" metot kullanarak yapan programı yazınız.
     */
    static int exponentialNumber(int base, int exponent) {
        int result = 1;
        //for döngüsü ile taban değerimizi üs kadar çarpıyoruz.Sonuç(result) değişkenimize değeri atıyoruz.
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }
        //return ile for döngüsünden atadığımız değeri geri döndürüyoruz.
        return result;
    }


    public static void main(String[] args) {
        //Kullanıcıdan girdi alıyoruz.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Taban değerini giriniz: ");
        int base = scanner.nextInt();
        System.out.print("Üs değerini giriniz: ");
        int exponent = scanner.nextInt();
        //Metotumuza kullanıcıdan aldığımız girdiyi gönderiyoruz ve gelen sonucu konsol ekranına yazdırıyoruz.
        System.out.println("Sonuç: " + exponentialNumber(base,exponent));
    }
