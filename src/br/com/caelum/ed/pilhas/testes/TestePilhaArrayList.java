package br.com.caelum.ed.pilhas.testes;

import br.com.caelum.ed.Peca;
import br.com.caelum.ed.pilhas.Pilha;
import br.com.caelum.ed.pilhas.PilhaArrayList;

import java.util.ArrayList;

public class TestePilhaArrayList {
    public static void main(String[] args) {
        PilhaArrayList pilhaDePecas = new PilhaArrayList();

        Peca p1 = new Peca();

        pilhaDePecas.insere(p1);

        Peca pecaRemovida = pilhaDePecas.remove();

        if (p1 != pecaRemovida) {
            System.out.println("Erro: a peça que foi removida não é igual " + " a que foi inserida");
        }

        if (!pilhaDePecas.vazia()) {
            System.out.println("Erro: a pilha não está vazia");
        }

        Peca p2 = new Peca();

        pilhaDePecas.insere(p2);

        p2.setNome("Gabriel");

        System.out.println(pilhaDePecas.remove());
    }
}
