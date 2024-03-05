package br.com.caelum.ed.vetores.testes;

import br.com.caelum.ed.Aluno;
import br.com.caelum.ed.vetores.Vetor;

import java.util.ArrayList;

public class Teste {
    public static void main(String[] args) {
        Vetor vetor = new Vetor();
        ArrayList<Aluno> list = new ArrayList<Aluno>();

        for (int i = 0; i < 1001; i++) {
            Aluno aluno = new Aluno();
            vetor.adiciona(aluno);
        }

        System.out.println("Tamanho do vetor: " + vetor.tamanho());

        for (int i = 0; i < vetor.tamanho(); i++) {
            Aluno aluno = vetor.pega(i);
            list.add(aluno);
        }

        // Em ArrayLists não é necessário definir seu tamanho, pois sua capacidade é dinâmica, ou seja, aumenta automaticamente;
        System.out.println("Tamanho do ArrayList: " + list.size());
    }
}
