package com.ryoukaii.javaiskey.studycase;

import java.util.Scanner;

public class TiketWisata {
    public TiketWisata(){
        Scanner scanner = new Scanner(System.in);
        int pilihan = 0;
        String nama = "";
        int totalBiaya = 0;
        boolean sudahMemasukkanIdentitas = false;

        while (pilihan != 4){
            System.out.println("\n======= Menu Tiket Wisata =======");
            System.out.println("1. Masukkan Identitas dan Pesan Tiket");
            System.out.println("2. Tambah Tiket");
            System.out.println("3. Tampilkan Total Biaya");
            System.out.println("4. Keluar");
            System.out.print("Masukkan pilihan Anda: ");
            pilihan = scanner.nextInt();

            if(pilihan == 1){
                if(!sudahMemasukkanIdentitas){
                    scanner.nextLine();
                    System.out.println("Masukkan Nama Anda : ");
                    nama = scanner.nextLine();

                    System.out.println("Jenis Tiket : ");
                    System.out.println("1. Pantai (Rp 50.000)");
                    System.out.println("2. Gunung (Rp 75.000)");
                    System.out.println("3. Taman Hiburan (Rp 100.000)");
                    System.out.println("4. Museum (Rp 30.000)");
                    System.out.print("Pilih jenis tiket (1-4): ");

                    int jenisTiket = scanner.nextInt();

                    System.out.print("Masukkan jumlah tiket yang ingin dipesan: ");
                    int jumlahTiket = scanner.nextInt();
                    int hargaTiket = 0;

                    if(jenisTiket == 1){
                        hargaTiket = 50000;
                    } else if (jenisTiket == 2) {
                        hargaTiket = 75000;
                    } else if (jenisTiket == 3) {
                        hargaTiket = 100000;
                    } else if (jenisTiket == 4) {
                        hargaTiket = 30000;
                    } else {
                        System.out.println("Pilihan tiket tidak valid.");
                    }

                    if(hargaTiket > 0){
                        totalBiaya += hargaTiket * jumlahTiket;
                        System.out.println("Pesanan Berhasil! Total Biaya Sementara" + totalBiaya);
                        sudahMemasukkanIdentitas = true;
                    }
                }else{
                    System.out.println("Anda sudah memasukkan identitas. Gunakan opsi 2 untuk menambah tiket.");
                }
            } else if (pilihan == 2) {
                if(sudahMemasukkanIdentitas){
                    System.out.println("Jenis Tiket : ");
                    System.out.println("1. Pantai (Rp 50.000)");
                    System.out.println("2. Gunung (Rp 75.000)");
                    System.out.println("3. Taman Hiburan (Rp 100.000)");
                    System.out.println("4. Museum (Rp 30.000)");
                    System.out.print("Pilih jenis tiket (1-4): ");
                    int jenisTiket = scanner.nextInt();

                    System.out.print("Masukkan jumlah tiket yang ingin ditambahkan : ");
                    int jumlahTiket = scanner.nextInt();

                    int hargaTiket = 0;
                    if (jenisTiket == 1) {
                        hargaTiket = 50000;
                    } else if (jenisTiket == 2) {
                        hargaTiket = 75000;
                    } else if (jenisTiket == 3) {
                        hargaTiket = 100000;
                    } else if (jenisTiket == 4) {
                        hargaTiket = 30000;
                    } else {
                        System.out.println("Pilihan tiket tidak valid.");
                    }

                    if(hargaTiket > 0){
                        totalBiaya += hargaTiket * jumlahTiket;
                        System.out.println("Tiket berhasil ditambahkan! Total Biaya Sementara: " + totalBiaya);
                    }
                }else{
                    System.out.println("Anda belum memasukkan identitas. Gunakan opsi 1 untuk memesan tiket terlebih dahulu.");
                }
            } else if (pilihan == 3) {
                System.out.println("Total Biaya saat ini: Rp " + totalBiaya);
            } else if (pilihan == 4) {
                System.out.println("Terima kasih telah menggunakan layanan kami, " + nama + "!");
            } else {
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
        scanner.close();
    }
}
