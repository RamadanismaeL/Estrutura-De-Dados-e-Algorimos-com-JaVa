/**
 * @author Ramadan ismaeL
 */

package com.filasestaticas.eda.ProntoSocorro;

import java.util.*;

public class PSAtendimento implements Runnable {

    private PriorityQueue<Pessoa> queueP;

    public PSAtendimento(PriorityQueue<Pessoa> queueP) {
        super();
        this.queueP = queueP;
    }

    @Override
    public void run() {
        while(!queueP.isEmpty()) {
            try {
                System.out.println(queueP.poll()+" atendida");
                Thread.sleep(5000);
            } catch(InterruptedException err) {
                err.printStackTrace();
            }
        }

        System.out.println("Atendimento concluído!");
    }
    
}
