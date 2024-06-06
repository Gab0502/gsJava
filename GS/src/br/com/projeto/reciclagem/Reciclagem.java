package br.com.projeto.reciclagem;

import java.util.List;

public class Reciclagem {

    /**
     * Método estático para reciclar uma lista de resíduos.
     *
     * @param residuos A lista de resíduos a serem reciclados.
     */
    public static void reciclarResiduos(List<String> residuos) {
        for (String residuo : residuos) {
            System.out.println("Reciclando " + residuo);
        }
        System.out.println("Todos os resíduos foram reciclados.");
    }

    /**
     * Sobrecarga do método reciclarResiduos para reciclar um único resíduo.
     *
     * @param residuo O resíduo a ser reciclado.
     */
    public static void reciclarResiduos(String residuo) {
        System.out.println("Reciclando " + residuo);
        System.out.println(residuo + " foi reciclado.");
    }
}
