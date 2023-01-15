import java.util.Scanner;

public class calculatingTheLeapYear {

    public static void main(String[] args) {

        System.out.print("Lütfen Hesaplamak İstediğiniz Yılı Giriniz : ");
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();


        if (year % 100 == 0) {
            if (year % 400 == 0) {
                System.out.println("" + year + " : Artık Bir Yıldır ! ");
            } else {
                System.out.println("" + year + " : Artık Bir Yıl Değildir !");
            }
        } else if (year % 4 == 0) {
            System.out.println("" + year + " : Artık Bir Yıldır ! ");
        } else {
            System.out.println("" + year + " : Artık Bir Yıl Değildir !");
        }
    }
}