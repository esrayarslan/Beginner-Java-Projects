import java.util.Scanner;

public class airTicketPriceCalculation {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Gideceğiniz Mesafeyi Giriniz : ");
        int distance = input.nextInt();

        System.out.print("Lütfen Yaşınızı Giriniz : ");
        int age = input.nextInt();

        System.out.print("Lütfen Yolculuk Türünüzü Giriniz : (Tek Yön: 1 , Gidiş-Dönüş 2  ");
        int typeOfTrip = input.nextInt();

        if (age > 0 && distance > 0 && (typeOfTrip == 1 || typeOfTrip == 2)) {
            double ticketPrice = (double)distance * 0.1;
            if (age < 12) {
                ticketPrice *= 0.5;
            } else if (age >= 12 && age <= 24) {
                ticketPrice *= 0.9;
            } else if (age > 65) {
                ticketPrice *= 0.7;
            }

            if (typeOfTrip == 2) {
                ticketPrice *= 0.8;
            }

            System.out.println("Bilet Fiyatınız : " + ticketPrice + " TL");
        } else {
            System.out.println("Geçersiz ! Lütfen  Geçerli Bilgiler Girdiğinizden Emin Olun : ");
        }
    }
}