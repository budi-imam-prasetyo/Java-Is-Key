import java.util.ArrayList;
import java.util.Scanner;
//import java.util.List;

public class ArrayList1D {
    public ArrayList1D() {
        Scanner input = new Scanner(System.in);
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        String firstFruit = fruits.getFirst();
        System.out.println("First fruit: " + fruits.getFirst());
        fruits.set(0, "Mango");
        System.out.println("Updated fruits: " + fruits.getFirst());
    }
}
