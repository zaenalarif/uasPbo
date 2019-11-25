package Nomor1;

public class Dokter {

    private String lokasiBekerja;
    private String jabatan;
    private boolean punyaPraktik = false;
    private Integer jumlahAdministrasi = 0;
    private Integer jumlahPerawat = 0;
    private Integer jumlahPasien = 0;

    public Dokter(String lokasiBekerja, String jabatan, boolean punyaPraktik, Integer jumlahAdministrasi , Integer jumlahPerawat, Integer jumlahPasien) {
        this.lokasiBekerja = lokasiBekerja;
        this.jabatan = jabatan;
        this.punyaPraktik = punyaPraktik;
        if (this.isPunyaPraktik() == true){
            this.jumlahAdministrasi = jumlahAdministrasi;
            this.jumlahPerawat = jumlahPerawat;
            this.jumlahPasien = jumlahPasien;
        }
    }

    public Dokter(String lokasiBekerja, String jabatan, boolean punyaPraktik) {
        this.lokasiBekerja = lokasiBekerja;
        this.jabatan = jabatan;
        this.punyaPraktik = punyaPraktik;
    }

    public String getLokasiBekerja() {
        return lokasiBekerja;
    }

    public void setLokasiBekerja(String lokasiBekerja) {
        this.lokasiBekerja = lokasiBekerja;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public boolean isPunyaPraktik() {
        return punyaPraktik;
    }

    public void setPunyaPraktik(boolean punyaPraktik) {
        this.punyaPraktik = punyaPraktik;
    }

    public String getPraktik(){
        if (isPunyaPraktik()){
            return "punya praktik";
        }else{
            return "belum punya praktik";
        }
    }

    public Integer getJumlahAdministrasi() {
        return jumlahAdministrasi;
    }

    public void setJumlahAdministrasi(Integer jumlahAdministrasi) {
        this.jumlahAdministrasi = jumlahAdministrasi;
    }

    public Integer getJumlahPerawat() {
        return jumlahPerawat;
    }

    public void setJumlahPerawat(Integer jumlahPerawat) {
        this.jumlahPerawat = jumlahPerawat;
    }

    public Integer getJumlahPasien() {
        return jumlahPasien;
    }

    public void setJumlahPasien(Integer jumlahPasien) {
        this.jumlahPasien = jumlahPasien;
    }
}
