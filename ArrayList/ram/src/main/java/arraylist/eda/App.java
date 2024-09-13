/**
 * @author Ramadan ismaeL
 */

package arraylist.eda;

import java.util.ArrayList;

public class App {
    public static void main( String[] args ) {
        //System.out.println( "Hello Friends!" );
        ArrayList<String> arraylist = new ArrayList<String>();

        arraylist.add("A");
        arraylist.add("M");

        System.out.println(arraylist);

        arraylist.add(0, "R");

        System.out.println(arraylist);

        // Busca
        boolean exist = arraylist.contains(("A"));
        if(exist) {
            System.out.println("Elemento existe no array!");
        } else {
            System.out.println("Elemento não existe no array!");
        }

        int posicao = arraylist.indexOf("D");
        if(posicao > -1) {
            System.out.println("Elemento existe no array!");
        } else {
            System.out.println("Elemento não existe no array!");
        }

        // BUSCA POR POSIÇÃO
        System.out.println(arraylist.get(2));

        // REMOVE
        arraylist.remove(0);
        arraylist.remove("R");

        System.out.println(arraylist);
        System.out.println("Posição = "+arraylist.size());

        // REMOVER TODOS OS ELEMENTOS
        arraylist.clear();
        System.out.println(arraylist);
        System.out.println("Posição = "+arraylist.size());
    }
}
