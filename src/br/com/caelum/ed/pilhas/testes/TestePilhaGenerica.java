package br.com.caelum.ed.pilhas.testes;

import br.com.caelum.ed.Peca;
import br.com.caelum.ed.pilhas.PilhaGenerica;

public class TestePilhaGenerica {
    public static void main(String[] args) {
        PilhaGenerica pilhaDePecas = new PilhaGenerica();

        Peca peca = new Peca();
        pilhaDePecas.insere(peca);

        Object pecaRemovida = pilhaDePecas.remove();

        if (peca != pecaRemovida) {
            System.out.println("Erro: a peça que foi removida não é igual " + " a que foi inserida");
        }

        if (!pilhaDePecas.vazia()) {
            System.out.println("Erro: a pilha não está vazia");
        }
    }
}
