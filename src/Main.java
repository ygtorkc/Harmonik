import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dizi boyutunu giriniz: ");
        int n = sc.nextInt();
        double[] dizi = new double[n];
        double toplam = 0.0;

        System.out.println("Dizinin elemanlarını giriniz: ");
        for (int i = 0; i < n; i++) {
            dizi[i] = sc.nextDouble();
        }

        for (int i = 0; i < n; i++) {
            toplam += 1.0 / dizi[i];
        }

        double harmonikOrtalama = n / toplam;
        System.out.println("Dizinin harmonik ortalaması: " + harmonikOrtalama);
    }
}
