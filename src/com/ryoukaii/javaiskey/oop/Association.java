package com.ryoukaii.javaiskey.oop;

import java.util.ArrayList;
import java.util.List;

class Dosen{
    private String nama;
    private List<Mahasiswa> mahasiswaList;

    public Dosen(String nama) {
        this.nama = nama;
        this.mahasiswaList = new ArrayList<>();
    }

    public void tambahMahasiswa(Mahasiswa mhs) {
        mahasiswaList.add(mhs);
        mhs.setDosen(this);
    }

    public String getNama() {
        return nama;
    }

    public List<Mahasiswa> getMahasiswaList() {
        return mahasiswaList;
    }
}

class Mahasiswa {
    private String nama;
    private Dosen dosen;

    public Mahasiswa(String nama) {
        this.nama = nama;
    }

    public void setDosen(Dosen dosen) {
        this.dosen = dosen;
    }

    public String getNama() {
        return nama;
    }

    public Dosen getDosen() {
        return dosen;
    }
}

public class Association    {
    public Association() {
        Dosen dosen1 = new Dosen("Dr. Yudi");
        Dosen dosen2 = new Dosen("Prof. Sukenda");
        Mahasiswa mhs1 = new Mahasiswa("Lina");
        Mahasiswa mhs2 = new Mahasiswa("Hardian");
        Mahasiswa mhs3 = new Mahasiswa("Acid");

        dosen1.tambahMahasiswa(mhs1);
        dosen1.tambahMahasiswa(mhs2);
        dosen2.tambahMahasiswa(mhs3);

        System.out.println(mhs1.getNama() + " diajar oleh " + mhs1.getDosen().getNama());
        System.out.println(mhs2.getNama() + " diajar oleh " + mhs2.getDosen().getNama());
        System.out.println(mhs3.getNama() + " diajar oleh " + mhs3.getDosen().getNama());
    }
}
