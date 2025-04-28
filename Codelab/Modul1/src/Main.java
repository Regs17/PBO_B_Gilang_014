import java.util.Scanner;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        String nama;
        String jenisKelamin;
        int tahunLahir;
        Scanner scan = new Scanner(System.in);

        System.out.print("\nMasukan Nama          : ");
        nama = scan.nextLine();

        System.out.print("Masukan Jenis Kelamin : ");
        jenisKelamin = scan.nextLine();

        System.out.print("Masukan Tahun Lahir   : ");
        tahunLahir = scan.nextInt();


        if (jenisKelamin.equalsIgnoreCase("L")) {
            jenisKelamin = "Laki-laki";
        } else if (jenisKelamin.equalsIgnoreCase("P")) {
            jenisKelamin = "Perempuan";
        } else {
            jenisKelamin = "Tidak diketahui";
        }


        int tahunSekarang = LocalDate.now().getYear();
        int umur = tahunSekarang - tahunLahir;

        System.out.println("\nData Diri :");
        System.out.println("Nama          : " + nama);
        System.out.println("Jenis Kelamin : " +jenisKelamin);
        System.out.println("Umur          : " + umur + "tahun");

        scan.close();

    }
}