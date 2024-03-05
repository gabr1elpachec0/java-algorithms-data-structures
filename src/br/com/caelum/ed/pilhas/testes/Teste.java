package br.com.caelum.ed.pilhas.testes;

import br.com.caelum.ed.Peca;
import br.com.caelum.ed.pilhas.Pilha;

public class Teste {
    public static void main(String[] args) {
        Pilha pilha = new Pilha();

        Peca peca = new Peca();
        pilha.insere(peca);

        Peca pecaRemovida = pilha.remove();

        if (peca != pecaRemovida) {
            System.out.println("Erro: a peça que foi removida não é igual " + " a que foi inserida");
        }

        if (!pilha.vazia()) {
            System.out.println("Erro: a pilha não está vazia");
        }
    }
}
