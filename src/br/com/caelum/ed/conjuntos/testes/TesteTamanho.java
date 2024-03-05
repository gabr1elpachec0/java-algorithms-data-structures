package br.com.caelum.ed.conjuntos.testes;

import br.com.caelum.ed.conjuntos.ConjuntoEspalhamento;

import java.util.List;

public class TesteTamanho {
    public static void main(String[] args) {
        ConjuntoEspalhamento conjunto = new ConjuntoEspalhamento();
        conjunto.adiciona("Rafael");
        conjunto.adiciona("Ana");
        conjunto.adiciona("Paulo");

        List<String> palavras = conjunto.pegaTodas();

        System.out.println("Antes de remover");
        System.out.println(conjunto.tamanho());

        conjunto.remove("Rafael");

        System.out.println("Depois de remover");
        System.out.println(conjunto.tamanho());
    }
}
