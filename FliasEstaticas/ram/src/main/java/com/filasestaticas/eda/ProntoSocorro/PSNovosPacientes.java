/**
 * @author Ramadan ismaeL
 */

package com.filasestaticas.eda.ProntoSocorro;

import java.util.*;

public class PSNovosPacientes implements Runnable {

    private PriorityQueue<Pessoa> queueP;
    private int cont = 7;
    private Random prioridade = new Random();

    public PSNovosPacientes(PriorityQueue<Pessoa> queueP) {
        super();
        this.queueP = queueP;
    }

    @Override
    public void run() {
        for(int i = 0; i < 8; i++) {
            try {
                Thread.sleep(8000);
                Pessoa p = new Pessoa("Pessoa"+cont, prioridade.nextInt(3));
                queueP.add(p);
                cont++;
                System.out.println(p+" enfileirada");
            } catch (InterruptedException err) {
                err.printStackTrace();
            }
        }
    }
    
}
