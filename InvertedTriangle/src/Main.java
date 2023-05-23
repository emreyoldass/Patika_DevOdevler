import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Değişkenlerimiz tanımlıyoruz.
        int invertedTriangle;
        Scanner scanner = new Scanner(System.in);
        //Kullanıcıdan girdi alıyoruz.
        System.out.print("Kaç satırlı ters üçgen oluşturmak istediğinizi giriniz: ");
        invertedTriangle = scanner.nextInt();
        //for döngüsü ile ters üçgenimzi oluşturuyoruz.
        for (int i = invertedTriangle; i >= 0; i--) {
            //for döngüsü ile ortalıyoruz.
            for (int j = 1; j <= invertedTriangle - i; j++) {
                System.out.print(" ");
            }
            //for döngüsü ile aldığımız girdiye göre ters üçgenimizi oluşturuyoruz.
            for (int k = 1; k <= (2 * i) - 1; k++) {

                System.out.print("*");
            }
            System.out.println();
        }
    }
}