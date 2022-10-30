import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {
        /*Not Ortalaması Hesaplayan Program
        Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan alan ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.

        Ödev
        Aynı program içerisinde koşullu ifadeler kullanılarak, eğer kullanıcının ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.

        Not : If ve Else kullanılmayacak..*/

        Scanner dat = new Scanner(System.in);
        System.out.println("Matemetik notunuz= ");
        int mat= dat.nextInt();
        System.out.println("Fizik notunuz= ");
        int fiz= dat.nextInt();
        System.out.println("Kimya notunuz= ");
        int kim= dat.nextInt();
        System.out.println("Türkçe notunuz= ");
        int tur= dat.nextInt();
        System.out.println("Tarih notunuz= ");
        int tar= dat.nextInt();
        System.out.println("Müzik notunuz= ");
        int muz= dat.nextInt();

        double ort;

        ort=(mat+fiz+kim+tur+tar+muz)/6;

        System.out.println("Not ortalamanız= "+ort+"\nDurum= "+(ort > 60 ? "Sınıı Geçti!" : "Sınıfta Kaldı!"));


    }
}
