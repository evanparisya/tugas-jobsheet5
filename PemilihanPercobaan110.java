import java.util.Scanner;

public class PemilihanPercobaan110 {

    public static void main(String[] args) {
        Scanner input10 = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = input10.nextInt();
        
        String status = (angka % 2 == 0) ? "genap" : "ganjil";
        System.out.println("Angka " + angka + " bilangan " + status);
    }
}
