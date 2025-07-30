/*Escreva um programa onde o usuário informa um número inicial. 
Depois, ele informará outros N números (um por vez).

O programa deve continuar recebendo números e exibindo apenas aqueles que:
1) São maiores que o primeiro número informado.
2) São divisíveis pelo primeiro número (resto da divisão igual a 0).

O programa termina quando o usuário digitar um número que, dividido pelo número inicial, 
tenha resto diferente de zero (não seja divisível).
 */

 import java.util.Scanner;

public class Divisiveis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Número base
        System.out.print("Digite o número inicial (divisor): ");
        int base = sc.nextInt();

        // Agora o usuário vai digitar outros números até um não ser divisível
        while (true) { // loop infinito até quebrarmos
            System.out.print("Digite um número (ou um não divisível para encerrar): ");
            int n = sc.nextInt();

            // Ignora números menores que o base
            if (n < base) {
                System.out.println(n + " ignorado (menor que " + base + ")");
                continue; // pula para o próximo número
            }

            // Se não for divisível, encerra
            if (n % base != 0) {
                System.out.println(n + " não é divisível por " + base + ". Encerrando programa...");
                break; // sai do loop
            }

            // Caso divisível
            System.out.println(n + " é divisível por " + base);
        }

        sc.close();
    }
}
