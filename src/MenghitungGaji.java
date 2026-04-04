import java.util.Scanner;

public class MenghitungGaji {
    public MenghitungGaji(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan Gaji Karyawan: ");
        int gaji = scanner.nextInt();
        System.out.println("Masukkan Upah Lembur per Hari: ");
        int upahLembur = scanner.nextInt();
        System.out.println("Masukkan Jumlah Hari Lembur: ");
        int hariLembur = scanner.nextInt();
        int gajiAwal = gaji;
        for(int i = 0; i < hariLembur; i++){
            gaji += upahLembur;
        }
        System.out.println("Gaji Awal: " + gajiAwal);
        System.out.println("Gaji Akhir: " + gaji);
        scanner.close();
    }
}
