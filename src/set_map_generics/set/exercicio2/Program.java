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

        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        Set<Integer> c = new HashSet<>();

        System.out.print("Quantos estudantes para a sala A? ");
        int n = sc.nextInt();
        for (int i=0; i<n; i++) {
            int number = sc.nextInt();
            a.add(number);
        }

        System.out.print("Quantos estudantes para a sala B? ");
        n = sc.nextInt();
        for (int i=0; i<n; i++) {
            int number = sc.nextInt();
            b.add(number);
        }

        System.out.print("Quantos estudantes para a sala C? ");
        n = sc.nextInt();
        for (int i=0; i<n; i++) {
            int number = sc.nextInt();
            c.add(number);
        }

        Set<Integer> total = new HashSet<>(a);
        total.addAll(b);
        total.addAll(c);

        System.out.println("Total students: " + total.size());

        sc.close();
    }

}

