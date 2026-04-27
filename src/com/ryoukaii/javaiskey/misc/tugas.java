package com.ryoukaii.javaiskey.misc;

import java.util.ArrayList;
import java.util.Scanner;

public class tugas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        int pilihan;
        do{
            System.out.println("Masukkan nama : ");
            String nama = scanner.nextLine();
            list.add(nama);
            System.out.println("Lanjut? (1) untuk lanjut, (2) untuk stop");
            pilihan = scanner.nextInt();
            scanner.nextLine(); 
            if(pilihan == 2){
                System.out.println("selesai");
            }else{
                System.out.println("tidak");
            }
        }while(pilihan == 1);
        scanner.close();
    }
}