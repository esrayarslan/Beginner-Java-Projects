import java.util.Scanner;

public class findingTheSumOfOddNumbers {

    public static void main(String[] args) {

        int n;
        int total = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Sayı Giriniz : ");
            n = scanner.nextInt();

            if (n % 4 == 0){
                total += n;
            }
        } while (n % 2 != 1);

        System.out.println("4'ün Katlarının Toplamı : " + total );
    }
}
