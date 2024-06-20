package arraylist;
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> idades = new ArrayList<>();

        idades.add(22);
        idades.add(50);
        idades.add(45);

        idades.remove(0);

        int idadeAtIndex1 = idades.get(1);
        System.out.println("Element at index 1: " + idadeAtIndex1);

        int tamanho = idades.size();
        System.out.println("Size of ArrayList: " + tamanho);
    }
}
