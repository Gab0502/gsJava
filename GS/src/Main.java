import br.com.projeto.robo.RoboLimpeza;
import br.com.projeto.monitoramento.CentralMonitoramento;
import br.com.projeto.reciclagem.Reciclagem;
import br.com.projeto.recursosmarinhos.GestaoRecursosMarinhos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do robô: ");
        String nomeRobo = scanner.nextLine();
        RoboLimpeza robo = new RoboLimpeza(nomeRobo);
        CentralMonitoramento central = new CentralMonitoramento();
        GestaoRecursosMarinhos gestaoRecursos = new GestaoRecursosMarinhos(); // Instanciando a classe de gestão de recursos marinhos

        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Coletar resíduos");
            System.out.println("2. Verificar status do robô");
            System.out.println("3. Esvaziar compartimento");
            System.out.println("4. Adicionar resíduo");
            System.out.println("5. Adicionar múltiplos resíduos");
            System.out.println("6. Reciclar resíduos");
            System.out.println("7. Análise Marinha");
            System.out.println("0. Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            switch (opcao) {
                case 1:
                    System.out.println("Coletando resíduos...");
                    robo.coletarResiduos();
                    System.out.println("Resíduos coletados com sucesso.");
                    break;
                case 2:
                    System.out.println("Verificando status do robô...");
                    central.verificarStatusRobo(robo);
                    break;
                case 3:
                    System.out.println("Esvaziando compartimento do robô...");
                    robo.esvaziarCompartimento();
                    System.out.println("Compartimento esvaziado com sucesso.");
                    break;
                case 4:
                    System.out.print("Digite o nome do resíduo: ");
                    String residuo = scanner.nextLine();
                    System.out.println("Adicionando resíduo...");
                    robo.adicionarResiduo(residuo);
                    System.out.println("Resíduo adicionado com sucesso.");
                    break;
                case 5:
                    System.out.print("Digite o nome do resíduo: ");
                    String residuoMult = scanner.nextLine();
                    System.out.print("Digite a quantidade: ");
                    int quantidade = scanner.nextInt();
                    scanner.nextLine(); // Consumir a nova linha
                    System.out.println("Adicionando múltiplos resíduos...");
                    robo.adicionarResiduo(residuoMult, quantidade);
                    System.out.println("Múltiplos resíduos adicionados com sucesso.");
                    break;
                case 6:
                    System.out.println("Reciclando resíduos...");
                    Reciclagem.reciclarResiduos(robo.getResiduosColetados());
                    System.out.println("Resíduos reciclados com sucesso.");
                    break;
                case 7:
                    exibirMenuGestaoMarinha(gestaoRecursos);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }

    public static void exibirMenuGestaoMarinha(GestaoRecursosMarinhos gestaoRecursos) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nAnálise Marinha:");
            System.out.println("Escolha uma opção:");
            System.out.println("1. Análise de Dados de Pesca");
            System.out.println("2. Biodiversidade Marinha");
            System.out.println("0. Voltar");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            switch (opcao) {
                case 1:
                    gestaoRecursos.analisarDadosPesca();
                    break;
                case 2:
                    gestaoRecursos.analisarBiodiversidadeMarinha();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
}
