import java.util.Scanner;

public class groceryCashRegisterAccount {
    public static void main(String[] args) {

        double pear = 2.14, apple = 3.67, tomato = 1.11, banana = 0.95, eggplant = 5.00, total;
        double kg1, kg2, kg3, kg4, kg5;
        Scanner input = new Scanner(System.in);
        System.out.println(" MANAV KASA PROGRAMI ");

        System.out.print("Armut Kaç Kilo? : ");
        kg1 = input.nextDouble();

        System.out.print("Elma Kaç Kilo? : ");
        kg2 = input.nextDouble();

        System.out.print("Domates Kaç Kilo? : ");
        kg3 = input.nextDouble();

        System.out.print("Muz Kaç Kilo? : ");
        kg4 = input.nextDouble();

        System.out.print("Patlıcan Kaç Kilo? : ");
        kg5 = input.nextDouble();

        total = (kg1 * pear) + (kg2 * apple) + (kg3 * tomato) + (kg4 * banana) + (kg5 * eggplant);
        System.out.print("Toplam Tutar : " + total + " TL");

    }
}