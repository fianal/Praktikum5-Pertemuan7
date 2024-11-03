package Pertemuan7;

public class Pakaian extends Produk {
    private int ukuran;
    private String warna;

    public Pakaian(String namaProduk, double harga, int jumlahStok, int ukuran, String warna) {
        super(namaProduk, harga, jumlahStok);
        this.ukuran = ukuran;
        this.warna = warna;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Ukuran: " + ukuran);
        System.out.println("Warna: " + warna);
    }
}

