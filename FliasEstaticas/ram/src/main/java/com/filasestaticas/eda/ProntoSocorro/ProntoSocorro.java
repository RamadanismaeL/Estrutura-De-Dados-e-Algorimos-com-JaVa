/**
 * @author Ramadan ismaeL
 */

package com.filasestaticas.eda.ProntoSocorro;

import java.util.*;

public class ProntoSocorro {
    private final int VERDE = 2;
    private final int AMARELO = 1;
    private final int VERMELHO = 0;

    public ProntoSocorro() {
        PriorityQueue<Pessoa> queueP = new PriorityQueue<>();

        queueP.add(new Pessoa("Pessoa 1", VERDE));
        queueP.add(new Pessoa("Pessoa 2", AMARELO));
        queueP.add(new Pessoa("Pessoa 3", VERMELHO));
        queueP.add(new Pessoa("Pessoa 4", VERDE));
        queueP.add(new Pessoa("Pessoa 5", VERDE));
        queueP.add(new Pessoa("Pessoa 6", VERMELHO));

        PSAtendimento atendimento = new PSAtendimento(queueP);
        PSNovosPacientes pacientes = new PSNovosPacientes(queueP);

        Thread t1 = new Thread(atendimento);
        Thread t2 = new Thread(pacientes);

        t1.start();
        t2.start();
    }
}
