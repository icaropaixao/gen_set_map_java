package set_map_generics.generic.curinga.application;



// TIPOS GENERICS CURINGA
/*
Com tipos curinga podemos fazer métodos
que recebem um genérico de "qualquer tipo".
O curinga (?) representa um tipo desconhecido,
permitindo que o método seja mais flexível.
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        // exemplo 1: Usando tipo curinga (?) para aceitar qualquer tipo de lista
        List<?> myObjs = new ArrayList<Object>(); // Declaração de uma lista que pode conter qualquer tipo
        List<Integer> myNumbers = new ArrayList<Integer>(); // Lista específica de Integer

        myObjs = myNumbers; // Atribuição permitida, pois myObjs aceita qualquer tipo (graças ao curinga)

        // exemplo 2: Passando uma lista de Integer para um método que aceita qualquer tipo de lista
        List<Integer> myInts = Arrays.asList(5, 2, 10); // Lista com números inteiros
        printList(myInts); // Chamando o método printList com uma lista de Integer
    }

    // metodo para o exemplo 2
    // Este método recebe uma lista de qualquer tipo (List<?>), e imprime os elementos
    public static void printList(List<?> list) {
        for (Object obj : list) { // Iteração sobre os elementos da lista
            System.out.println(obj); // Imprime cada elemento, independente do tipo
        }
    }
}
