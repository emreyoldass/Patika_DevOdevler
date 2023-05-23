import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        //Kullanıcıdan yıl girdisi alıyoruz.
        System.out.print("Yıl giriniz: ");
        int year = scanner.nextInt();
        //if döngüsü ile artık yıl olup olmadığını hesaplıyoruz.
        //Eğer şartımızı sağlıyorsa konsol ekranına 'bir artık yıldır' yazdırıyoruz.
        if(year % 4 == 0 || year % 100 == 0 && year % 400 == 0) {
            System.out.println(year + " bir artık yıldır.");

        }
        //Eğer şartımızı sağlamıyorsa 'bir artık yıl değildir' yazdırıyoruz.
        else {
            System.out.println(year + " bir artık yıl değildir.");
        }
    }
}