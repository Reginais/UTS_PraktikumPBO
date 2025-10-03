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
            case "Sapi":
                System.out.println(hewan.getNama() + " sedang makan rumput.");
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
            case "sapi":
                System.out.println(hewan.getNama() + " sedang tidur di sawah.");
                break;
            default:
                System.out.println(hewan.getNama() + " sedang tidur.");
                break;
        }
    }

    public void bersuara(Hewan hewan) {
        switch (hewan.getJenis().toLowerCase()) {
            case "kucing":
                System.out.println(hewan.getNama() + " berkata: Meow Meow");
                break;
            case "burung":
                System.out.println(hewan.getNama() + " berkata: Cuit Cuit");
                break;
            case "sapi":
                System.out.println(hewan.getNama() + " berkata: Moo Moo");
                break;
            default:
                System.out.println(hewan.getNama() + " bersuara...");
                break;
        }
    }
}

