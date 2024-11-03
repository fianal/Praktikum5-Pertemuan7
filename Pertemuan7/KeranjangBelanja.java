package Pertemuan7;

import java.util.ArrayList;
import java.util.List;

public class KeranjangBelanja {
    private List<Produk> produkList = new ArrayList<>();
    private List<Integer> jumlahList = new ArrayList<>();

    public void tambahProduk(Produk p, int jumlah) {
        if (p.jumlahStok >= jumlah) {
            produkList.add(p);
            jumlahList.add(jumlah);
            p.jumlahStok -= jumlah;
            System.out.println("Produk berhasil ditambahkan ke keranjang: " + p.namaProduk + ", Jumlah: " + jumlah);
        } else {
            System.out.println("Stok produk tidak mencukupi untuk: " + p.namaProduk);
        }
    }

    public double hitungTotalBelanja() {
        double total = 0;
        for (int i = 0; i < produkList.size(); i++) {
            total += produkList.get(i).harga * jumlahList.get(i);
        }
        return total;
    }

    public void displayKeranjang() {
        System.out.println("\nIsi Keranjang Belanja:");
        for (int i = 0; i < produkList.size(); i++) {
            Produk p = produkList.get(i);
            System.out.print("Produk: ");
            p.displayInfo();
            System.out.printf("Jumlah: %d\n", jumlahList.get(i));
            System.out.printf("Harga: %.2f\n", p.harga);
            System.out.println();
        }
        System.out.printf("Total Belanja: %.2f\n", hitungTotalBelanja());
    }
    
}

