package com.ryoukaii.javaiskey.oop;

public class Kendaraan {
    public Kendaraan() {
        final int JUMLAH_RODA = 4;
        final double KAPASITAS_MESIN_MAX = 3.0;

        String merk = "Toyota";
        String model = "Avanza";
        String warna = "Putih";
        int tahunProduksi = 2020;
        double harga = 200_000_000;

        System.out.println("Informasi Mobil:");
        System.out.println("Merk: " + merk);
        System.out.println("Model: " + model);
        System.out.println("Warna: " + warna);
        System.out.println("Tahun Produksi: " + tahunProduksi);
        System.out.println("Harga: Rp " + harga);
        System.out.println("Jumlah Roda: " + JUMLAH_RODA);
        System.out.println("Kapasitas Mesin Maksimal: " + KAPASITAS_MESIN_MAX + " liter");
    }
}
