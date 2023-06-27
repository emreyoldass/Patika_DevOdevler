import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] list = {3, 2, 5, 7, 8, 3, 2, 5, 10, 20, 50, 20, 2, 2};
        Arrays.sort(list);
        System.out.println("Dizi:" + Arrays.toString(list));
        int count = 0;
        int tempNumber = list[0];
        //For döngüsü ile dizimizde hangi sayıların tekrar ettiklerini buluyoruz.
        for (int i = 0; i < list.length; i++) {
            if (i == 0 || tempNumber != list[i]) {
                for (int k : list) {
                    //İf döngümüzde dizide tekrar eden sayı varsa döngüye girecektir. Yoksa şartımız false dönecektir.
                    if (k == list[i]) {
                        count++;
                        //tekrar eden sayıları geçiçi sayı isimli değişkenimize atıyoruz.
                        tempNumber = list[i];
                    }
                }

                System.out.println(list[i] + " sayısı " + count + " kere tekrar edildi.");
                count = 0;
            }
        }
    }
}