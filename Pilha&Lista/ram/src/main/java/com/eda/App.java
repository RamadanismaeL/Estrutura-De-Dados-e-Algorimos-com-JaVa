/**
 * @author Ramadan ismaeL
 */

package com.eda;

import java.util.Stack;

import com.eda.Pilha.Pilha;

public class App {
    public static void main( String[] args ) {
        //System.out.println( "Hello Friend!" );

        //Pilha<Integer> pilha = new Pilha<Integer>(10);
        Pilha<Integer> pilha = new Pilha<Integer>();

        System.out.println("Está vázia? - "+pilha.estaVazia());

        for(int i = 1; i <= 3; i++) {
            pilha.empilha(i);
        }

        System.out.println(pilha);
        System.out.println("Tamanho = "+pilha.getTamanho());
        System.out.println("Está vázia? - "+pilha.estaVazia());
        System.out.println("Pilha no topo = "+pilha.topo());
        System.out.println(pilha);
        System.out.println("Desempilhando elemento "+pilha.desempilha());
        System.out.println(pilha);

        System.out.println("\n\n");
        System.out.println("===============");


        Stack<Integer> stack = new Stack<>(); //A classe Stack do JaVa não é uma estrutura estática.. Não usa algum array para armazenar os dados.. A Class Stack é uma Pilha Dinâmica, não precisa da capacidade, exemplo : Stack<Integer> stack = new Stack<>(20);

        //Empilhar
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.peek()); // Verificar o elemento do Topo
        System.out.println(stack.pop()); // Desempilhar
        System.out.println(stack);
        stack.clear();
        System.out.println(stack);

        System.out.println("\n\n\n");
        System.out.println("== P A L I N D R O M O ==");
        
        imprimirPalindromo("ADA");
        imprimirPalindromo("RAMADAN");
        imprimirPalindromo("AABCCBAA");

        System.out.println("\n\n\n");
        System.out.println("== S Í M B O L O    B A L A N C E A D O ==");
        imprimirSimbolo("A + B");
        imprimirSimbolo("A + B + (C - D)");
        imprimirSimbolo("{[()]}[](){()}");
        imprimirSimbolo("{[(]}[](){()}");
        imprimirSimbolo("A + B + C - D)");

        System.out.println("\n\n\n");
        System.out.println("== CONVERTER NÚMERO DECIMAL PARA BINÁRIO");
        imprimeDecimalBinario(25);
        System.out.println("== CONVERTER NÚMERO DECIMAL PARA QUALQUER BASE");
        imprimeDecimalQualquerBase(25, 2);
        imprimeDecimalQualquerBase(10035, 8);
        imprimeDecimalQualquerBase(10035, 16);
    }

    /* PALÍNDROMO - é uma palavra cuja primeira metade é simétrica à segunda metade.
    * Exemplo:  A A B C C B A A     - true
                A D D F D D A       - true
                A B F F B B         - false

                Socorram-me! Subi no ônibus me Marrocos!  - Ágora leia na inversa
                Ada, aia....., Anita latina, O galo no lago
    */

    public static boolean Palindromo(String palavra) {
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < palavra.length(); i++) {
            stack.push(palavra.charAt(i));
        }

        String palavraInversa = "";
        while(!stack.isEmpty()) {
            palavraInversa += stack.pop();
        }

        if(palavraInversa.equalsIgnoreCase(palavra)) {
            return true;
        }

        return false;
    }

    public static void imprimirPalindromo(String palavra) {
        System.out.println(palavra+" é palindromo? - "+Palindromo(palavra));
    }


    // SÍMBOLO BALANCEADOS
    final static String ABRE = "([{";
    final static String FECHA = ")]}";
    public static boolean simbolosBalanceados(String expressao) {
        Stack<Character> stack = new Stack<>();

        int index = 0;
        char simbolo, topo;

        while(index < expressao.length()) {
            simbolo = expressao.charAt(index);

            if(ABRE.indexOf(simbolo) > -1) {
                stack.push(simbolo);
            } else if(FECHA.indexOf(simbolo) > -1) {
                if(stack.isEmpty()) {
                    return false;
                } else {
                    topo = stack.pop();

                    if(ABRE.indexOf(topo) != FECHA.indexOf(simbolo)) {
                        return false;
                    }
                }
            }

            index++;
        }

        return true;
    }

    public static void imprimirSimbolo(String expressao) {
        System.out.println(expressao+" está balanceado? - "+simbolosBalanceados(expressao));
    }

    // CONVERTER NÚMERO DECIMAL PARA BINÁRIO
    /*public static void converterDecimal(int decimal) {
        Stack<Integer> stack = new Stack<>();

        int div;
        int resto = decimal;
        int novoResto;
        int binario;

        int index = 0;
        
        while(index < decimal) {
            div = resto/2;
            novoResto = div;
            binario = resto - (novoResto*2);
            if(binario > -1) {
                stack.push(binario);
            }
            resto = novoResto;

            index++;
        }

        String binarioString = "";
        while(!stack.isEmpty()) {
            binarioString += stack.pop();
        }
        System.out.println(decimal+" de decimal para binário = "+binarioString);
    }*/
    
    public static String decimalBinario(int numero) {
        Stack<Integer> stack = new Stack<>();
        String numBinario = "";
        int resto;

        while(numero > 0) {
            resto = numero%2;
            stack.push(resto);
            numero /= 2; // numero = numero/2
        }

        while(!stack.isEmpty()) {
            numBinario += stack.pop();
        }

        return numBinario;
    }

    public static void imprimeDecimalBinario(int numero) {
        System.out.println(numero+" em binário é: "+decimalBinario(numero));
    }

    public static String decimalQualquerBase(int numero, int base) {
        if(base > 16) {
            throw new IllegalArgumentException("A base é superior que 16..");
        }

        Stack<Integer> stack = new Stack<>();
        String numBase = "";
        int resto;
        String bases = "0123456789ABCDEF";

        while(numero > 0) {
            resto = numero%base;
            stack.push(resto);
            numero /= base;
        }

        while(!stack.isEmpty()) {
            numBase += bases.charAt(stack.pop());
        }

        return numBase;
    }
    public static void imprimeDecimalQualquerBase(int numero, int base) {
        System.out.println(numero+" para base "+ base + " é: "+decimalBinario(numero));
    }
}
