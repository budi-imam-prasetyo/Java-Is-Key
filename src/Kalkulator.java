import java.util.Scanner;

public class Kalkulator {

    public Kalkulator() {
        Scanner input = new Scanner(System.in);

        System.out.println("Kalkulator Sederhana");
        System.out.print("Masukkan angka pertama: ");
        int num1 = input.nextInt();

        System.out.print("Operasi (+, -, *, /): ");
        String operator = input.next();

        System.out.print("Masukkan angka kedua: ");
        int num2 = input.nextInt();

        int result = 0;

        switch (operator) {
            case "+":
                result = tambah(num1, num2);
                break;
            case "-":
                result = kurang(num1, num2);
                break;
            case "*":
                result = kali(num1, num2);
                break;
            case "/":
                result = bagi(num1, num2);
                break;
            default:
                System.out.println("Operator tidak valid");
                return;
        }

        System.out.println("Hasil: " + result);
    }

    public int tambah(int a, int b) {
        return a + b;
    }

    public int kurang(int a, int b) {
        return a - b;
    }

    public int kali(int a, int b) {
        return a * b;
    }

    public int bagi(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Pembagi tidak boleh nol");
        }
        return a / b;
    }
}