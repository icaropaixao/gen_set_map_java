package set_map_generics.set.introducao.tree;
 import java.util.Arrays;
 import java.util.Set;

public class Tree1exemplo {

    public static void main(String[] args) {

        /* TreeSet- mais lento (operações O(log(n)) em árvore rubro-negra) e ordenado
        pelo compareTo do objeto (ou Comparator */

        Set<Integer> a = new java.util.TreeSet<>(Arrays.asList(0,2,4,5,6,8,10));
        Set<Integer> b = new java.util.TreeSet<>(Arrays.asList(5,6,7,8,9,10));

        //union
        Set<Integer> c = new java.util.TreeSet<>(a);
        c.addAll(b);
        System.out.println(c);

        //intersection
        Set<Integer> d = new java.util.TreeSet<>(a);
        d.retainAll(b);
        System.out.println(d);

        //difference
        Set<Integer> e = new java.util.TreeSet<>(a);
        e.removeAll(b);
        System.out.println(e);

    }
}
