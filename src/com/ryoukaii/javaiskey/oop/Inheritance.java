package com.ryoukaii.javaiskey.oop;

// SuperClass (Parent Class)
class KendaraanPewarisan {
    String merk;
    int tahun;

    KendaraanPewarisan(String merk, int tahun){
        this.merk = merk;
        this.tahun = tahun;
    }

    void info(){
        System.out.println("Merk: " + merk + ", Tahun: " + tahun);
    }

}
// SubcClass (Child Class)
class MobilPewarisan extends KendaraanPewarisan {
    int jumlahPintu;

    MobilPewarisan(String merk, int tahun, int jumlahPintu){
        super(merk, tahun);
        this.jumlahPintu = jumlahPintu;
    }

    void tampilkanInfo(){
        super.info();
        System.out.println("Jumlah Pintu: " + jumlahPintu);
    }
}

// SuperClass (Parent Class)
class Hewan{
    public String jenis;
    protected int umur;

    public Hewan(String jenis, int umur) {
        this.jenis = jenis;
        this.umur = umur;
    }

    public void suara(){
        System.out.println("Hewan membuat suara.");
    }
}

// SubcClass (Child Class) Mewarisi dari Kendaraan
class Kucing extends Hewan {
    public Kucing(String jenis, int umur) {
        super(jenis, umur);
    }

    public void tampilkanInfo(){
        System.out.println("Jenis: " + jenis + ", Umur: " + umur + " tahun");
        suara();
    }
}

class Tumbuhan{
    String nama;

    public Tumbuhan(String nama) {
        this.nama = nama;
    }
}

class Bunga extends Tumbuhan {
    public Bunga(String nama) {
        super(nama);
    }

    public void tampilkanNama(){
        System.out.println("Nama Bunga: " + nama);
    }
}

//class KendaraanPewarisan2 {
//    public void bergerak(){
//        System.out.println("Kendaraan Bergerak");
//    }
//}
//
//class AlatTransportasi{
//    public void alatTransportasi(){
//        System.out.println("Ini alat transportasi");
//    }
//}
//
//class Mobil extends KendaraanPewarisan2, AlatTransportasi{
//    public void info(){
//        bergerak();
//    }
//}

public class Inheritance {
    public Inheritance() {
        System.out.println();
        MobilPewarisan mobil = new MobilPewarisan("Toyota", 2021, 4);
        mobil.tampilkanInfo();

        System.out.println();
        Kucing kucing1 = new Kucing("Persia", 3);
        kucing1.tampilkanInfo();

        System.out.println();
        Bunga bunga1 = new Bunga("Mawar");
        bunga1.tampilkanNama();
    }
}
