package Nomor4;

public class Main {

    public static void main(String[] args){

        PersegiPanjang persegiPanjang1 = new PersegiPanjang(2,4);

        System.out.println("Luas Persegi Panjang = " + persegiPanjang1.getLuas().toString());
        System.out.println("Keliling persegi panjang = " + persegiPanjang1.getKeliling().toString());

        Balok balok1 = new Balok(3,4,5);

        System.out.println("Volume balok = " + balok1.getVolume().toString());
    }
}
