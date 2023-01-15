import java.util.Scanner;

public class findingEvenNumbersUpToTheEnteredNumber {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int k, total = 0, counter = 0;
        double ort;

        System.out.print("Sayıyı Giriniz : ");
        k = inp.nextInt();

        for (int i = 0; i <= k; i++) {
            if (i % 12 == 0) {
                System.out.println(i);
                total = total + i;
                counter++;
            }
        }
        System.out.println("Toplam: " + total);
        ort = total / counter;

        System.out.print("Ortalama: " + ort);
    }
}