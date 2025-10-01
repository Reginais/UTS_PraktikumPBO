package utspraktikumpbo;

/**
 *
 * @author regina
 */

import tiket.Tiket;
import java.util.Scanner;

public class UTSPraktikumPBO {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Tiket[] daftarTiket = {
            new Tiket("EXO World Tour", "Seoul", 5000000, "1 Desember 2025"),
            new Tiket("BTS World Tour", "Jakarta", 5000000, "20 Mei 2026"),
            new Tiket("EXO World Tour", "Seoul", 5000000, "1 Desember 2025"),
        };

        boolean jalan = true;
        while (jalan) {
            System.out.println("\n TIKET KONSER K-POP ");
            System.out.println("1. Daftar Konser");
            System.out.println("2. Beli Tiket");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            int pilih = input.nextInt();
            input.nextLine();

            switch (pilih) {
                case 1 -> {
                    System.out.println("\n Daftar Konser ");
                    for (int i = 0; i < daftarTiket.length; i++) {
                        System.out.print((i + 1) + ". ");
                        daftarTiket[i].tanggalKonser();
                    }
                }

                case 2 -> {
                    System.out.println("\n Pilih konser ");
                    for (int i = 0; i < daftarTiket.length; i++) {
                        System.out.print((i + 1) + ". ");
                        daftarTiket[i].tanggalKonser();
                    }
                    System.out.print("Nomor konser: ");
                    int idx = input.nextInt() - 1;
                    input.nextLine();

                    if (idx >= 0 && idx < daftarTiket.length) {
                        System.out.print("Nama pembeli : ");
                        String namaPembeli = input.nextLine();
                        System.out.print("Email        : ");
                        String alamat = input.nextLine();
                        System.out.print("Jumlah tiket : ");
                        int jml = input.nextInt();

                        double total = jml * daftarTiket[idx].getHarga();

                        System.out.println("\n Tiket Konser");
                        System.out.println("Nama Konser : " + daftarTiket[idx].getNamaKonser());
                        System.out.println("Lokasi      : " + daftarTiket[idx].getLokasi());
                        System.out.println("Tanggal     : " + daftarTiket[idx].getTanggalKonser());
                        System.out.println("Nama Pembeli: " + namaPembeli);
                        System.out.println("Email       : " + alamat);
                        System.out.println("Jumlah Tiket: " + jml);
                        System.out.printf("Total Harga : Rp%,.0f\n", total);
                        System.out.println("Tunjukkan tiket ini saat masuk ke konser.");
                    } else {
                        System.out.println("Konser tidak valid!");
                    }
                }

                case 3 -> {
                    jalan = false;
                    System.out.println("\n TERIMA KASIH ");
                }

                default -> System.out.println("\n Pilihan tidak valid");
            }
        }

        input.close();
    }
}
