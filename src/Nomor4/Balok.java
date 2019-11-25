package Nomor4;

public class Balok extends BangunDatar {

    private Integer tinggi;
    private Integer volume;
    
    public Balok(Integer panjang, Integer lebar, Integer tinggi){
        super(panjang, lebar);
        this.tinggi = tinggi;
        this.volume = super.getPanjang() * super.getLebar() * tinggi;
    }

    public void setVolume(){
        this.volume = super.getPanjang() * super.getLebar() * this.tinggi;
    }
    
    public Integer getVolume(){
        return this.volume;
    }
}
