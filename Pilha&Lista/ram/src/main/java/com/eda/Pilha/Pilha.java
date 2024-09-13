/**
 * @author Ramadan ismaeL
 */

package com.eda.Pilha;

import com.eda.base.EstruturaEstatica;

public class Pilha<T> extends EstruturaEstatica<T> {
    // Stack<String> pilha = new Stack<>();
    public Pilha(int capacidade) {
        super(capacidade);
    }

    public Pilha() {
        super();
    }

    // EMPILHAR ELEMENTO NA PILHA
    public void empilha(T elemento) {
        super.adiciona(elemento);
        //pilha.push("Elemento");
    }

    // ESPIAR/VERIFICAR ELEMENTO DO TOPO
    public T topo() {
        if(this.estaVazia()) {
            return null;
        }
        return this.elementos[tamanho-1];
    }

    // DESEMPILHAR ELEMENTO NA PILHA
    public T desempilha() {
        //pilha.pop();
        if(this.estaVazia()) {
            return null;
        };

        /*T elemento = this.elementos[tamanho-1];
        tamanho--;

        return elemento;*/

        return this.elementos[this.tamanho--];
    }
}
