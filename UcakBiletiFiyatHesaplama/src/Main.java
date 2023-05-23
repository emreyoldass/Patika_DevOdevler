import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*
        Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır.
        Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
        Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
        Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
        Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
        Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
         */
        //Değişkenlerimizi tanımlıyoruz.
        double distance, age, normalAmount, ageDiscount, discountedAmount, roundTripDiscount, totalAmount;
        //Kullanıcıdan girdilerimiz alıyoruz.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mesafeyi km türünden giriniz:");
        distance = scanner.nextDouble();
        System.out.print("Yaşınızı giriniz :");
        age = scanner.nextDouble();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ):");

        //Switch-case döngümüz için int türünde değişkenimizi tanımlıyoruz ve kullanıcıdan girdimizi alıyoruz.
        int journeyType = scanner.nextInt();

        //yaş ve mesafe değişkenimiz pozitif değil negatif girilirse if döngümüz çalışacaktır.
        if (age < 0 || distance < 0) {
            System.out.println("Hatalı Veri Girdiniz!");
            System.exit(0);
        }
        //Kullanıcıdan aldığımız yolculuk tipine göre switch-case döngümüz çalışacaktır.
        switch (journeyType) {
            //case 1 seçeneğinde sadece gidiş türüne göre if döngüsü ile indirimler uygulanacak.
            case 1:
                if (age < 12) {
                    normalAmount = distance * 0.10;
                    ageDiscount = normalAmount * 0.50;
                    discountedAmount = normalAmount - ageDiscount;
                    System.out.println("Tutar:" + discountedAmount + " Tl");
                } else if (age > 12 && age < 24) {
                    normalAmount = distance * 0.10;
                    ageDiscount = normalAmount * 0.10;
                    discountedAmount = normalAmount - ageDiscount;
                    System.out.println("Tutar:" + discountedAmount + " Tl");
                } else if (age > 24 && age < 65) {
                    normalAmount = distance * 0.10;
                    System.out.println("Tutar: " + normalAmount + " Tl");
                } else if (age > 65) {
                    normalAmount = distance * 0.10;
                    ageDiscount = normalAmount * 0.30;
                    discountedAmount = normalAmount - ageDiscount;
                    System.out.println("Tutar:" + discountedAmount + " Tl");
                }
                break;
            //case 2 seçeneğinde  gidiş-dönüş türüne göre if döngüsü ile indirimler uygulanacak.
            case 2:
                if (age < 12) {
                    normalAmount = distance * 0.10;
                    ageDiscount = normalAmount * 0.50;
                    discountedAmount = normalAmount - ageDiscount;
                    roundTripDiscount = discountedAmount * 0.20;
                    totalAmount = (discountedAmount - roundTripDiscount) * 2;
                    System.out.println("Tutar:" + totalAmount + " Tl");
                } else if (age > 12 && age < 24) {
                    normalAmount = distance * 0.10;
                    ageDiscount = normalAmount * 0.10;
                    discountedAmount = normalAmount - ageDiscount;
                    roundTripDiscount = discountedAmount * 0.20;
                    totalAmount = (discountedAmount - roundTripDiscount) * 2;
                    System.out.println("Tutar:" + totalAmount + " Tl");
                } else if (age > 24 && age < 65) {
                    normalAmount = distance * 0.10;
                    roundTripDiscount = normalAmount * 0.20;
                    totalAmount = (normalAmount - roundTripDiscount) * 2;
                    System.out.println("Tutar:" + totalAmount + " Tl");
                } else if (age > 65) {
                    normalAmount = distance * 0.10;
                    ageDiscount = normalAmount * 0.30;
                    discountedAmount = normalAmount - ageDiscount;
                    roundTripDiscount = discountedAmount * 0.20;
                    totalAmount = (discountedAmount - roundTripDiscount) * 2;
                    System.out.println("Tutar:" + totalAmount + " Tl");
                    ;
                }
                break;
            default:
                System.out.println("Hatalı Veri Girdiniz!");
        }
    }
}