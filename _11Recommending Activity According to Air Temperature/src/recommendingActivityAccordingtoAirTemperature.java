import java.util.Scanner;

public class recommendingActivityAccordingtoAirTemperature {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Sıcaklığı Gİriniz : ");
        int heat = input.nextInt();

        if (heat < 5) {
            System.out.println("Kayak yapabilirsiniz...");
        } else if (heat < 25) {
            if (heat >= 5 && heat < 10) {
                System.out.println("Sinemaya gidebilirsiniz...");
            } else if (heat >= 10 && heat <= 15) {
                System.out.println("Sinemaya veya Pikniğe gidebilirsiniz...");
            } else {
                System.out.println("Pikniğe gidebilirsiniz...");
            }
        } else {
            System.out.println("Yüzmeye gidebilirsiniz...");
        }

    }
}