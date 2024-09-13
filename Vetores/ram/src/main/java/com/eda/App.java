/**
 * @author Ramadan ismaeL
 */

package com.eda;

import com.eda.Vetores.Vetor;
import com.eda.Vetores.VetorObjetos;

public class App {
    public static void main(String[] args) {
        // System.out.println( "Hello Friends!" );

        Vetor vetor = new Vetor(3);
        // int i = 0;
        // i++;

        /*
         * try {
         * vetor.adiciona("elemento 1");
         * vetor.adiciona("elemento 2");
         * vetor.adiciona("elemento 3");
         * } catch(Exception err) {
         * err.printStackTrace();
         * }

        vetor.adiciona("elemento 1");
        vetor.adiciona("elemento 2");
        vetor.adiciona("elemento 3");

        System.out.println("> Tamanho = "+vetor.getTamanho());
        System.out.print("> Elementos do Vetor = ");
        System.out.println(vetor.toString());
        System.out.println("\n");
        System.out.print("> Elemento da Posição 2 = ");
        System.out.println(vetor.busca(2));
        System.out.print("> Posição 2 do elemento = ");
        System.out.println(vetor.busca("elemento 2"));
        System.out.println(vetor.busca("elemento 5"));
        System.out.println("\n");
        System.out.println("\n");
        */
               
        vetor.adiciona("B");
        vetor.adiciona("C");
        vetor.adiciona("E");
        vetor.adiciona("F");
        vetor.adiciona("G");
        
        System.out.println(vetor);
        
        /*vetor.adiciona_QP(0, "A");

        System.out.println(vetor);

        vetor.adiciona_QP(3, "D");

        System.out.println(vetor);*/

        vetor.remove(1);
        System.out.println(vetor);

        System.out.println("\n");
        System.out.println("Remover o elemento R");
        int posicao = vetor.busca("R");
        if(posicao > -1) {
            vetor.remove(posicao);
        } else {
            System.out.println("Elemento não existe no vetor");
        }
        System.out.println(vetor);

        System.out.println("\n\n\n");
        System.out.println("Vetores de Objectos");

        VetorObjetos vetorO = new VetorObjetos(3);

        vetorO.adiciona(3);
        vetorO.adiciona("Ramadan");
        vetorO.adiciona(5);

        System.out.println("Tamanho = "+vetorO.getTamanho());
        System.out.println(vetorO);

        System.out.println("\n\n\n");
        System.out.println("====================\n");
        
        VetorObjetos vO = new VetorObjetos(3);

        Contato c1 = new Contato("Ramadan 1", "123-4567", "ramadan1@email.com");
        Contato c2 = new Contato("Ramadan 2", "890-1234", "ramadan2@email.com");
        Contato c3 = new Contato("Ramadan 3", "567-8901", "ramadan2@email.com");

        Contato c4 = new Contato("Ramadan 1", "123-4567", "ramadan1@email.com");;

        vO.adiciona(c1);
        vO.adiciona(c2);
        vO.adiciona(c3);

        System.out.println("Tamanho = "+vO.getTamanho());

        int pos = vO.busca(c4);
        if(pos > -1) {
            System.out.println("Elemento existe no vetor");
        } else {
            System.out.println("Elemento não existe no vetor");
        }

        System.out.println(vO.toString());
    }
}
