package Desafio_03_09_Calculadora_complexa_de_IMC;

import java.util.Scanner;

public class DesafioIMC {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Qual seu sexo (M ou F): ");
        char sexo = sc.nextLine().toUpperCase().charAt(0);

        System.out.print("Digite sua altura: ");
        double altura = sc.nextDouble();

        System.out.print("Digite sua peso: ");
        double peso = sc.nextDouble();

        double imc = peso/(altura*altura);
        /*
        Condição	                IMC em mulheres	            IMC em homens
        Abaixo do peso	            Menor que 19.1	            Menor que 20.7
        No peso ideal	            Entre 19.1 e 25.8	        Entre 20.8 e 26.4
        Um pouco acima do peso	    Entre 25.9 e 27.3	        Entre 26.5 e 27.8
        Acima do peso ideal	        Entre 27.4 e 32.3	        Entre 27.9 e 31.1
        Obeso	                    Maior que 32.3	            Maior que 31.1      */
        System.out.printf("%nAtenção %s, você está: ", nome);
        boolean necessarioMensagem = true;
        if ((sexo == 'F' && imc < 19.1) || (sexo == 'M' && imc < 20.7)) {
            System.out.println("Abaixo do peso.");
        } else if ((sexo == 'F' && imc <= 25.8) || (sexo == 'M' && imc <= 26.4)) {
            System.out.println("No peso ideal.");
            necessarioMensagem = false;
        } else if ((sexo == 'F' && imc <= 27.3) || (sexo == 'M' && imc <= 27.8)) {
            System.out.println("Um pouco a cima do peso.");
        } else if ((sexo == 'F' && imc <= 32.3) || (sexo == 'M' && imc <= 31.1)) {
            System.out.println("Acima do peso ideal.");
        } else {
            System.out.println("Obeso.");
        }
        String msgHomem = (sexo == 'M') ? " e deve estar entre '20,8' a '26,4'" : "";
        String msgMulher = (sexo == 'F') ? " e deve estar entre '19,1' a '25,8'" : "";
        String msgAviso = (necessarioMensagem) ? msgHomem + msgMulher : "";
        System.out.printf("Seu IMC foi de: '%.2f'%s", imc, msgAviso);
        System.out.print("\nCuide bem da sua saúde, obrigado!");
    }
}
