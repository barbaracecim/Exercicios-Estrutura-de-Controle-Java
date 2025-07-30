
/*Escreva um programa que peça dois números ao usuário: um primeiro número e um segundo número maior que o primeiro. 
Em seguida, o usuário deve escolher se quer ver os números pares ou ímpares nesse intervalo.

O programa deve exibir todos os números do intervalo, de acordo com a escolha (par ou ímpar),
incluindo os números limites, e mostrar os valores em ordem decrescente.
 */
import java.util.Scanner;

public class ParesImpares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedindo os dois números
        System.out.print("Digite o primeiro número: ");
        int primeiro = sc.nextInt();

        System.out.print("Digite o segundo número (maior que o primeiro): ");
        int segundo = sc.nextInt();

        // Validação para garantir que o segundo seja maior
        while (segundo <= primeiro) {
            System.out.print("O segundo número deve ser MAIOR que o primeiro. Digite novamente: ");
            segundo = sc.nextInt();
        }

        // Escolha par ou ímpar
        System.out.print("Você quer ver números PARES ou ÍMPARES? (Digite P/I): ");
        char escolha = sc.next().toUpperCase().charAt(0);

        // Começamos do segundo número e vamos até o primeiro (ordem decrescente)
        int atual = segundo;
        while (atual >= primeiro) {
            if (escolha == 'P' && atual % 2 == 0) {
                System.out.print(atual + " ");
            } else if (escolha == 'I' && atual % 2 != 0) {
                System.out.print(atual + " ");
            }
            atual--; // Decrementa para andar para trás
        }

        sc.close();
    }
}
