import java.util.Scanner;
import java.util.Locale;

public class Exercicio5 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        // VARIÁVEIS
        int numeroPecas_1, numeroPecas_2;
        double valorUnitarioPeca_1, valorUnitarioPeca_2, valorASerPago;

        // ENTRADAS 1
        System.out.print("Número de peças 1: ");
        numeroPecas_1 = sc.nextInt();
        System.out.print("Valor unitário de cada peça 1: ");
        valorUnitarioPeca_1 = sc.nextDouble();

        // LINHA VAZIA
        System.out.println();

        // ENTRADAS 2
        System.out.print("Número de peças 2: ");
        numeroPecas_2 = sc.nextInt();
        System.out.print("Valor unitário de cada peça 2: ");
        valorUnitarioPeca_2 = sc.nextDouble();

        // LINHA VAZIA
        System.out.println();

        // PROCESSAMENTOS / CÁLCULOS
        valorASerPago = (numeroPecas_1 * valorUnitarioPeca_1) + (numeroPecas_2 * valorUnitarioPeca_2);

        // SÁIDA
        System.out.printf("Valor a ser pago: R$%.2f%n", valorASerPago);

        // FECHAMENTO DO ALGORITMO
        sc.close();

    }
}