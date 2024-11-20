import java.util.Scanner;
import java.util.Locale;

public class Exercicio6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double a, b, c, trianguloRetangulo, circle, trapezio, quadrado, retangulo;

        System.out.print("Digite o valor de A: ");
        a = sc.nextDouble();
        System.out.print("Digite o valor de B: ");
        b = sc.nextDouble();
        System.out.print("Digite o valor de C: ");
        c = sc.nextDouble();

        trianguloRetangulo = a * c / 2.0;
        circle = 3.14159 * c * c;
        trapezio = (a + b) / 2.0 * c;
        quadrado = b * b;
        retangulo = a * b;

        System.out.println();
        System.out.printf("Triângulo: %.3f%n", trianguloRetangulo);
        System.out.printf("Círculo: %.3f%n", circle);
        System.out.printf("Trapézio: %.3f%n", trapezio);
        System.out.printf("Quadrado: %.3f%n", quadrado);
        System.out.printf("Retângulo: %.3f%n", retangulo);

        sc.close();

    }
}