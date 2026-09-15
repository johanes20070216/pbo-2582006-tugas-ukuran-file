import java.util.Scanner;

public class UkuranFile {

    // Ketentuan 3: konstanta double untuk pembagian, bukan angka int 1024
    static final double SATU_KB = 1024.0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nama file    : ");
        String namaFile = input.nextLine();

        System.out.print("Ukuran (byte): ");
        long ukuranByte = input.nextLong();

        // Ketentuan 2: pakai SATU_KB (double), bukan 1024 (int), supaya hasil
        // baginya tetap desimal, tidak dibulatkan diam-diam ke bawah lewat
        // pembagian bilangan bulat (integer division)
        double ukuranKB = ukuranByte / SATU_KB;
        double ukuranMB = ukuranKB / SATU_KB;
        double ukuranGB = ukuranMB / SATU_KB;

        // Ketentuan 4: casting eksplisit double -> int, memotong (truncate)
        // bagian desimal ukuranMB, bukan membulatkan; ada potensi data loss
        int mbDibulatkan = (int) ukuranMB;

        // Ketentuan 5: hasil hitungan disimpan ke variabel dulu, tidak diketik manual
        double selisihPembulatan = ukuranMB - mbDibulatkan;

        System.out.println();
        System.out.println("===== UKURAN FILE =====");
        System.out.println(namaFile);
        System.out.println("   " + ukuranByte + " byte");
        System.out.println("   " + ukuranKB + " KB");
        System.out.println("   " + ukuranMB + " MB");
        System.out.println("   " + ukuranGB + " GB");
        System.out.println();
        System.out.println("Dibulatkan ke MB : " + mbDibulatkan);
        System.out.println("Selisih pembulatan: " + selisihPembulatan);
    }
}