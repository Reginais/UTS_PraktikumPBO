package hewan;

/**
 *
 * @author regina
 */


public class Hewan {
    private String namaHewan;
    private int umurHewan;
    private String jenisHewan;  

    public Hewan(String namaHewan, int umurHewan, String jenisHewan) {
        this.namaHewan = namaHewan;
        this.umurHewan = umurHewan;
        this.jenisHewan = jenisHewan;
    }

    public String getNama() {
        return namaHewan;
    }

    public void setNama(String nama) {
        this.namaHewan = nama;
    }

    public int getUmur() {
        return umurHewan;
    }

    public void setUmur(int umur) {
        this.umurHewan= umur;
    }

    public String getJenis() {
        return jenisHewan;
    }

    public void setJenis(String jenis) {
        this.jenisHewan = jenis;
    }

    public void tampilkanDaftarHewan() {
    System.out.println("Nama : " + namaHewan);
    System.out.println("Umur : " + umurHewan + " tahun");
    System.out.println("Jenis : " + jenisHewan);
}

}

