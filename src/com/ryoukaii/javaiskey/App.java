package com.ryoukaii.javaiskey;

import java.util.Scanner;
import com.ryoukaii.javaiskey.basic.*;
import com.ryoukaii.javaiskey.array.*;
import com.ryoukaii.javaiskey.arraylist.*;
import com.ryoukaii.javaiskey.oop.*;
import com.ryoukaii.javaiskey.studycase.*;
import com.ryoukaii.javaiskey.misc.*;

public class App{
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pilih program yang ingin dijalankan:");
        System.out.println("1. Aritmatika");
        System.out.println("2. Perbandingan");
        System.out.println("3. Logika");
        System.out.println("4. Penugasan");
        System.out.println("5. Increment/Decrement");
        System.out.println("6. Kalkulator");
        System.out.println("7. Kendaraan");
        System.out.println("8. Class dan Interface");
        System.out.println("9. Nama dan Usia");
        System.out.println("10. Menghitung Gaji");
        System.out.println("11. Tiket Wisata");
        System.out.println("12. Array");
        System.out.println("13. Array2D");
        System.out.println("14. Array3D");
        System.out.println("15. ArrayList1D");
        System.out.println("16. ArrayList2D");
        System.out.println("17. ArrayListClass");
        System.out.println("18. Konstruktor");
        System.out.println("19. Composition");
        System.out.println("20. Association");
        System.out.println("21. Aggregation");
        System.out.println("22. Inheritance");
        System.out.println("23. Encapsulation");
        System.out.println("24. Polymorphysm");

        System.out.print("Pilih nomor program: ");
        int input = scanner.nextInt();

        switch (input) {
            case 1 -> new Aritmatika();
            case 2 -> new Perbandingan();
            case 3 -> new Logika();
            case 4 -> new Penugasan();
            case 5 -> new IncrementDecrement();
            case 6 -> new Kalkulator();
            case 7 -> new Kendaraan();
            case 8 -> new ClassInterface();
            case 9 -> new NamaUsia();
            case 10 -> new MenghitungGaji();
            case 11 -> new TiketWisata();
            case 12 -> new Array();
            case 13 -> new Array2D();
            case 14 -> new Array3D();
            case 15 -> new ArrayList1D();
            case 16 -> new ArrayList2D();
            case 17 -> new ArrayListClass();
            case 18 -> new Konstruktor();
            case 19 -> new Composition();
            case 20 -> new Association();
            case 21 -> new Aggregation();
            case 22 -> new Inheritance();
            case 23 -> new Encapsulation();
            case 24 -> new Polymorphysm();
            default -> System.out.println("Input tidak valid.");
        }
        scanner.close();
    }
}

