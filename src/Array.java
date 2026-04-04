public class Array {
    public Array(){
        int[] angka = {10, 20, 30, 40, 50};
        String[] buah = {"Apel", "Pisang", "Jeruk", "Mangga", "Anggur"};
        int[] angkaKosong = new int[5];
        angkaKosong [0] = 5;
        angkaKosong [1] = 15;
        angkaKosong [2] = 25;
        angkaKosong [3] = 35;
        angkaKosong [4] = 45;

        System.out.println("Elemen dalam array 'angka' : ");
        for (int j : angka) {
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println();
        System.out.println("Elemen dalam array 'buah' : ");
        for (String s : buah) {
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.println();
        System.out.println("Elemen dalam array 'angkaKosong' : ");
        for (int j : angkaKosong) {
            System.out.print(j + " ");
        }
    }
}
