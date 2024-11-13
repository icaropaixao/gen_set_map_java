package set_map_generics.set.exercicio2;

// EXERCICIO 2
/*
Em um portal de cursos online, cada usuário possui um código único, representado por
 umnúmerointeiro.
 Cada instrutor do portal pode ter vários cursos, sendo que um mesmo aluno pode se
 matricular em quantos cursos quiser. Assim, o número total de alunos de um instrutor não
 é simplesmente a soma dos alunos de todos os cursos que ele possui, pois pode haver
 alunos repetidos em mais de um curso.
 Oinstrutor Alex possui três cursos A, B e C, e deseja saber seu número total de alunos.
 */


import java.text.ParseException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

    public static void main(String[] args) throws ParseException {


        Scanner sc = new Scanner(System.in);

        // Criação de três conjuntos (sets) para armazenar os números dos estudantes de cada sala
        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        Set<Integer> c = new HashSet<>();


        System.out.print("Quantos estudantes para a sala A? ");
        int n = sc.nextInt(); // Lê o número de estudantes
        for (int i = 0; i < n; i++) {
            int number = sc.nextInt(); // Lê o número do estudante
            a.add(number); // Adiciona o número do estudante ao conjunto da sala A
        }

        System.out.print("Quantos estudantes para a sala B? ");
        n = sc.nextInt(); // Lê o número de estudantes
        for (int i = 0; i < n; i++) {
            int number = sc.nextInt(); // Lê o número do estudante
            b.add(number); // Adiciona o número do estudante ao conjunto da sala B
        }

        System.out.print("Quantos estudantes para a sala C? ");
        n = sc.nextInt(); // Lê o número de estudantes
        for (int i = 0; i < n; i++) {
            int number = sc.nextInt(); // Lê o número do estudante
            c.add(number); // Adiciona o número do estudante ao conjunto da sala C
        }

        // Criação de um nov3o conjunto para armazenar todos os estudantes das três salas
        Set<Integer> total = new HashSet<>(a); // Inicia o conjunto total com os estudantes da sala A
        total.addAll(b); // Adiciona todos os estudantes da sala B ao conjunto total
        total.addAll(c); // Adiciona todos os estudantes da sala C ao conjunto total

        // Exibe o total de estudantes, que é o tamanho do conjunto "total" (sem repetições)
        System.out.println("Total students: " + total.size());

        // Fecha o scanner após o uso
        sc.close();
    }
}