import java.util.Scanner;

public class findingTheHypotenuseInaRightTriangle {
    public static void main(String[] args) {

        // Değişken oluşturuyoruz.
        
        int a, b;
        double c;

        // Kullanıcıdan veri alıyoruz.

        Scanner entered = new Scanner(System.in);
        System.out.println("1. Kenarı Giriniz :");
        a = entered.nextInt();

        System.out.println("2. Kenarı Giriniz :");
        b = entered.nextInt();

        c = Math.sqrt((a*a) + (b*b));
        System.out.println("Hipotenüs  "+ c);

    }
}