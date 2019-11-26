package Nomor5;

public class Pasien {
    /**
     * nama
     * penyakit >= 1
     */
    private String nama;
    private String penyakit;
//    private Dokter namaDokter;


    public Pasien(String nama, String penyakit) {
        this.nama = nama;
        this.penyakit = penyakit;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPenyakit() {
        return penyakit;
    }

    public void setPenyakit(String penyakit) {
        this.penyakit = penyakit;
    }

//    public void setNamaDokter(Dokter nama){
//        this.namaDokter = nama;
//    }
//
//    public Dokter getNamaDokter() {
//        return namaDokter;
//    }
}
