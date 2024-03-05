package br.com.caelum.ed.filas.testes;

import br.com.caelum.ed.Aluno;

import java.util.LinkedList;
import java.util.Queue;

public class TesteQueue {
    public static void main(String[] args) {
        Queue<Aluno> fila = new LinkedList<Aluno>();

        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        fila.offer(a1);
        fila.offer(a2);

        Aluno alunoRemovido = fila.poll();

        if (fila.isEmpty()) {
            System.out.println("A fila está vazia");
        } else {
            System.out.println("A fila possui elementos");
        }
    }
}
