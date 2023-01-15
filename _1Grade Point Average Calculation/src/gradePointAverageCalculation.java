import java.util.Scanner;

public class gradePointAverageCalculation {
    public static void main(String[] args){

        int math, physic, chemistry, turkish, history, music;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Matematik Notunuz : ");
        math = scanner.nextInt();

        System.out.print("Fizik Notunuz : ");
        physic = scanner.nextInt();

        System.out.print("Kimya Notunuz : ");
        chemistry = scanner.nextInt();

        System.out.print("Türkçe Notunuz : ");
        turkish = scanner.nextInt();

        System.out.print("Tarih Notunuz : ");
        history = scanner.nextInt();

        System.out.print("Müzik Notunuz : ");
        music = scanner.nextInt();

        int total = (math + physic + chemistry + turkish + history + music);
        double result = total / 6;
        System.out.println("Ortalamanız : " + result);

        /* Ödev : Aynı program içerisinde koşullu ifadeler kullanılarak, eğer kullanıcının
        ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.
        Not : If ve Else kullanılmadan... */

        String situation = result >= 60 ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(situation);

    }
}