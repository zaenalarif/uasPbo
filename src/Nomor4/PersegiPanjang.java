package Nomor4;

public class PersegiPanjang extends BangunDatar{

    private Integer luas = 0;
    private Integer keliling = 0;

    public PersegiPanjang(Integer panjang, Integer lebar) {
        super(panjang, lebar);
        this.luas = super.getPanjang() * super.getLebar();
        this.keliling = 2 * (super.getPanjang() + super.getLebar());
    }

    public void setLuas(){
        this.luas = super.getPanjang() * super.getLebar();
    }

    public void setKeliling(){
        this.keliling = 2 * (super.getPanjang() + super.getLebar());
    }

    public Integer getLuas() {
        return this.luas;
    }

    public Integer getKeliling() {
        return keliling;
    }
}
