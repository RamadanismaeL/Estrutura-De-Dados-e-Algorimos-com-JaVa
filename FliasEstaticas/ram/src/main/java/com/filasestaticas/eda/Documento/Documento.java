/**
 * @author Ramadan ismaeL
 */

package com.filasestaticas.eda.Documento;

public class Documento {
    private String nome;
    private int numFolhas;

    public Documento(String nome, int numFolhas) {
        super();
        this.nome = nome;
        this.numFolhas = numFolhas;
    }

    public String getNome() {
        return this.nome;
    }
        public int getNumFolhas() {
            return this.numFolhas;
        }
        public void setNumFolhas(int numFolhas) {
            this.numFolhas = numFolhas;
        }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
