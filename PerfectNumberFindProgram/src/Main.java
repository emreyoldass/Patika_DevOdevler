import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların) toplamı
        kendisine eşit olan sayıya mükemmel sayı denir. */
        // 6 mükemmel sayıdır çünkü 1, 2 ve 3 pozitif tam bölenleridir ve 1 + 2 + 3 = 6

        //Değikenlerimizi tanımlıyoruz.
        int number,sum=0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        //Kullanıcıdan girdi alıyoruz.
        number = scanner.nextInt();
        //for döngüsü ile girdiğimiz sayıya kadar bölenlerini bölüyoruz.
        for (int i = 1; i <= number/2; i++) {
            //if döngüsü ile girilen sayının for döngüsünde gelen i değişkeni ile kalanına bakıyoruz.
            //Eğer kalan 0 ise sum değişkenimize i'den gelen değeri sum ile i'yi toplayıp atıyoruz.
            if (number % i == 0) {
                sum += i;
            }
        }
        //sum değişkenim number yani  girdiğimiz sayıya eşit ise konsol ekranına 'bir mükemmel sayıdır.' yazdırıyoruz.
        if (sum == number) {
            System.out.println(number + " bir mükemmel sayıdır.");
        }
        //sum değişkenim number yani  girdiğimiz sayıya eşit değil ise konsol ekranına 'bir mükemmel sayı değildir.' yazdırıyoruz.
        else {
            System.out.println(number + " bir mükemmel sayı değildir.");
        }
    }
}