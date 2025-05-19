import java.util.Scanner;

public class Desafio1For {

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        /* 1) Desafio da estrutura for
        Escreva um programa que solicita 10 números para o usuário
        e imprime na saída a soma dos números digitados.
        Permita que o usuário digite apenas números pares.
        Caso um número ímpar seja informado, ignore e solicite um novo número ao usuário.
        */
        int numeros = 0;
        for (int i = 0; i < 10; ) {
            System.out.print("Digite um numero: ");
            int novo = in.nextInt();
            if (novo % 2 == 0) {
                numeros += novo;
                i++;
            } else {
                System.out.println("Numero incorreto, digite numeros pares.");
            }
        }
        System.out.printf("Total de numeros: %d%n", numeros);
    }
}
