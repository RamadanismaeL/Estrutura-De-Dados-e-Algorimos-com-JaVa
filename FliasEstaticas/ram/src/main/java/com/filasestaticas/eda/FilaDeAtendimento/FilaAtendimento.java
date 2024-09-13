/**
 * @author Ramadan ismaeL
 */

package com.filasestaticas.eda.FilaDeAtendimento;

import java.util.*;

public class FilaAtendimento {
    private final int MAX_PRIORIDADE = 3;
    public FilaAtendimento() {
        Queue<String> regular = new LinkedList<>();
        Queue<String> prioridade = new PriorityQueue<>();

        regular.add("Pessoa 1");
        regular.add("Pessoa 2");
        regular.add("Pessoa 3");
        prioridade.add("Pessoa 1P");
        prioridade.add("Pessoa 2P");
        prioridade.add("Pessoa 3P");
        prioridade.add("Pessoa 4P");
        prioridade.add("Pessoa 5P");
        regular.add("Pessoa 4");
        regular.add("Pessoa 5");
        regular.add("Pessoa 6");
        regular.add("Pessoa 7");
        regular.add("Pessoa 8");

        while(!regular.isEmpty() || !prioridade.isEmpty()) {
            int cont = 0;
            while(!prioridade.isEmpty() && cont < MAX_PRIORIDADE) {
                //String pessoaAtendida = prioridade.remove();
                //System.out.println(pessoaAtendida+" foi atendida");
                atendePessoa(prioridade);
                cont++;
            }

            while(!regular.isEmpty()) {
                //String pessoaAtendida = regular.remove();
                //System.out.println(pessoaAtendida+" foi atendida");
                atendePessoa(regular);
                break;
            }

            if(prioridade.isEmpty()) {
                while(!regular.isEmpty()) {
                    atendePessoa(regular);
                }
            }
        }
    }

    public void atendePessoa(Queue<String> queue) {
        String pessoaAtendida = queue.remove();
        System.out.println(pessoaAtendida+" foi atendida");
    }
}
