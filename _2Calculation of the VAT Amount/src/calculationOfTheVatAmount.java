import java.util.Scanner;

public class calculationOfTheVatAmount {
    public static void main(String[] args) {

        double vatRate = 0.18;
        Scanner input = new Scanner(System.in);
        System.out.print("Ücret Tutarını Giriniz : ");

        double amount = input.nextDouble();
        double vatAmount = amount * vatRate;
        double vatAmounts = amount + vatAmount;

        System.out.println("KDV'siz Tutarı :" + amount);
        System.out.println("KDV Oranı :" + vatRate);
        System.out.println("KDV Tutarı :" + vatAmount);
        System.out.println("KDV'li Tutarı :" + vatAmounts);
    }
}