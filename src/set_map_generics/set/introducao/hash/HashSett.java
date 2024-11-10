package set_map_generics.set.introducao.hash;
 import com.sun.source.tree.Tree;

 import java.util.LinkedHashSet;
 import java.util.Set;
 import java.util.TreeSet;
 import java.util.HashSet;


// SET EM JAVA
    /*
    Alguns métodos importantes
 • add(obj), remove(obj), contains(obj)
 • Baseado em equals e hashCode
 • Se equals e hashCode não existir, é usada comparação de ponteiros
 • clear()
 • size()
 • removeIf(predicate)
 • addAll(other) - união: adiciona no conjunto os elementos do outro conjunto, sem repetição
 • retainAll(other) - interseção: remove do conjunto os elementos não contitos em other
 • removeAll(other) - diferença: remove do conjunto os elementos contidos em other
     */ // metodos importantes
public class HashSett {
    public static void main(String[] args) {
        //Como as coleções Hash testam igualdade ?
        /*
        • Se hashCode e equals estiverem implementados:

             • Primeiro hashCode. Se der igual, usa equals para confirmar.
             • Lembre-se: String, Integer, Double, etc. já possuem equals e hashCode
             • Se hashCode e equals NÃO estiverem implementados:
             • Compara as referências (ponteiros) dos objetos.

         */

        // • HashSet- mais rápido (operações O(1) em tabela hash) e não ordenado
        // exemplo
        Set<String> set = new TreeSet<>();

        set.add("TV");
        set.add("Notebook");
        set.add("Tablet");

        System.out.println(set.contains("Notebook"));

        for (String p : set) {
            System.out.println(p);
        }

    }

}

