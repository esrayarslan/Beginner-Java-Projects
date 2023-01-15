import java.util.Scanner;

public class chineseZodiacCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Doğum Yılınızı Girer Misiniz : ");
        int birtDate = input.nextInt();

        double result = (double)(birtDate % 12);

        if (result == 0.0) {
            System.out.println("Çin Zodyağı Burcunuz : MAYMUN ");
        } else if (result == 1.0) {
            System.out.println("Çin Zodyağı Burcunuz : HOROZ ");
        } else if (result == 2.0) {
            System.out.println("Çin Zodyağı Burcunuz : KÖPEK ");
        } else if (result == 3.0) {
            System.out.println("Çin Zodyağı Burcunuz : DOMUZ ");
        } else if (result == 4.0) {
            System.out.println("Çin Zodyağı Burcunuz : FARE ");
        } else if (result == 5.0) {
            System.out.println("Çin Zodyağı Burcunuz : ÖKÜZ ");
        } else if (result == 6.0) {
            System.out.println("Çin Zodyağı Burcunuz : KAPLAN ");
        } else if (result == 7.0) {
            System.out.println("Çin Zodyağı Burcunuz : TAVŞAN ");
        } else if (result == 8.0) {
            System.out.println("Çin Zodyağı Burcunuz : EJDERHA ");
        } else if (result == 9.0) {
            System.out.println("Çin Zodyağı Burcunuz : YILAN ");
        } else if (result == 10.0) {
            System.out.println("Çin Zodyağı Burcunuz :AT ");
        } else {
            System.out.println("Çin Zodyağı Burcunuz : KOYUN ");
        }

    }
}