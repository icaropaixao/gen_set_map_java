package set_map_generics.maap.exercicio.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        // Criação de um objeto Scanner para leitura da entrada do usuário
        Scanner sc = new Scanner(System.in);

        // Criação de um mapa para armazenar os votos (nome do candidato e número de votos)
        Map<String, Integer> votes = new LinkedHashMap<>();

        // Solicita ao usuário o caminho do arquivo contendo os dados
        System.out.print("Entre com o caminho do arquivo: ");
        String path = sc.nextLine();

        // Tenta abrir e ler o arquivo especificado pelo usuário
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            // Lê a primeira linha do arquivo
            String line = br.readLine();
            while (line != null) { // Continua enquanto houver linhas para ler

                // Divide a linha em partes, separadas por vírgula
                String[] fields = line.split(",");
                String name = fields[0]; // Nome do candidato
                int count = Integer.parseInt(fields[1]); // Número de votos

                // Verifica se o nome do candidato já está no mapa
                if (votes.containsKey(name)) {
                    // Soma os votos atuais aos já registrados no mapa
                    int votesSoFar = votes.get(name);
                    votes.put(name, count + votesSoFar);
                } else {
                    // Adiciona um novo candidato ao mapa com o número de votos inicial
                    votes.put(name, count);
                }

                // Lê a próxima linha do arquivo
                line = br.readLine();
            }

            // Exibe os resultados armazenados no mapa
            for (String key : votes.keySet()) {
                System.out.println(key + ": " + votes.get(key));
            }

        } catch (IOException e) {
            // Tratamento de erros relacionados ao arquivo
            System.out.println("Error: " + e.getMessage());
        }

        // Fecha o Scanner para liberar recursos
        sc.close();
    }
}
