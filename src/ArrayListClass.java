import java.util.ArrayList;
import java.util.Scanner;

class DataMahasiswa {
    String nama;
    int umur;
    String prodi;

    public DataMahasiswa(String nama, int umur, String prodi) {
        this.nama = nama;
        this.umur = umur;
        this.prodi = prodi;
    }

    public void Display(){
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
        System.out.println("Prodi: " + prodi);
        System.out.println();
    }
}

public class ArrayListClass {
    public ArrayListClass() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<DataMahasiswa> dataList = new ArrayList<>();

        dataList.add(new DataMahasiswa("Alice", 20, "Informatika"));
        dataList.add(new DataMahasiswa("Bob", 21, "Sistem Informasi"));
        dataList.add(new DataMahasiswa("Charlie", 22, "Teknik Komputer"));

        int pilihan;
        do{
            System.out.println("Menu:");
            System.out.println("1. Tampilkan Data Mahasiswa");
            System.out.println("2. Tambah Data Mahasiswa");
            System.out.println("3. Ubah Data Mahasiswa");
            System.out.println("4. Hapus Data Mahasiswa");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    for (DataMahasiswa data : dataList) {
                        data.Display();
                    }
                    break;
                case 2:
                    System.out.print("Masukkan nama: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan umur: ");
                    int umur = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Masukkan prodi: ");
                    String prodi = scanner.nextLine();
                    dataList.add(new DataMahasiswa(nama, umur, prodi));
                    break;
                case 3:
                    System.out.println("Ini function ubah.");
                    break;
                case 4:
                    System.out.println("Ini function hapus.");
                    break;
                case 5:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }while(pilihan != 5);
        scanner.close();
    }
}
