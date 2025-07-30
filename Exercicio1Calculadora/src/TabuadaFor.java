import java.util.Scanner;

public class TabuadaFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número (inteiro ou decimal): ");
        double numero = sc.nextDouble();

        // Multiplicação
        System.out.println("\nTabuada de Multiplicação");
        for (int i = 1; i <= 10; i++) {  // i começa em 1, vai até 10, aumentando de 1 em 1
            double mult = numero * i;
            System.out.printf("%.2f x %d = %.2f\n", numero, i, mult);
        }

        // Adição
        System.out.println("\nTabuada de Adição");
        for (int i = 1; i <= 10; i++) {
            double soma = numero + i;
            System.out.printf("%.2f + %d = %.2f\n", numero, i, soma);
        }

        // Subtração
        System.out.println("\nTabuada de Subtração");
        for (int i = 1; i <= 10; i++) {
            double subt = numero - i;
            System.out.printf("%.2f - %d = %.2f\n", numero, i, subt);
        }

        // Divisão
        System.out.println("\nTabuada de Divisão");
        for (int i = 1; i <= 10; i++) {
            double div = numero / i;
            System.out.printf("%.2f / %d = %.2f\n", numero, i, div);
        }

        sc.close();
    }
}
