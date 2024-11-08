package set_map_generics.hascode_equals.introducao.application;

import set_map_generics.hascode_equals.introducao.entities.Client;

public class Hash_equals_exemple {
    public static void main(String[] args) {

        // Equals
        /*Método que compara se o objeto é igual a outro, retornando
        true ou false. */

        String a = "Maria";
        String b = "Alex";
        System.out.println(a.equals(b));

        //HashCode
        /*Método que retorna um número inteiro representando um código gerado
        a partir das informações do objeto */
        String c = "Maria";
        String d = "Alex";
        System.out.println(c.hashCode());
        System.out.println(d.hashCode());


        // usando o equal e hashCode para verificar se os itens são iguas
        Client c1 = new Client("Maria","Maria@gmail.com");
        Client c2 = new Client("Alex","Alex@gmail.com");

        System.out.println(c1.equals(c2));





    }
}
