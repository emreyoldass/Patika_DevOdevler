import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            /*
            Fibonacci serisi, her sayının kendinden önceki ile toplanması sonucu oluşan bir sayı dizisidir.
             */
        //Değişkenlerimizi tanımlıyoruz.
        int seriesLength,sum=0,s1=0,s2=1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Fibonacci serisi kaç elemanlı olacağını giriniz:");
        //Kullanıcıdan girdi alıyoruz.
        seriesLength = scanner.nextInt();
        //for döngüsü ile fibonacci serisini hesaplıyoruz.
        for(int i=1;i<=seriesLength;i++){
            System.out.print(s1 + " ");
            sum = s1+s2;
            s1=s2;
            s2=sum;
        }
    }
}