package Nomor3;

public class MemoriBeraksi {

    public static void main(String[] args) {
        Memori memoriBeraksi = new Memori();
        memoriBeraksi.setKapasitas(2);
        memoriBeraksi.setMerk("bata");
        memoriBeraksi.setUkuran(30);

        System.out.println("memori berkapasitas " + memoriBeraksi.getKapasitas() +
                " bermerk " + memoriBeraksi.getMerk() +
                " berukuran " + memoriBeraksi.getUkuran()
                );
    }
}
