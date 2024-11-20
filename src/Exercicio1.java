import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value_1, value_2, soma;

        System.out.print("Digite o 1° valor: ");
        value_1 = sc.nextInt();
        System.out.print("Digite o 2° valor: ");
        value_2 = sc.nextInt();

        soma = value_1 + value_2;
        System.out.println("O resultado de " + value_1 + " + " + value_2 + " = " + soma);

        sc.close();
    }
}