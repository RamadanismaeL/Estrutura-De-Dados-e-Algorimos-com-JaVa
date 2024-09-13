/**
 * @author Ramadan ismaeL
 */

package com.filasestaticas.eda.ProntoSocorro;

public class Pessoa implements Comparable<Pessoa> {
    private String nome;
    private int prioridade;

    public Pessoa(String nome, int prioridade) {
        super();
        this.nome = nome;
        this.prioridade = prioridade;
    }

    public String getNome() {
        return this.nome;
    }
        public int getPrioridade() {
            return this.prioridade;
        }
        public void setPrioridade(int prioridade) {
            this.prioridade = prioridade;
        }
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int compareTo(Pessoa o) {
        if(prioridade > o.prioridade) {
            return 1;
        } else if(prioridade < o.prioridade) {
            return -1;
        }

        return 0;
    }

    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", prioridade=" + prioridade + "]";
    }
    
}
