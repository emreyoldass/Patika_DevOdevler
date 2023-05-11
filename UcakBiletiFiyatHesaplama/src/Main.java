import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       double mesafe,yas,normalTutar,yasIndirimi,indirimliTutar, gidisDonusIndirimi,toplamTutar;

        Scanner scanner=new Scanner(System.in);
        System.out.print("Mesafeyi km türünden giriniz:");
        mesafe=scanner.nextDouble();
        System.out.print("Yaşınızı giriniz :");
        yas=scanner.nextDouble();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ):");
        int yolculuktipi=scanner.nextInt();

        if (yas<0 || mesafe<0){
            System.out.println("Hatalı Veri Girdiniz!");
            System.exit(0);
        }

       switch (yolculuktipi) {
           case 1:
               if (yas<12){
               normalTutar = mesafe*0.10;
               yasIndirimi= normalTutar *0.50;
               indirimliTutar=normalTutar-yasIndirimi;
               System.out.println("Tutar:"+ indirimliTutar+" Tl");
               }
               else if(yas>12 && yas<24) {
                   normalTutar = mesafe * 0.10;
                   yasIndirimi = normalTutar * 0.10;
                   indirimliTutar = normalTutar - yasIndirimi;
                   System.out.println("Tutar:" + indirimliTutar+" Tl");
               } else if (yas > 24 && yas<65) {
                   normalTutar=mesafe*0.10;
                   System.out.println("Tutar: "+ normalTutar+" Tl");
               }
               else if (yas>65){
                   normalTutar = mesafe * 0.10;
                   yasIndirimi = normalTutar * 0.30;
                   indirimliTutar = normalTutar - yasIndirimi;
                   System.out.println("Tutar:" + indirimliTutar+" Tl");
               }
               break;
           case 2:
               if (yas<12){
                   normalTutar = mesafe*0.10;
                   yasIndirimi= normalTutar *0.50;
                   indirimliTutar=normalTutar-yasIndirimi;
                   gidisDonusIndirimi=indirimliTutar*0.20;
                   toplamTutar= (indirimliTutar-gidisDonusIndirimi)*2;
                   System.out.println("Tutar:" + toplamTutar+" Tl");
               }
               else if(yas>12 && yas<24) {
                   normalTutar = mesafe * 0.10;
                   yasIndirimi = normalTutar * 0.10;
                   indirimliTutar = normalTutar - yasIndirimi;
                   gidisDonusIndirimi=indirimliTutar*0.20;
                   toplamTutar= (indirimliTutar-gidisDonusIndirimi)*2;
                   System.out.println("Tutar:" + toplamTutar+" Tl");
               } else if (yas > 24 && yas<65) {
                   normalTutar=mesafe*0.10;
                   gidisDonusIndirimi=normalTutar*0.20;
                   toplamTutar= (normalTutar-gidisDonusIndirimi)*2;
                   System.out.println("Tutar:" + toplamTutar +" Tl");
               }
               else if (yas>65){
                   normalTutar = mesafe * 0.10;
                   yasIndirimi = normalTutar * 0.30;
                   indirimliTutar = normalTutar - yasIndirimi;
                   gidisDonusIndirimi=indirimliTutar*0.20;
                   toplamTutar= (indirimliTutar-gidisDonusIndirimi)*2;
                   System.out.println("Tutar:" + toplamTutar+" Tl");;
               }
               break;
           default:
               System.out.println("Hatalı Veri Girdiniz!");
       }
    }
}