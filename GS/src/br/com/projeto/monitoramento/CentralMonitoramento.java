package br.com.projeto.monitoramento;

import br.com.projeto.robo.RoboLimpeza;

public class CentralMonitoramento {

    /**
     * Método para verificar o status do compartimento de resíduos do robô.
     * Caso o compartimento esteja cheio, envia uma notificação e esvazia o compartimento.
     *
     * @param robo O objeto da classe RoboLimpeza cujo status será verificado.
     */
    public void verificarStatusRobo(RoboLimpeza robo) {
        if (robo.isCompartimentoCheio()) {
            System.out.println("O compartimento do " + robo.getNome() + " está cheio. Enviando equipe para esvaziar...");
            robo.esvaziarCompartimento(); // Esvazia o compartimento
            notificar("O compartimento do " + robo.getNome() + " estava cheio e foi esvaziado.");
        } else {
            System.out.println("O compartimento do " + robo.getNome() + " ainda tem espaço.");
        }
    }

    /**
     * Método para enviar notificações.
     *
     * @param mensagem A mensagem de notificação que será enviada.
     */
    public void notificar(String mensagem) {
        System.out.println("Notificação: " + mensagem);
    }
}
