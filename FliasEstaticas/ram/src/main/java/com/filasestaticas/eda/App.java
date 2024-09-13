/**
 * @author Ramadan ismaeL
 */

package com.filasestaticas.eda;

import com.filasestaticas.eda.Documento.Documento;
import com.filasestaticas.eda.FilaDeAtendimento.FilaAtendimento;
//import com.filasestaticas.eda.FilaComPrioridade.FilaComPrioridade;
import com.filasestaticas.eda.Filas.Fila;
import com.filasestaticas.eda.ProntoSocorro.ProntoSocorro;

import java.util.*;

public class App {
    public static void main( String[] args ) {
       //System.out.println( "Hello Friend!" );
        //FIFO - First in, First out

        Fila<Integer> fila = new Fila<>();

        System.out.println("A fila está vazia? - "+fila.estaVazia());
        System.out.println("Tamanho: "+fila.getTamanho());

        fila.enfileira(1);
        fila.enfileira(2);
        fila.enfileira(3);
        fila.enfileira(4);

        System.out.println("A fila está vazia? - "+fila.estaVazia());
        System.out.println("Tamanho: "+fila.getTamanho());
        System.out.println("Verificar: "+fila.verificar());
        System.out.println(fila.toString());
        fila.desenfileira();
        System.out.println("Fila desinfeilerada - "+fila.toString());

        //API Fila
        System.out.println("\n\n");
        System.out.println("=======================");
        Queue<Integer> queue = new LinkedList<>();

        queue.add(1); // Método enfileirar
        // queue.offer(2); - boolean result = queue.offer(element);  // returns false if the queue is full
        //queue.offer(3);
        queue.add(2);
        queue.add(3);
        queue.add(4);

        System.out.println(queue);
        System.out.println(queue.peek()); // Imprimi o primeiro elemento da fila
        System.out.println(queue.remove()); // Método Desenfileirar
        System.out.println(queue);

        /*System.out.println("\n\n");
        System.out.println("==F I L A  C O M   P R I O R I D A D E==");
        FilaComPrioridade<Integer> filaPrioridade = new FilaComPrioridade<>();

        filaPrioridade.enfileira(1);
        filaPrioridade.enfileira(3);
        filaPrioridade.enfileira(2);

        System.out.println(filaPrioridade);*/


        System.out.println("\n\n");
        System.out.println("==P R I O R I T Y   Q U E U E==");
        Queue<Integer> priorityQueue = new PriorityQueue<>();

        priorityQueue.add(2);
        priorityQueue.add(1);

        System.out.println(priorityQueue);

        System.out.println("\n\n");
        System.out.println("==IMPRIMINDO DOCUMENTO==");
        Fila<Documento> filaDoc = new Fila<>();
        filaDoc.enfileira(new Documento("A", 1));
        filaDoc.enfileira(new Documento("B", 2));
        filaDoc.enfileira(new Documento("C", 3));
        filaDoc.enfileira(new Documento("D", 7));
        filaDoc.enfileira(new Documento("E", 19));

        while(!filaDoc.estaVazia()) {
            Documento doc = filaDoc.desenfileira();
            System.out.println("Imprimindo documento "+doc.getNome());
            try {
                Thread.sleep(200*doc.getNumFolhas());
            } catch(InterruptedException err) {
                err.printStackTrace();
            }
        }

        System.out.println("\n\n");
        System.out.println("==ATENDIMENTO DE FILA==");
        new FilaAtendimento();
        System.out.println("==PRONTO SOCORRO==");
        new ProntoSocorro();
    }
}
