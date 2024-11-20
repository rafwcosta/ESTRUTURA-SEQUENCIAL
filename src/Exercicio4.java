import java.util.Scanner;
import java.util.Locale;

public class Exercicio4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        // Variáveis
        int numeroDoFuncionario, horasTrabalhadas;
        double valorQueRecebePorHora, salarioDoFuncionario;

        // Entrada
        System.out.print("Número do funcionário: ");
        numeroDoFuncionario = sc.nextInt();
        System.out.print("Horas trabalhadas: ");
        horasTrabalhadas = sc.nextInt();
        System.out.print("Valor que recebe por hora: ");
        valorQueRecebePorHora = sc.nextDouble();

        // Processamento
        salarioDoFuncionario = horasTrabalhadas * valorQueRecebePorHora;

        // Saída
        System.out.println();
        System.out.println("Número do funionário: " + numeroDoFuncionario);
        System.out.printf("Salário: R$%.2f%n", salarioDoFuncionario);

        // Fechamento do código
        sc.close();

    }
}