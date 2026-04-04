import java.util.Scanner;

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
        System.out.print("pilih nomor program : ");
        int input = scanner.nextInt();
        switch(input){
            case 1:
                new Aritmatika();
                break;
            case 2:
                new Perbandingan();
                break;
            case 3:
                new Logika();
                break;
            case 4:
                new Penugasan();
                break;
            case 5:
                new IncrementDecrement();
                break;
            case 6:
                new Kalkulator();
                break;
            case 7:
                new Kendaraan();
                break;
            case 8:
                new ClassInterface();
                break;
            case 9:
                new NamaUsia();
                break;
            case 10:
                new MenghitungGaji();
                break;
            case 11:
                new TiketWisata();
                break;
            case 12:
                new Array();
                break;
            default:
                System.out.println("Input tidak valid.");
                return;
        }
    }
}

