/*
package br.com.caelum.ed.mapas;

import br.com.caelum.ed.Carro;

import java.util.ArrayList;
import java.util.List;

public class MapaLista {
    private List<Associacao<C, V>> associacoes = new ArrayList<Associacao<C, V>>();

    public void adiciona(String placa, Carro carro) {
        if (!this.contemChave(placa)) {
            Associacao<C, V> associacao = new Associacao<C, V>(placa, carro);
            this.associacoes.add(associacao);
        }
    }

    public Carro pega(String placa) {
        for (Associacao<C, V> associacao : this.associacoes) {
            if (placa.equals(associacao.getPlaca())) {
                return associacao.getCarro();
            }
        }
        throw new IllegalArgumentException("chave não existe");
    }

    public void remove(String placa) {
        if (this.contemChave(placa)) {
            for (int i = 0; i < this.associacoes.size(); i++) {
                Associacao<C, V> associacao = this.associacoes.get(i);

                if (placa.equals(associacao.getPlaca())) {
                    this.associacoes.remove(i);
                    break;
                }
            }
        } else {
            throw new IllegalArgumentException("chave não existe");
        }
    }

    public boolean contemChave(String placa) {
        for (Associacao<C, V> associacao : this.associacoes) {
            if (placa.equals(associacao.getPlaca())) {
                return true;
            }
        }
        return false;
    }
}
*/