package set_map_generics.generic.delimitado.services;

import java.util.List;

public class CalculationService {

    // Método genérico que encontra o maior elemento de uma lista
    // <T extends Comparable<T>> significa que T precisa implementar Comparable para poder comparar elementos
    public static <T extends Comparable<? super T>> T max(List<T> list) {

        // Verifica se a lista está vazia; se sim, lança uma exceção
        if (list.isEmpty()) {
            throw new IllegalStateException("Lista é vazia");
        }

        // Inicializa a variável max com o primeiro elemento da lista
        T max = list.get(0);

        // Percorre todos os itens da lista para encontrar o maior
        for (T item : list) {
            // Compara cada item da lista com o atual maior elemento (max)
            // Se o item atual for maior que max, ele se torna o novo max
            if (item.compareTo(max) > 0) {
                max = item;
            }
        }

        // Retorna o maior elemento encontrado na lista
        return max;
    }

}
