import java.util.Scanner;

public class Desafio3While {
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        /* 3) Desafio da estrutura while
            Escreva um programa que solicita números inteiros ao usuário de forma contínua
            e soma todos os números informados.
            O programa deve parar de solicitar mais números e imprimir a soma deles na saída
            apenas quando o valor total somado for igual ou superior a 100.
        */
        int soma = 0;
        while (soma <= 100) {
            System.out.print("Digite um numero: ");
            int num = in.nextInt();
            soma += (num > 0) ? num : 1;
        }
        System.out.printf("Total: %d", soma);
    }
}
