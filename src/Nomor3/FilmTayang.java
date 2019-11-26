package Nomor3;

public class FilmTayang {

    public static void main(String[] args) {
        Film avenger = new Film("avenger", "action", "18 - 11 - 2019", "13.00", "15.00");

        System.out.println(
                "====================================" +
                "\nfilm "        + avenger.getNama()       +
                "\nkategori "    + avenger.getKategori()   +
                "\ntanggal "     + avenger.getTanggal()    +
                "\njam mulai "   + avenger.getJamMulai()   +
                "\njam selesai " + avenger.getJamSelesai()
        );
    }
}
