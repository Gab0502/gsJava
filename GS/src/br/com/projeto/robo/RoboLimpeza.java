package br.com.projeto.robo;

import java.util.ArrayList;
import java.util.List;

public class RoboLimpeza {
    private String nome;
    private List<String> residuosColetados;
    private double nivelPoluicaoAmbiente;
    private String condicoesAmbientais;
    private static final int CAPACIDADE_MAXIMA = 10;

    public RoboLimpeza(String nome) {
        this.nome = nome;
        this.residuosColetados = new ArrayList<>();
        this.nivelPoluicaoAmbiente = 0.0; // Nível de poluição inicial
        this.condicoesAmbientais = "Boas"; // Condições ambientais iniciais
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<String> getResiduosColetados() {
        return residuosColetados;
    }

    public void setResiduosColetados(List<String> residuosColetados) {
        this.residuosColetados = residuosColetados;
    }

    public double getNivelPoluicaoAmbiente() {
        return nivelPoluicaoAmbiente;
    }

    public void setNivelPoluicaoAmbiente(double nivelPoluicaoAmbiente) {
        this.nivelPoluicaoAmbiente = nivelPoluicaoAmbiente;
    }

    public String getCondicoesAmbientais() {
        return condicoesAmbientais;
    }

    public void setCondicoesAmbientais(String condicoesAmbientais) {
        this.condicoesAmbientais = condicoesAmbientais;
    }

    public void coletarResiduos() {
        for (int i = 0; i < CAPACIDADE_MAXIMA; i++) {
            residuosColetados.add("Resíduo " + (i + 1));
        }
        System.out.println(nome + " coletou resíduos.");
    }

    public void verificarStatus() {
        System.out.println("O compartimento do " + nome + " está " + (isCompartimentoCheio() ? "cheio" : "não está cheio"));
    }

    public void esvaziarCompartimento() {
        residuosColetados.clear();
        System.out.println(nome + " esvaziou o compartimento.");
    }

    public void adicionarResiduo(String residuo) {
        if (!isCompartimentoCheio()) {
            residuosColetados.add(residuo);
            System.out.println("Adicionado: " + residuo);
        } else {
            System.out.println("Compartimento cheio! Não é possível adicionar mais resíduos.");
        }
    }

    public void adicionarResiduo(String residuo, int quantidade) {
        if (residuosColetados.size() + quantidade <= CAPACIDADE_MAXIMA) {
            for (int i = 0; i < quantidade; i++) {
                residuosColetados.add(residuo + " " + (i + 1));
            }
            System.out.println("Adicionados " + quantidade + " de " + residuo);
        } else {
            System.out.println("Não há espaço suficiente no compartimento para adicionar " + quantidade + " resíduos.");
        }
    }

    public void reciclarResiduos() {
        for (String residuo : residuosColetados) {
            System.out.println("Reciclando " + residuo);
        }
        residuosColetados.clear();
        System.out.println("Todos os resíduos foram reciclados.");
    }

    public void verificarNiveisPoluicao() {
        System.out.println("Nível de poluição do ambiente: " + nivelPoluicaoAmbiente);
    }

    public void analisarCondicoesAmbientais() {
        System.out.println("Condições ambientais do local: " + condicoesAmbientais);
    }

    public boolean isCompartimentoCheio() {
        return residuosColetados.size() >= CAPACIDADE_MAXIMA;
    }

    public void atualizarNivelPoluicao(double aumentoPoluicao) {
        nivelPoluicaoAmbiente += aumentoPoluicao;
        System.out.println("Nível de poluição atualizado para: " + nivelPoluicaoAmbiente);
        verificarCondicoesAmbientais();
    }

    public void verificarCondicoesAmbientais() {
        if (nivelPoluicaoAmbiente <= 50) {
            condicoesAmbientais = "Boas";
        } else if (nivelPoluicaoAmbiente <= 100) {
            condicoesAmbientais = "Aceitáveis";
        } else if (nivelPoluicaoAmbiente <= 150) {
            condicoesAmbientais = "Ruins";
        } else {
            condicoesAmbientais = "Críticas";
        }
        System.out.println("Condições ambientais atualizadas para: " + condicoesAmbientais);
    }
}
