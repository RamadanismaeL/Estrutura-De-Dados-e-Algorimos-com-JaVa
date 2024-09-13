/**
 * @author Ramadan ismaeL
 */

package com.filasestaticas.eda.Filas;

import com.filasestaticas.eda.base.EstrutaEstatica;

public class Fila<T> extends EstrutaEstatica<T> {

    public Fila(int capacidade) {
        super(capacidade);
    }

    public Fila() {
        super();
    }

    public void enfileira(T elemento) {        
        this.adiciona(elemento);
    }

    public T verificar() {
        return this.elementos[0];
    }

    public T verificar(int posicao) {
        if(posicao >= 0 && posicao < this.elementos.length) {
            return this.elementos[posicao];
        }
        return null;
    }

    public T desenfileira() {
        if(this.estaVazia()) {
            return null;
        }

        T elementoASerRemovido = this.elementos[0];

        this.remove(0);

        return elementoASerRemovido;
    }
}
