package Pertemuan7;

import java.util.Date;

public class Makanan extends Produk {
    private Date tanggalKadaluarsa;

    public Makanan(String namaProduk, double harga, int jumlahStok, Date tanggalKadaluarsa) {
        super(namaProduk, harga, jumlahStok);
        this.tanggalKadaluarsa = tanggalKadaluarsa;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Tanggal Kadaluarsa: " + tanggalKadaluarsa);
    }
}

