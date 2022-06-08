import java.util.Scanner;

public class BasamakSayilariniToplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayıyı giriniz: ");
        int number = input.nextInt();
        int basValue;
        int total = 0;

        while (number !=0){
            basValue = number % 10;
            total += basValue;
            number/=10;
        }
        System.out.print("Basamak sayılarının toplamı: " + total);


        
    }
}
