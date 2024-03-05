package br.com.caelum.ed.vetores.testes;

import br.com.caelum.ed.Aluno;
import br.com.caelum.ed.vetores.Vetor;

public class TesteEstoura {
    public static void main(String[] args) {
        Vetor vetor = new Vetor();
        int tamanhoInicial = vetor.tamanho();

        for (int i = 0; i < 100001; i++) {
            // vetor.garantaEspaco();
            Aluno aluno = new Aluno();
            vetor.adiciona(aluno);
        }

        int tamanhoFinal = vetor.tamanho();

        System.out.println("Tamanho inicial do vetor: " + tamanhoInicial);
        System.out.println("Tamanho final do vetor: " + tamanhoFinal);
    }
}
