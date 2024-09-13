/**
 * @author Ramadan ismaeL
 */

package com.eda.Vetores;

//import java.util.Arrays;

public class Vetor {
    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    // ADICIONAR ELEMENTOS
    /*
     * public void adiciona(String elemento) {
     * for(int i = 0; i < this.elementos.length; i++) {
     * if(elementos[i] == null) {
     * this.elementos[i] = elemento;
     * break;
     * }
     * }
     * }
     * 
     * 
     * public void adiciona(String elemento) throws Exception {
     * if(this.tamanho < this.elementos.length) {
     * this.elementos[this.tamanho] = elemento;
     * this.tamanho++;
     * } else {
     * throw new
     * Exception("Vetor já está cheio, não é possível adicionar mais elementos!");
     * }
     * }
     */

    public boolean adiciona(String elemento) {
        this.aumentaCapacidade();
        if (this.tamanho < this.elementos.length) {
            elementos[tamanho] = elemento;
            tamanho++;
            return true;
        }
        return false;
    }

    // VERIFICAR TAMANHO
    public int getTamanho() {
        return this.tamanho;
    }

    // IMPRIMIR OS ELEMENTOS
    @Override
    public String toString() {
        // return "Elementos do Vetor = "+Arrays.toString(elementos); //Retorna com
        // valores null

        StringBuilder s = new StringBuilder();
        s.append("[");

        for (int i = 0; i < this.tamanho - 1; i++) {
            s.append(this.elementos[i]);
            s.append(", ");
        }

        if (this.tamanho > 0) {
            s.append(this.elementos[this.tamanho - 1]);
        }

        s.append("]");

        return s.toString();
    }

    // OBTER ELEMENTO DE UMA POSIÇÃO
    public String busca(int posicao) {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida!");
        }
        return this.elementos[posicao];
    }

    // VERIFICAR SE ELEMENTO EXISTE
    /*
     * public boolean busca(String elemento) {
     * for(int i = 0; i < this.tamanho; i++) {
     * if(this.elementos[i].equalsIgnoreCase(elemento)) {
     * return true;
     * }
     * }
     * return false;
     * }
     */

    public int busca(String elemento) {
        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    // ADICIONAR ELEMENTO EM QUALQUER POSIÇÃO
    public boolean adiciona_QP(int posicao, String elemento) {
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

    // ADD CAPACIDADE AO VETOR
    private void aumentaCapacidade() {
        if (this.tamanho == this.elementos.length) {
            String[] elementosNovos = new String[this.elementos.length * 2];
            for (int i = 0; i < this.tamanho; i++) {
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }

    // REMOVER ELEMENTO DO VETOR
    /*
     * B D E F F -> posição a ser removida é 1 (G)
     * 0 1 2 3 4 -> tamanho é 5
     * vetor[1] = vetor[2]
     * vetor[2] = vetor[3]
     * vetor[3] = vetor[4]
     */
    public void remove(int posicao) {
        if (!(posicao >= 0 && posicao < this.tamanho)) {
            throw new IllegalArgumentException("Posíção inválida!");
        }
        for(int i=posicao; i<this.tamanho-1; i++) {
            this.elementos[i] = this.elementos[i+1];
        }
        this.tamanho--;
    }
}
