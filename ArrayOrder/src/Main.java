import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int size=0;
        int[] list;
        //Kullanıcıdan girdileri alıyoruz.
        Scanner scanner=new Scanner(System.in);
        System.out.print("Dizinin boyutunu giriniz: ");
        size=scanner.nextInt();
        //Kullanıcıdan aldığımız girdiye göre dizimizi boyutlandırdık.
        list= new int[size];
        System.out.println("Dizi elemanlarını giriniz ");
        //For döngüsü ile dizimize elemanlarımızı ekliyoruz.
        for (int i =0;i<list.length;i++){
            System.out.print((i+1)+". Eleman: ");
            list[i]=scanner.nextInt();
        }
        //Dizimizi sıraladık.
        Arrays.sort(list);
        System.out.print("Dizinin küçükten büyüğe doğru sıralaması: ");
       //diziyi ekrana yazdırıyoruz.
        for(int i=0;i<list.length;i++){
            System.out.print(list[i]+" ");
        }
    }
}