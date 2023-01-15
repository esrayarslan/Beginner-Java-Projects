import java.util.Scanner;

public class findingTheAreaAndPerimeterOfTheRound {
    public static void main(String[] args) {

        int r;
        double pi = 3.14;

        Scanner inp = new Scanner(System.in);

        System.out.print("Dairenin yarı çapını giriniz : ");
        r = inp.nextInt();

        double area = pi * r * r;
        double environment = 2 * pi * r;

        System.out.println("Dairenin alanı : " + area);
        System.out.println("Dairenin çevresi : " + environment);
    }
}