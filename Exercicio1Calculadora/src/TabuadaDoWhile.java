import java.util.Scanner;

public class TabuadaDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número (inteiro ou decimal): ");
        double numero = sc.nextDouble();

        int i;

        // Multiplicação
        System.out.println("\nTabuada de Multiplicação");
        i = 1;
        do {
            double mult = numero * i;
            System.out.printf("%.2f x %d = %.2f\n", numero, i, mult);
            i++;
        } while (i <= 10);

        // Soma
        System.out.println("\nTabuada de Adição");
        i = 1;
        do {
            double soma = numero + i;
            System.out.printf("%.2f + %d = %.2f\n", numero, i, soma);
            i++;
        } while (i <= 10);

        // Subtração
        System.out.println("\nTabuada de Subtração");
        i = 1;
        do {
            double subt = numero - i;
            System.out.printf("%.2f - %d = %.2f\n", numero, i, subt);
            i++;
        } while (i <= 10);

        // Divisão
        System.out.println("\nTabuada de Divisão");
        i = 1;
        do {
            double div = numero / i;
            System.out.printf("%.2f / %d = %.2f\n", numero, i, div);
            i++;
        } while (i <= 10);

        sc.close();
    }
}
