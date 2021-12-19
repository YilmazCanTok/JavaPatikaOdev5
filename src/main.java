import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayı;
        double toplam = 0;
        System.out.println("****************************************************");
        System.out.println("Harmonik Seri Hesaplayan Program : ");
        System.out.println("----------------------------------------------------");
        System.out.print("Sayı Giriniz : ");
        sayı = scanner.nextInt();
        for (double i = 1 ; i <= sayı ; i++) {
            toplam = toplam+(1/i);
            System.out.println("Toplamın "+i+" . kademesi : "+toplam);
        }
        System.out.println("----------------------------------------------------");
        System.out.println("Sonuç : "+toplam);
        System.out.println("****************************************************");
    }
}
