public class Main {
    public static void main(String[] args) {
        //Değişkenlerimizi tanımlıyoruz.
        int primenumber;
        System.out.print("1'den 100'e kadar olan asal sayılar:");
        for (int i = 2; i <= 100; i++) {
            primenumber=0;
            for (int j= 1;j<=i;j++){
                if (i%j==0){
                    primenumber++;
                }
            }
            if(primenumber<=2){
                //asal sayıları konsol ekranına yazdırıyoruz.
                System.out.print(" "+i);
            }
        }
    }
}
