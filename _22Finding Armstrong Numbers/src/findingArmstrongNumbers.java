import java.util.Scanner;

public class findingArmstrongNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        int number = input.nextInt();
        int numberOfDigits = 0;
        int tempNumber = number;
        int digitValue;
        int totalNumber = 0;

        while (tempNumber != 0) {
            tempNumber /= 10;
            numberOfDigits++;
        }
        System.out.println("Basamak Sayısı: " + numberOfDigits);
        tempNumber = number;

        while (tempNumber != 0) {
            digitValue = tempNumber % 10;
            totalNumber = digitValue + totalNumber;
            tempNumber /= 10;
        }
        System.out.println(totalNumber);



        /* Basamak Sayısı bulma

        int a = 1643, numberOfDigits = 0, numberCounter = 0;
        System.out.println(a);

        while (a != 0) {
            a /= 10;
            System.out.println(a);
            numberCounter++;
        }

         */

    }
}