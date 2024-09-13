/**
 * @author Ramadan ismaeL
 */

package com.eda.Lista;

import com.eda.base.EstruturaEstatica;

public class Lista<T> extends EstruturaEstatica<T> {

    public Lista(int capacidade) {
        super(capacidade);
    }

    public Lista() {
        super();
    }    

    public boolean adicionaL(T elemento) {
        return super.adiciona(elemento);
    }

    public boolean adiciona_QPL(int posicao, T elemento) {
        return super.adiciona_QP(posicao, elemento);
    }
}
