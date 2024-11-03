package Pertemuan7;

public class Elektronik extends Produk {
    private int garansi;

    public Elektronik(String namaProduk, double harga, int jumlahStok, int garansi) {
        super(namaProduk, harga, jumlahStok);
        this.garansi = garansi;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();  // Memanggil displayInfo dari Produk
        System.out.println("Garansi (bulan): " + garansi);
    }
}


