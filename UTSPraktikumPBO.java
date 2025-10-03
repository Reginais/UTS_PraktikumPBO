package utspraktikumpbo;

import hewan.Hewan;
import aksihewan.AksiHewan;
import java.util.Scanner;

public class UTSPraktikumPBO {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Hewan hewan = null;
        AksiHewan aksi = new AksiHewan();
        int pilih;

        do {
            System.out.println("\n Menu ");
            System.out.println("1. Tambah Hewan");
            System.out.println("2. Lihat Daftar Hewan");
            System.out.println("3. Interaksi Hewan");
            System.out.println("4. Keluar");
            System.out.print("Pilih Menu: ");
            pilih = input.nextInt();
            input.nextLine(); 

            switch (pilih) {
                case 1 -> {
                    System.out.print("Nama Hewan: ");
                    String nama = input.nextLine();
                    System.out.print("Umur: ");
                    int umur = input.nextInt(); input.nextLine();
                    System.out.print("Jenis Hewan: ");
                    String jenis = input.nextLine();
                    hewan = new Hewan(nama, umur, jenis);
                    System.out.println("Hewan berhasil ditambahkan!");
                }

                case 2 -> {
                    if(hewan == null) System.out.println("Belum ada hewan!");
                    else hewan.tampilkanDaftarHewan();
                }

                case 3 -> {
                    if(hewan == null) System.out.println("Belum ada hewan!");
                    else interaksiHewan(hewan, aksi, input);
                }

                case 4 -> System.out.println("Terima kasih!");

                default -> System.out.println("Pilihan salah!");
            }

        } while(pilih != 4);

        input.close();
    }

    public static void interaksiHewan(Hewan h, AksiHewan aksi, Scanner input) {
        boolean pilihAksi = true;
        while(pilihAksi) {
            System.out.println("\n Aksi Hewan ");
            System.out.println("1. Makan");
            System.out.println("2. Tidur");
            System.out.println("3. Bersuara");
            System.out.println("4. Kembali ke Menu Utama");
            System.out.print("Pilih aksi: ");
            int aksiPilihan = input.nextInt(); input.nextLine();

            switch (aksiPilihan) {
                case 1 -> aksi.makan(h);
                case 2 -> aksi.tidur(h);
                case 3 -> aksi.bersuara(h);
                case 4 -> pilihAksi = false;
                default -> System.out.println("Pilihan salah!");
            }
        }
    }
}
