package br.com.caelum.ed.conjuntos.testes;

import br.com.caelum.ed.conjuntos.ConjuntoEspalhamento;

import java.util.List;

public class TesteContem {
    public static void main(String[] args) {
        ConjuntoEspalhamento conjunto = new ConjuntoEspalhamento();
        conjunto.adiciona("Rafael");
        conjunto.adiciona("Ana");
        conjunto.adiciona("Paulo");

        List<String> palavras = conjunto.pegaTodas();

        conjunto.remove("Rafael");

        System.out.println(conjunto.contem("Paulo"));
        System.out.println(conjunto.contem("Rafael"));
    }
}
