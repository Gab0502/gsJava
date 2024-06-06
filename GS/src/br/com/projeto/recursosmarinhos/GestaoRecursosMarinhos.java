package br.com.projeto.recursosmarinhos;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;



public class GestaoRecursosMarinhos {

    // Dados de exemplo
    private static Map<String, Integer> dadosPesca = new HashMap<>();
    private static Map<String, String> biodiversidadeMarinha = new HashMap<>();

    static {
        // Inicializar dados de exemplo para pesca
        dadosPesca.put("Atum", 500);
        dadosPesca.put("Sardinha", 300);
        dadosPesca.put("Bacalhau", 200);

        // Inicializar dados de exemplo para biodiversidade marinha
        biodiversidadeMarinha.put("Recife de Coral", "Coral, Peixes, Moluscos");
        biodiversidadeMarinha.put("Manguezal", "Caranguejos, Peixes, Aves");
        biodiversidadeMarinha.put("Mar Profundo", "Tubarões, Peixes de Profundidade, Cefalópodes");
    }

    public static void main(String[] args) {
        // Exibir menu de opções para interação do usuário
        exibirMenu();
    }

    public static void exibirMenu() {
        Scanner scanner = new Scanner(System.in); // Crie um objeto Scanner para leitura de entrada do usuário

        System.out.println("Escolha uma opção:");
        System.out.println("1. Análise de Dados de Pesca");
        System.out.println("2. Biodiversidade Marinha");
        System.out.println("0. Sair");

        // Ler entrada do usuário
        int opcao = scanner.nextInt();

        // Executar a opção escolhida
        switch (opcao) {
            case 1:
                analisarDadosPesca();
                break;
            case 2:
                analisarBiodiversidadeMarinha();
                break;
            case 0:
                System.out.println("Saindo...");
                return;
            default:
                System.out.println("Opção inválida. Tente novamente.");
                exibirMenu();
        }
    }

    public static void analisarDadosPesca() {
        System.out.println("Análise de Dados de Pesca:");

        // Exibir estatísticas de pesca
        System.out.println("Espécie | Capturas");
        for (Map.Entry<String, Integer> entry : dadosPesca.entrySet()) {
            System.out.println(entry.getKey() + " | " + entry.getValue());
        }

        // Retornar ao menu principal
        exibirMenu();
    }

    public static void analisarBiodiversidadeMarinha() {
        System.out.println("Análise de Biodiversidade Marinha:");

        // Exibir biodiversidade marinha
        System.out.println("Local | Espécies");
        for (Map.Entry<String, String> entry : biodiversidadeMarinha.entrySet()) {
            System.out.println(entry.getKey() + " | " + entry.getValue());
        }

        // Retornar ao menu principal
        exibirMenu();
    }
}
