import java.util.Scanner;

public class KdvTutari {
    public static void main(String[] args) {
        int fiyat;

        Scanner inp = new Scanner(System.in);

        System.out.print("Fiyati Giriniz : ");
        fiyat = inp.nextInt();

        if (fiyat < 1000) {

            double kdvliFiyat = fiyat + (fiyat * 0.18);

            double kdv = fiyat * 0.18;

            System.out.println("KDV'siz fiyat : " + fiyat);

            System.out.println("KDV'li fiyat : " + kdvliFiyat);

            System.out.println("KDV tutari : " + kdv);
        } else {
            double kdvliFiyat = fiyat + (fiyat * 0.08);

            double kdv = fiyat * 0.08;

            System.out.println("KDV'siz fiyat : " + fiyat);

            System.out.println("KDV'li fiyat : " + kdvliFiyat);

            System.out.println("KDV tutari : " + kdv);
        }
    }
}
