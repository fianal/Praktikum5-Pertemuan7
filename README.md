# Praktikum5-Pertemuan7
### Made By Alfian Nur Rizki
### NIM 312310665

<h1>Latihan</h1>

<p>Dari modul praktikum 3, tambahkan constructor pada masing-masing class dan tambahkan overload dan override constructor tersebut.</p>

<h1>Program Pegawai Menggunakan Constructor</h1>

![gambar](https://github.com/fianal/Praktikum5-Pertemuan7/blob/main/Pertemuan%207/pegawai.png)

<h1>Output Program</h1>

![gambar](https://github.com/fianal/Praktikum5-Pertemuan7/blob/main/Pertemuan%207/otpPgw7.png)

<h1>Studi Kasus </h1>

Sistem Bembelian Online dengan Keranjang Belanja

## Class Produk
+ <p>namaProduk: String</p>
+ <p>harga: Double</p>
+ <p>JumlahStok: Int</p>

+ <p>+Produk (nama, harga, jumlah)</p>
+ <p>+Displayinfo()</p>
Tambahkan Constructor 

## Subclass Produk: Elektronik, Pakaian, dan Makanan

## Elektronik
+ <p>-garansi: int</p>

+ <p>+displayinfo()</p>

## Pakaian
+ <p>-ukuran: int</p>
+ <p>-warna: string</p>

+ <p>+displayinfo()</p>

## Makanan
+ <P>-tanggalkadaluarsa: date</P>

+ <p>+displayinfo()</p>
Override pada method +displayinfo() setiap subclass

## Class KeranjangBelanja
+ <p>-produk: List<produk></produk>

+ <p>+tambahproduk(produk,jumlah)</p>
+ <p>+hitungTotalBelanja()</p>
+ <p>+displayKeranjang()</p>
tambahkan method tambahProduk(Produk p, int jumlah), untuk menambahkan produk ke dalam keranjang, dan periksa apakah stok produk mencukupi

## Class Main
+ <p>buat beberapa objek dari jenis yang berbeda, tambahkan beberapa produk ke KeranjangBelanja</p>
+ <p>Tampilkan total belanja dan isi keranjang menggunakan method displayKeranjang()</p>

<h1>Program Produk</h1>

![gambar](https://github.com/fianal/Praktikum5-Pertemuan7/blob/main/Pertemuan%207/produk.png)

<h1>Program Subclass</h1>

<h2>Elektronik : </h2>

![gambar](https://github.com/fianal/Praktikum5-Pertemuan7/blob/main/Pertemuan%207/elektronik.png)

<h2>Pakaian : </h2>

![gambar](https://github.com/fianal/Praktikum5-Pertemuan7/blob/main/Pertemuan%207/pakaian.png)

<h2>Makanan : </h2>

![gambar](https://github.com/fianal/Praktikum5-Pertemuan7/blob/main/Pertemuan%207/makanan.png)

<h1>Program Keranjang Belanja</h1>

![gambar](https://github.com/fianal/Praktikum5-Pertemuan7/blob/main/Pertemuan%207/keranjangbelanja.png)

<h1>Program Main</h1>

![gambar](https://github.com/fianal/Praktikum5-Pertemuan7/blob/main/Pertemuan%207/main.png)

<h1>Output Program Studi Kasus Produk</h1>

![gambar](https://github.com/fianal/Praktikum5-Pertemuan7/blob/main/Pertemuan%207/otp7fl.png)
