package br.com.profdinho.matriz;

import java.util.Scanner;

/**
 *
 * @author dinho
 */
public class Matriz {
    public static void main(String[] args) {
        /*
        Integer vetor[] = new Integer[10];
        Scanner scanner = new Scanner(System.in);
        for ( int i = 0; i < 10; i++) {
            System.out.println("Digite um inteiro: ");
            vetor[i] = scanner.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("O valor da posição " + i + " é " + vetor[i]);
        }
*/
        Integer vetor1[] = new Integer[5];
        Integer vetor2[] = new Integer[5];
        Integer vetor3[] = new Integer[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um valor para o vetor1:");
            vetor1[i] = scanner.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um valor para o vetor2:");
            vetor2[i] = scanner.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            vetor3[i] = vetor1[i] + vetor2[i];
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("A soma da posição " + i + " é " + vetor3[i]);
        }
    }
}
