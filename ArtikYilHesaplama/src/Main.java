import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Yıl giriniz: ");
        int yil = scanner.nextInt();

        if(yil % 4 == 0 || yil % 100 == 0 && yil % 400 == 0) {
            System.out.println(yil + " bir artık yıldır.");

        }else {
            System.out.println(yil + " bir artık yıl değildir.");
        }
    }
}