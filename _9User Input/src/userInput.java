import java.util.Scanner;

public class userInput {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("Kullanıcı Adınızı Giriniz : ");
        String userName = inp.nextLine();

        System.out.print("Parolanızı Giriniz : ");
        String password = inp.nextLine();

        if (userName.equals("esliarslan") && password.equals("java123")) {
            System.out.println("Giriş Başarılı !");
        } else {
            System.out.println("Bilgileriniz Yanlış !");
            System.out.println("Şifrenizi sıfırlamak ister misiniz ? Lütfen evet yada hayır yazınız");
        }

        String newPassword = inp.nextLine();

        if (newPassword.equals("evet")) {
            System.out.print("Yeni şifreyi giriniz: ");
            password = inp.nextLine();
            System.out.println("Yeni şifrenizi tekrar giriniz.");
            password = inp.nextLine();
            if (password.equals("java123")) {
                System.out.print("Yeni şifreniz eski şifrenizle aynı olamaz. Lütfen tekrar deneyiniz");
            } else {
                System.out.println("Şifreniz başarıyla oluşturuldu.");
                System.out.print("Yeni şifreniz:" + password);
            }
        }
    }
}