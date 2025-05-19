import java.util.Scanner;

public class Desafio {

    /*
    * Este programa deve receber as seguintes entradas de dados do usuário:
        Nome (texto)
        Valor por hora (decimal)
        Horas trabalhadas (inteiro)
        Valor dos descontos (decimal)
    * */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = input.nextLine();

        System.out.print("Valor por hora: ");
        double valorHora = input.nextDouble();

        System.out.print("Horas trabalhadas: ");
        int horasTrabalhadas = input.nextInt();

        System.out.print("Valor dos descontos: ");
        double valorDescontos = input.nextDouble();

        double valorTotalTrabalhado = valorHora * horasTrabalhadas;
        double valorTotalDevido = valorTotalTrabalhado - valorDescontos;

        System.out.printf("Folha de pagamento: %s%n", nome);
        System.out.printf("%d horas x R$%.2f = R$%.2f%n",
                horasTrabalhadas, valorHora, valorTotalTrabalhado);
        System.out.printf("Descontos: R$%.2f%n", valorDescontos);
        System.out.printf("Total devido: R$%.2f%n", valorTotalDevido);
    }
    /*
    * A saída do programa deve ser um resumo da folha de pagamento, mostrando os cálculos
    * e os resultados finais, como no exemplo abaixo:
        Folha de pagamento: Thiago Faria
        172 horas x R$150.20 = R$25834.40
        Descontos: R$482.88
        Total devido: R$25351.52
    * */
}