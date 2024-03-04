package br.com.caelum.ed.vetores;

import br.com.caelum.ed.Aluno;

public class Vetor {
    private Aluno[] alunos = new Aluno[100000];

    private int totalDeAlunos = 0;

    private boolean posicaoValida(int posicao) {
        return posicao >= 0 && posicao <= this.totalDeAlunos;
    }

    private boolean posicaoOcupada(int posicao) {
        return posicao >= 0 && posicao < this.totalDeAlunos;
    }

    public void adiciona(Aluno aluno) {
        this.alunos[this.totalDeAlunos] = aluno;
        this.totalDeAlunos++;
    }

    public void adicionaLento(Aluno aluno) {
        for (int i = 0; i < this.alunos.length; i++) {
            if (this.alunos[i] == null) {
                this.alunos[i] = aluno;
                break;
            }
        }
    }

    public void adiciona(int posicao, Aluno aluno) {
        if(!this.posicaoValida(posicao)) {
            throw new IllegalArgumentException("Posição inválida");
        }

        for(int i = this.totalDeAlunos - 1; i >= posicao; i-=1) {
            this.alunos[i + 1] = this.alunos[i];
        }

        this.alunos[posicao] = aluno;
        this.totalDeAlunos++;
    }

    public Aluno pega(int posicao) {
        if (!this.posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        return this.alunos[posicao];
    }

    public void remove(int posicao) {
        if (!this.posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        for (int i = posicao; i < this.totalDeAlunos - 1; i++) {
            this.alunos[i] = this.alunos[i + 1];
        }
        this.totalDeAlunos--;
    }

    public boolean contem(Aluno aluno) {
        for (int i = 0; i < this.totalDeAlunos; i++) {
            if (aluno == this.alunos[i]) {
                return true;
            }
        }
        return false;
    }

    public int tamanho() {
        return this.totalDeAlunos;
    }

    public void garantaEspaco() {
        if (this.totalDeAlunos == this.alunos.length) {
            System.out.println("Atingiu a capacidade máxima. Aumentando o tamanho do vetor...");
            Aluno[] novaArray = new Aluno[this.alunos.length * 2];
            for (int i = 0; i < this.alunos.length; i++) {
                novaArray[i] = this.alunos[i];
            }
            System.out.println("Tamanho atual do vetor: " + this.alunos.length);
            System.out.println("Novo tamanho do vetor: " + novaArray.length);
            this.alunos = novaArray;
            System.out.println("Vetor aumentado com sucesso.");
        }
    }


    public String toString() {
        if (this.totalDeAlunos == 0) {
            return "[]";
        }

        StringBuilder builder = new StringBuilder();
        builder.append("[");

        for (int i = 0; i < this.totalDeAlunos; i++) {
            builder.append(this.alunos[i]);
            if (i < this.totalDeAlunos - 1) {
                builder.append(", ");
            }
        }

        builder.append("]");

        return builder.toString();
    }
}
