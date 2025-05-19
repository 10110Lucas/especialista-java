import java.util.Scanner;

public class Desafio5DoWhile {
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        /* 5) Desafio da estrutura do-while
            Escreva um programa que solicita números inteiros para o usuário
            de forma "infinita", até que o usuário escolha não digitar mais.
            nenhum número (pergunte ao usuário após informar cada número).
            Some todos os números ímpares e todos os números pares e imprima na saída o resultado.
        */
        int par = 0, impar = 0;
        do {
            System.out.print("Digite um numero: ");
            int num = in.nextInt();
            if (num % 2 == 0) par += num;
            else impar += num;
            System.out.print("Deseja continuar? ");
        } while (in.nextBoolean());

        System.out.printf("Numeros pares: %d\n", par);
        System.out.printf("Numeros impares: %d", impar);
    }
}
