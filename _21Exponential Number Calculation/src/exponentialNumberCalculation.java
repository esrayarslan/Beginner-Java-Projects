import java.util.Scanner;

public class exponentialNumberCalculation {
    public static void main(String[] args) {

        int n, k;
        int total =1;
        Scanner inp = new Scanner(System.in);
        System.out.print("Üssü Alınacak Sayı : ");
        n = inp.nextInt();

        System.out.print("Üs Olacak Sayı : ");
        k = inp.nextInt();

        for (int i = 1; i<=k; i++) {
            total *= n;
        }
            System.out.println("Cevap : " + total);
    }
}