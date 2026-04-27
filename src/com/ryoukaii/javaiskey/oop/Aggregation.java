package com.ryoukaii.javaiskey.oop;

import java.util.ArrayList;
import java.util.List;

class Perpustakaan {
    private String nama;
    private List<Buku> bukuList;

    public Perpustakaan(String nama) {
        this.nama = nama;
        this.bukuList = new ArrayList<>();
    }

    public void tambahBuku(Buku buku) {
        bukuList.add(buku);
    }

    public void tampilkanBuku() {
        System.out.println("Perpustakaan " + nama + " memiliki buku-buku berikut:");
        for (Buku buku : bukuList) {
            System.out.println("- " + buku.getJudul());
        }
    }
}

class Buku {
    private String judul;

    public Buku(String judul) {
        this.judul = judul;
    }

    public String getJudul() {
        return judul;
    }
}

public class Aggregation {
    public Aggregation() {
        Perpustakaan perpustakaan1 = new Perpustakaan("Perpustakaan Kota");
        Buku buku1 = new Buku("Pemrograman Java");
        Buku buku2 = new Buku("Dasar-dasar Algoritma");

        perpustakaan1.tambahBuku(buku1);
        perpustakaan1.tambahBuku(buku2);

        perpustakaan1.tampilkanBuku();

        perpustakaan1 = null;
    }
}
