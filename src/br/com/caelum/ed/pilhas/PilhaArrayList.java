package br.com.caelum.ed.pilhas;

import br.com.caelum.ed.Peca;

import java.util.ArrayList;

public class PilhaArrayList {
    private ArrayList<Peca> pecas = new ArrayList<Peca>();

    public void insere(Peca peca) {
        this.pecas.add(peca);
    }

    public Peca remove() {
        return this.pecas.remove(this.pecas.size() - 1);
    }

    public boolean vazia() {
        return this.pecas.size() == 0;
    }
}
