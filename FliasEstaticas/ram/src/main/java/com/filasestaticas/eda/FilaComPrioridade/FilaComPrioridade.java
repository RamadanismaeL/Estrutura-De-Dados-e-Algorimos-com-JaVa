/**
 * @author Ramadan ismaeL
 */

package com.filasestaticas.eda.FilaComPrioridade;

import com.filasestaticas.eda.Filas.Fila;

public class FilaComPrioridade<T> extends Fila<T> {
    public FilaComPrioridade(int capacidade) {
        super(capacidade);
    }

    public FilaComPrioridade() {
        super();
    }

    @SuppressWarnings("unchecked")
    public void enfileira(T elemento) {
        Comparable<T> chave = (Comparable<T>) elemento;
        int i;
        for(i = 0; i < this.tamanho; i++) {
            if(chave.compareTo(this.elementos[i]) < 0) {
                break;
            }
        }
        this.adiciona_QP(i, elemento);
    }    
}
