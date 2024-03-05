package br.com.caelum.ed.filas;

import br.com.caelum.ed.Aluno;

import java.util.LinkedList;
import java.util.List;

public class Fila {
    private List<Aluno> alunos = new LinkedList<Aluno>();

    public void insere(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public Aluno remove() {
        return this.alunos.remove(0);
    }

    public boolean vazia() {
        return this.alunos.size() == 0;
    }
}
