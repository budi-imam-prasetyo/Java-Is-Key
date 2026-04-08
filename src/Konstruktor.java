class Mobil {
    String merk;
    int kecepatan;

    Mobil() {
        this.merk = "Tidak Diketahui";
        this.kecepatan = 0;
    }

    void tampilkanKecepatan() {
        System.out.println("Kecepatan mobil " + merk + ": " + kecepatan + " km/h");
    }
}

public class Konstruktor {
    public Konstruktor() {
        Mobil mobil1 = new Mobil();
        Mobil mobil2 = new Mobil();

        System.out.println("sebelum diubah:");
        mobil1.tampilkanKecepatan();
        mobil2.tampilkanKecepatan();

        mobil1.merk = "Toyota";
        mobil1.kecepatan = 100;

        mobil2.merk = "Honda";
        mobil2.kecepatan = 120;

        System.out.println("\nSetelah diubah:");
        mobil1.tampilkanKecepatan();
        mobil2.tampilkanKecepatan();
    }
}