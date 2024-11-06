package set_map_generics.generic.curinga.application;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

// TIPOS GENERICS CURINGA
/*
Com tipos curinga podemos fazer métodos
que recebem um genérico de "qualquer tipo"
 */

public class Program {
    public static void main(String[] args) {

        // exemplo 1
        List<?> myObjs = new ArrayList<Object>();
        List<Integer> myNumbers = new ArrayList<Integer>();
        myObjs = myNumbers;


        // exemplo 2
        List<Integer> myInts = Arrays.asList(5, 2, 10);
        printList(myInts);

    }
    // metodo para o exemplo 2
    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }


}