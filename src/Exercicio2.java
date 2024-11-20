import java.util.Scanner;
import java.util.Locale;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        double raio, area;

        System.out.print("Digite o raio do círculo: ");
        raio = sc.nextDouble();

        area = 3.14159 * (raio * raio);
        System.out.printf("A área do círculo é: %.4f%n", area);

        sc.close();
    }
}