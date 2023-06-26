import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Kural : Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5 rakamını çıkarın.
        // Her çıkarma işlemi sırasında ekrana son değeri yazdırın. Sayı negatif veya 0 olduktan sonra tekrar 5 ekleyin.
        // Yine her ekleme işleminde sayının son değerini ekrana yazdırın

        Scanner scanner = new Scanner(System.in);
        //Kullanıcıdan girdi alıyoruz.
        System.out.print("N Sayısını giriniz : ");
        int number = scanner.nextInt();
        int constantNumber=number;
        //sayacımızı tanımlıyoruz
        int counter =0;
        System.out.print(" "+number);
        test(number,constantNumber,counter);
    }
    //Desenimizi metot ile oluşturuyoruz.
    static int test(int number,int constantNumber,int counter) {
        //Koşullarımızı tanımlıyoruz. sayımız 0 dan büyük ve sayımız sabit sayıdan küçük ve sayacımız 0
        if (number > 0 && number <= constantNumber && counter == 0) {
            //Sayımızdan 5 çıkarıp ekrana yazdırıyoruz.
            System.out.print(" " + (number - 5));
            //sayımızdan 5 çıkarıp geri döndürüyoruz.
            return test(number - 5, constantNumber,counter);
            // Koşulumuzu tanımlıyoruz. Sayimiz sıfırdan büyük veya sıfırdan küçük aralığında ve sayımız sabit sayımızdan küçük eşit ise
        } else if ((number > 0 || number <= 0) && number <= constantNumber) {
            if (number == constantNumber) {
                //Sayacımızı bir artırıyoruz ve geriye sayımıza 5 ekleyip döndürüyoruz.
                counter++;
                return test(number + 5, constantNumber,counter);
            } else {
                //Sayacımızı bir artırıyoruz ve ekrana sayımızı 5 ekleyip yazdırıyoruz.
                counter++;
                System.out.print(" "+(number + 5));
                return test(number + 5, constantNumber,counter);
            }
        }
        return 1;
    }
}

