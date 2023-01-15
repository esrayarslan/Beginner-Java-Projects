import java.util.Scanner;

public class theStatusOfPassingTheClass {
        public static void main(String[] args) {

            int total = 0;
            int numberOfCourses = 0;
            Scanner input = new Scanner(System.in);

            System.out.print("Matematik Notunuz : ");
            int math = input.nextInt();

            if (math > 0 && math <= 100) {
            total += math;
            ++numberOfCourses;
        }

            System.out.print("Fizik Notunuz : ");
            int physics = input.nextInt();

            if (physics > 0 && physics <= 100) {
            total += physics;
            ++numberOfCourses;
        }

            System.out.print("Kimya Notunuz : ");
            int chemistry = input.nextInt();

            if (chemistry > 0 && chemistry <= 100) {
            total += chemistry;
            ++numberOfCourses;
        }

            System.out.print("Türkçe Notunuz : ");
            int turkish = input.nextInt();

            if (turkish > 0 && turkish <= 100) {
            total += turkish;
            ++numberOfCourses;
        }

            System.out.print("Müzik notunuz : ");
            int music = input.nextInt();

            if (music > 0 && music <= 100) {
            total += music;
            ++numberOfCourses;
        }

            double avarage = (double)(total / numberOfCourses);

            if (avarage >= 55.0) {
            System.out.println("Ortalamaniz:" + avarage);
            System.out.println("Tebrikler Sınıfı Geçtiniz!.");
            }   else {
            System.out.println("Ortalamaniz:" + avarage);
            System.out.println("Maalesef Sınıfta Kaldınız...");
        }

    }
}