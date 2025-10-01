package tiket;

/**
 *
 * @author regina
 */

public class Tiket {
    private String namaKonser;
    private String lokasi;
    private double harga;
    private String tanggalKonser;

    public Tiket(String namaKonser, String lokasi, double harga, String tanggalKonser) {
        this.namaKonser = namaKonser;
        this.lokasi = lokasi;
        this.harga = harga;
        this.tanggalKonser = tanggalKonser;
    }

    public String getNamaKonser() { return namaKonser; }
    public String getLokasi() { return lokasi; }
    public double getHarga() { return harga; }
    public String getTanggalKonser() { return tanggalKonser; }

    public void tanggalKonser() {
        System.out.println(namaKonser + " - " + lokasi +
                " | Tanggal: " + tanggalKonser +
                " | Harga Rp" + harga);
    }
}

