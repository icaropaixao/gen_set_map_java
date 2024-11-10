package set_map_generics.set.introducao.tree;

 import java.util.Set;
 import java.util.TreeSet;

public class Tree2exemplo {
    public static void main(String[] args) {

        Set<Product> set = new TreeSet<>();

        set.add(new Product("TV", 900.0));
        set.add(new Product("Alpiste",10.00));
        set.add(new Product("Notebook", 1200.0));
        set.add(new Product("Tablet", 400.0));

        for (Product p : set) {
            System.out.println(p);
        }
    }
}