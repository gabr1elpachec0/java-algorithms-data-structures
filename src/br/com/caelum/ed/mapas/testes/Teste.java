package br.com.caelum.ed.mapas.testes;

import br.com.caelum.ed.Carro;
import br.com.caelum.ed.mapas.MapaEspalhamento;

public class Teste {
    public static void main(String[] args) {
        MapaEspalhamento<String, Carro> mapa = new MapaEspalhamento<String, Carro>();

        mapa.adiciona("abc1234", new Carro("a"));
        mapa.adiciona("def1234", new Carro("b"));
        mapa.adiciona("ghi1234", new Carro("c"));

        System.out.println(mapa.toString());
    }
}
