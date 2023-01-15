import java.util.Scanner;

public class bodyMassIndexCalculation {
    public static void main(String[] args) {

        double size, weight;

        Scanner inp = new Scanner(System.in);
        System.out.println("Lütfen Kilonuzu Giriniz : ");
        System.out.println("Lütfen Boyunuzu (Metre cinsinden) Giriniz : ");

        weight = inp.nextDouble();
        size = inp.nextDouble();

        double result = weight / (size * size);
        System.out.print("Vücut Kitle İndeksiniz : "+ result );

    }
}