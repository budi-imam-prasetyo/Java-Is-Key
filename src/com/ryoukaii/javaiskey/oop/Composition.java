package com.ryoukaii.javaiskey.oop;

import java.util.ArrayList;
import java.util.List;

class Rumah{
    private String alamat;
    private List<Kamar> kamarList;

    public Rumah(String alamat, String nama1, String nama2, String nama3) {
        this.alamat = alamat;
        this.kamarList = new ArrayList<>();
        kamarList.add(new Kamar(nama1));
        kamarList.add(new Kamar(nama2));
        kamarList.add(new Kamar(nama3));
    }

    public String getAlamat(){
        return alamat;
    }

    public void tampilkanKamar() {
        System.out.println("Rumah di alamat " + alamat + " memiliki kamar-kamar berikut:");
        for (Kamar kamar : kamarList) {
            System.out.println("- " + kamar.getNama());
        }
    }
}


class Kamar {
    private String nama;

    public Kamar(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }
}

public class Composition {
    public Composition(){
        Rumah rumah1 = new Rumah("Jl. Merdeka No. 123", "Kamar Tidur", "Kamar Mandi", "Ruang Tamu");
        rumah1.tampilkanKamar();

        rumah1 = null;
    }
}