package Pertemuan7;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Membuat objek produk
        Elektronik laptop = new Elektronik("Laptop", 10000000, 5, 24);
        Pakaian kaos = new Pakaian("Kaos", 100000, 20, 42, "Merah");
        Makanan roti = new Makanan("Roti", 15000, 50, new Date());

        // Membuat keranjang belanja
        KeranjangBelanja keranjang = new KeranjangBelanja();

        // Menambahkan produk ke keranjang
        keranjang.tambahProduk(laptop, 1);
        keranjang.tambahProduk(kaos, 2);
        keranjang.tambahProduk(roti, 5);

        // Menampilkan isi keranjang dan total belanja
        keranjang.displayKeranjang();
    }
}

