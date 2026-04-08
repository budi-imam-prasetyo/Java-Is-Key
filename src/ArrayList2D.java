import java.util.ArrayList;

public class ArrayList2D {
    public ArrayList2D(){
        ArrayList<ArrayList<String>> fruits = new ArrayList<>();

        ArrayList<String> fruitList1 = new ArrayList<>();
        fruitList1.add("Apple");
        fruitList1.add("Banana");
        fruitList1.add("Cherry");
        fruits.add(fruitList1);

        ArrayList<String> fruitList2 = new ArrayList<>();
        fruitList2.add("Mango");
        fruitList2.add("Durian");
        fruitList2.add("Grape");
        fruits.add(fruitList2);

        for(ArrayList<String> fruitList : fruits) {
            for(String fruit : fruitList) {
                System.out.print(fruit + " ");
            }
            System.out.println();
        }
    }
}
