package Nomor1;

public class DokterBeraksi {

    public static void main(String[] args) {
        Dokter saipul = new Dokter("Belum di ketahui", "Kepala Puskesmas", false);
        System.out.println(
                "Dokter Saipul bekerja di lokasi " + saipul.getLokasiBekerja() +
                "\nDengan Jabatan sebagai " + saipul.getJabatan() +
                "\n" + saipul.getPraktik() +
                "\nDengan jumlah administrasi " + saipul.getJumlahAdministrasi().toString() +
                "\nDengan jumlah perawat " + saipul.getJumlahPerawat().toString() +
                "\nDengan jumlah Pasien " + saipul.getJumlahPasien().toString()

        );
    }
}
