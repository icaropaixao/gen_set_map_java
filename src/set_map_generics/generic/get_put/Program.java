package set_map_generics.generic.get_put;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

// PRINCIPIO GET PUT EM GENERICS
/*
Vamos fazer um método que copia os elementos de uma lista para uma
outra lista que pode ser mais genérica que a primeira.
*/
public class Program {
    public static void main(String[] args) {

        List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
        List<Double> myDoubles = Arrays.asList(3.14, 6.28);
        List<Object> myObjs = new ArrayList<Object>();
        copy(myInts, myObjs);
        copy(myDoubles, myObjs);
    }
}
