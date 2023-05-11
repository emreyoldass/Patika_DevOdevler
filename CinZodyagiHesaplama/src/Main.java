import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int dogumTarihi,sonuc;

        Scanner scanner=new Scanner(System.in);
        System.out.print("Doğum tarihinizi giriniz: ");

        dogumTarihi=scanner.nextInt();
        sonuc =dogumTarihi % 12;

        switch (sonuc){
            case 0 :
                System.out.println("Çin zodyağı burcunuz: Maymun");
                break;
            case 1 :
                System.out.println("Çin zodyağı burcunuz: Horoz");
                break;
            case 2 :
                System.out.println("Çin zodyağı burcunuz: Köpek");
                break;
            case 3 :
                System.out.println("Çin zodyağı burcunuz: Domuz");
                break;
            case 4 :
                System.out.println("Çin zodyağı burcunuz: Fare");
                break;
            case 5 :
                System.out.println("Çin zodyağı burcunuz: Öküz");
                break;
            case 6 :
                System.out.println("Çin zodyağı burcunuz: Kaplan");
                break;
            case 7:
                System.out.println("Çin zodyağı burcunuz: Tavşan");
                break;
            case 8 :
                System.out.println("Çin zodyağı burcunuz: Ejderha");
                break;
            case 9 :
                System.out.println("Çin zodyağı burcunuz: Yılan");
                break;
            case 10 :
                System.out.println("Çin zodyağı burcunuz: At");
                break;
            case 11 :
                System.out.println("Çin zodyağı burcunuz: Koyun");
                break;

            default:
                System.out.println("Geçersiz bir sayı girdiniz!");
        }
    }
}