/**
 * @author Ramaadan ismaeL
 */

package com.filasestaticas.eda.base;

public class EstrutaEstatica<T> {
    protected T[] elementos;
    protected int tamanho;

    @SuppressWarnings("unchecked")
    public EstrutaEstatica(int capacidade) {
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }

    public EstrutaEstatica() {
        this(10);
    }

    public boolean estaVazia() {
        return this.tamanho == 0;
    }

    public int getTamanho() {
        return this.tamanho;
    }

    protected boolean adiciona(T elemento) {
        this.aumentaCapacidade();
        if(this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] =  elemento;
            this.tamanho++;
            //this.elementos[this.tamanho++] = elemento;
            
            return true;
        }
        return false;
    }

    public boolean adiciona_QP(int posicao, T elemento) {
        if (!(posicao >= 0 && posicao < this.tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }

        this.aumentaCapacidade();

        for (int i = this.tamanho; i >= posicao; i--) {
            this.elementos[i + 1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.tamanho++;

        return false;
    }

    @SuppressWarnings("unchecked")
    private void aumentaCapacidade() {
        if(this.tamanho == this.elementos.length) {
            T[] elementosNovos = (T[]) new Object[this.elementos.length*2];
            for(int i = 0; i < this.elementos.length; i++) {
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");

        for(int i = 0; i < this.tamanho - 1; i++) {
            s.append(this.elementos[i]);
            s.append(", ");
        }

        if(this.tamanho > 0) {
            s.append((this.elementos[this.tamanho-1]));
        }

        s.append("]");

        return s.toString();
    }

    protected void remove(int posicao) {
        if(!(posicao >= 0 && posicao < this.elementos.length)) {
            throw new IllegalArgumentException("Posição inválidade");
        }
        for(int i = posicao; i < this.tamanho-1; i++) {
            this.elementos[i] = this.elementos[i+1];
        }
        this.tamanho--;
    }
}