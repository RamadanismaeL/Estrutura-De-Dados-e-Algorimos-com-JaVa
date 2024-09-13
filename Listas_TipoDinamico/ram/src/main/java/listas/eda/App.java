package listas.eda;

import listas.eda.TipoDinamico.Lista;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        //Lista<String> vetor = new Lista<String>(1);

        //vetor.adiciona("Elemento");

        Lista<Contato> vetor = new Lista<Contato>(3);

        Contato c1 = new Contato("Ramadan 1", "123-4567", "ramadan1@email.com");
        Contato c2 = new Contato("Ramadan 2", "890-1234", "ramadan2@email.com");
        Contato c3 = new Contato("Ramadan 3", "567-8901", "ramadan2@email.com");

        vetor.adiciona(c1);
        vetor.adiciona(c2);
        vetor.adiciona(c3);

        System.out.println(vetor);

        vetor.limpar();

        System.out.println(vetor);
    }
}
