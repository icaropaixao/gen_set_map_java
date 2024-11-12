package set_map_generics.set.exercicio.application;


 // Exercicio sobre SET
/*
Problema exemplo
 Um site de internet registra um log de acessos dos usuários. Um
 registro de log consiste no nome de usuário (apenas uma palavra) e o
 instante em que o usuário acessou o site no padrão ISO 8601,
 separados por espaço, conforme exemplo. Fazer um programa que leia
 o log de acessos a partir de um arquivo, e daí informe quantos usuários
 distintos acessaram o site.

 */

import set_map_generics.set.exercicio.entities.LogEntry;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o caminho do arquivo: ");
        String path = scan.nextLine();

        // Usa um bloco try-with-resources para garantir que o BufferedReader seja fechado automaticamente após o uso.
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            // Cria um conjunto (Set) de LogEntry para armazenar registros únicos.
            Set<LogEntry> set = new HashSet<>();

            // Lê a primeira linha do arquivo.
            String line = br.readLine();

            // Continua lendo o arquivo enquanto houver linhas (ou seja, enquanto line != null).
            while (line != null) {

                // Divide a linha em partes usando um espaço como delimitador.
                // A primeira parte é o nome de usuário e a segunda parte é o timestamp (data/hora).
                String[] fields = line.split(" ");
                String username = fields[0]; // Extrai o nome de usuário.
                Date moment = Date.from(Instant.parse(fields[1])); // Converte a string de data/hora para o tipo Date.

                // Adiciona um novo registro de log no conjunto (Set).
                // Como é um Set, registros duplicados serão automaticamente ignorados.
                set.add(new LogEntry(username, moment));

                // Lê a próxima linha do arquivo.
                line = br.readLine();
            }

            // Exibe o número total de usuários únicos que foram registrados no conjunto.
            System.out.println("Total users: " + set.size());

        } catch (IOException e) {
            // Caso ocorra um erro de entrada/saída (como arquivo não encontrado),
            // exibe a mensagem de erro correspondente.
            System.out.println("Error: " + e.getMessage());
        }
        scan.close();

    }
}
