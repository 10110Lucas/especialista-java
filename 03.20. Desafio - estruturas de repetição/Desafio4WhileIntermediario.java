import java.util.Scanner;

public class Desafio4WhileIntermediario {
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        /* 4) Desafio da estrutura while (intermediário)
            Escreva um programa que solicita um número inteiro para o usuário
            e imprime na saída o número com os dígitos invertidos.
            Por exemplo, se o número digitado for 98765, a saída deve ser 56789.
            Este é um exercício intermediário, especialmente porque precisará
            usar suas habilidades em lógica.
            É possível fazer isso apenas com um loop e cálculos matemáticos.
        */
        System.out.print("Digite um numero: ");
        int num = in.nextInt();
        int inverso = 0;
        int aux = num;
        while (aux > 0) {
            int resto = aux % 10;
            inverso = inverso * 10 + resto;
            aux /= 10;
        }
        System.out.printf("Numero  digitado: %d\n", num);
        System.out.printf("Numero invertido: %d", inverso);
    }
}
