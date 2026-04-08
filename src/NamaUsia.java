import java.util.Scanner;

public class NamaUsia {
    public NamaUsia(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama Anda: ");
        String name = input.nextLine();
        System.out.print("Masukkan nama Anda: ");
        String age = input.nextLine();

        System.out.println("Halo, " + name + "! Anda Berusia " + age + " tahun.");
        input.close();

    }
}
