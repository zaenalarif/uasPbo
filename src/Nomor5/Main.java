package Nomor5;

public class Main {

    public static void main(String[] args) {
        Dokter mamang = new Dokter("mamang", "mata");
        Dokter bulma = new Dokter("bulma", "mata");
        Pasien oma    = new Pasien("oma", "rabun");

        System.out.println("pasien bernama " + oma.getNama() + " diperiksa dokter " + mamang.getNama() +
                " dan " + bulma.getNama());
    }
}
