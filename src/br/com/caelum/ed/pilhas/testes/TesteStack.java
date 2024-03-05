package br.com.caelum.ed.pilhas.testes;

import br.com.caelum.ed.Peca;

import java.util.Stack;

public class TesteStack {
    public static void main(String[] args) {
        Stack<String> pilha = new Stack<String>();

        String p1 = "Bloco";

        pilha.push(p1);

        System.out.println(pilha.pop());
    }
}
