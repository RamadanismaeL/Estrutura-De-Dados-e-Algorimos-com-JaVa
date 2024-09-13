/**
 * @author Ramadan ismaeL
 */

package com.eda;

public class Contato {
    private String nome, telefone, email;
    
    public Contato(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public Contato() {}

    public String getNome() {
        return this.nome;
    }
        public String getTelefone() {
            return this.telefone;
        }
            public String getEmail() {
                return this.email;
            }
            public void setEmail(String email) {
                this.email = email;
            }
        public void setTelefone(String telefone) {
            this.telefone = telefone;
        }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String toString() {
        return  "\n"+
                "Nome       = "+this.nome+"\n"+
                "Telefone   = "+ this.telefone+"\n"+
                "Email      = "+this.email+"\n";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((telefone == null) ? 0 : telefone.hashCode());
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Contato other = (Contato) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (telefone == null) {
            if (other.telefone != null)
                return false;
        } else if (!telefone.equals(other.telefone))
            return false;
        if (email == null) {
            if (other.email != null)
                return false;
        } else if (!email.equals(other.email))
            return false;
        return true;
    }
}
