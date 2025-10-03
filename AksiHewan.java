package aksihewan;

/**
 *
 * @author regina
 */

import hewan.Hewan;

public class AksiHewan {

    public void makan(Hewan hewan) {
        switch (hewan.getJenis().toLowerCase()) {
            case "kucing":
                System.out.println(hewan.getNama() + " sedang makan daging.");
                break;
            case "burung":
                System.out.println(hewan.getNama() + " sedang makan kacang-kacang.");
                break;
            case "ikan":
                System.out.println(hewan.getNama() + " sedang makan cacing.");
                break;
            default:
                System.out.println(hewan.getNama() + " sedang makan makanan umum.");
                break;
        }
    }

    public void tidur(Hewan hewan) {
        switch (hewan.getJenis().toLowerCase()) {
            case "kucing":
                System.out.println(hewan.getNama() + " sedang tidur di lantai.");
                break;
            case "burung":
                System.out.println(hewan.getNama() + " sedang tidur di sarang.");
                break;
            case "ikan":
                System.out.println(hewan.getNama() + " sedang tidur di kolam.");
                break;
            default:
                System.out.println(hewan.getNama() + " sedang tidur.");
                break;
        }
    }

    public void bersuara(Hewan hewan) {
        switch (hewan.getJenis().toLowerCase()) {
            case "kucing":
                System.out.println(hewan.getNama() + " berkata: Meow! Meow!");
                break;
            case "burung":
                System.out.println(hewan.getNama() + " berkata: Cuit! Cuit!");
                break;
            case "ikan":
                System.out.println(hewan.getNama() + " berkata: blup blup");
                break;
            default:
                System.out.println(hewan.getNama() + " bersuara.");
                break;
        }
    }
}

