package set_map_generics.generic.get_put;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

// PRINCIPIO GET PUT EM GENERICS

public class Program {
    public static void main(String[] args) {

        // exemplos explicações e erros
        /*
       // Princípio get/put- covariância (GET = OK / PUT = ERROR)
        List<Integer> intList = new ArrayList<Integer>();

        intList.add(10);
        intList.add(5);

        List<? extends Number> list = intList;
        Number x = list.get(0);

        list.add(20); // erro de compilacao

        // --------------------------------------------------

        // Princípio get/put- contravariância (GET = ERROR / PUT = OK)

        List<Object> myObjs = new ArrayList<Object>();

        myObjs.add("Maria");
        myObjs.add("Alex");
        List<? super Number> myNums = myObjs;
        myNums.add(10);
        myNums.add(3.14);
        Number x = myNums.get(0); // erro de compilacao

        */

        // exemplo prática
        /*Vamos fazer um método que copia os elementos de uma lista para uma
        outra lista que pode ser mais genérica que a primeira */

        List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
        List<Double> myDoubles = Arrays.asList(3.14, 6.28);
        List<Object> myObjs = new ArrayList<Object>();
        copy(myInts, myObjs);
        printList(myObjs);
        copy(myDoubles, myObjs);
        printList(myObjs);

    }

    // metodo Copy
    public static void copy(List<? extends Number> source, List<? super Number> destiny) {
        for(Number number : source) {
            destiny.add(number);
        }
    }

    // metodo de print
    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }


}
