/**
 * @author Ramadan ismaeL
 */

package listas.eda.TipoDinamico;

//import java.lang.reflect.Array;

public class Lista<T> {
    private T[] elementos;
    private int tamanho;

    // Primeira Forma de Declar o Construto do tipo Dinâmico
    @SuppressWarnings("unchecked")
    public Lista(int capacidade) {
        this.elementos =(T[]) new Object[capacidade];
        this.tamanho = 0;
    }

    // Segunda forma
    /*@SuppressWarnings("unchecked")
    public Lista(int capacidade, Class<T> tipoClasse) {
        this.elementos = (T[])Array.newInstance(tipoClasse, capacidade);
        this.tamanho = 0;
    }*/

    // ADICIONAR ELEMENTOS
    public boolean adiciona(T elemento) {
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
    public T busca(int posicao) {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida!");
        }
        return this.elementos[posicao];
    }

    public int busca(T elemento) {
        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    // ADICIONAR ELEMENTO EM QUALQUER POSIÇÃO
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

    // ADD CAPACIDADE AO VETOR
    private void aumentaCapacidade() {
        if (this.tamanho == this.elementos.length) {
            @SuppressWarnings("unchecked")
            T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
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

    // REMOVER TODOS OS ELEMENTOS
    public void limpar() {
        // opção 1
        //this.elementos = (T[]) new Object[this.elementos.length];

        // opção 2
        //this.tamanho = 0;

        // opção 3
        for(int i = 0; i < this.tamanho; i++) {
            this.elementos[i] = null;
        }
        this.tamanho = 0;
    }
}
