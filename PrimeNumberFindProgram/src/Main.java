import java.util.Scanner;

public class Main {
    static int primeNumber(){
        int number,result=0;
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                result++;
            }
        }
        if (result==0){
            System.out.println(number + " sayısı bir asal sayıdır!");
        }
        else {
            System.out.println(number + " sayısı bir asal sayı değildir");
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(primeNumber());
    }"
}
