import java.util.Scanner;

public class findingTheForcesOf4And5 {

    public static void main(String[] args) {



        /* We are writing the program that prints
        the powers of 4 and 5 up to the number entered
        with Java loops on the screen.
        */

        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Sınır Sayısını Giriniz : ");
        n = input.nextInt();

        for (int i = 1; i <= n; i *= 4) {
            System.out.println(i);
        }

        System.out.println("----------------------");

        for (int i = 1; i <= n; i *= 5) {
            System.out.println(i);
        }
    }
}