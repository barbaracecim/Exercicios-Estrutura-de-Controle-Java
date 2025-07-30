import java.util.Scanner; 

public class TabuadaWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        System.out.print("Digite um número (inteiro ou decimal) para ver a tabuada: ");
        double numero = sc.nextDouble(); 

        int i = 1; 

        //multiplicação

        System.out.println("\n Tabuada de Multiplicação");
        while (i <= 10) { //  Enquanto "i" for menor ou igual a 10, repete o bloco abaixo:
            double mult = numero * i; // Calcula o resultado da multiplicação
            System.out.printf("%.2f x %d = %.2f\n", numero, i, mult);

            i++; // Aumenta o valor de "i" em 1 (então vai para 2, 3, 4... até 10)
        }

        //soma
        i=1;  //reinicia o contador
        System.out.println("\n Tabuada de Adição");

         while (i <= 10) { 
            double soma = numero + i;
            System.out.printf("%.2f + %d = %.2f\n", numero, i, soma);
 
            i++; 
        }

        //subtração
        i=1;
        System.out.println("\n Tabuada de Subtração");

        while(i<=10){
            double subt = numero - i;
            System.out.printf("%.2f - %d = %.2f\n", numero, i, subt);

            i++;
        }

        //divisao
        i=1;
        System.out.println("\nTabuada de Divisão");

        while(i<=10){
            double div = numero/i; 
            System.out.printf("%.2f / %d = %.2f\n", numero, i, div);

            i++;
        }

        sc.close(); // Fecha o Scanner (boa prática para liberar memória)
    }
}

/* Essa é somente uma maneira de realizar contas simples de uma tabuada 
utilizando o while. A maneira mais simples para efetuar isso usando while é a seguinte: 

import java.util.Scanner;

public class TabuadaUnica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número (inteiro ou decimal): ");
        double numero = sc.nextDouble();

        int i = 1;

        while (i <= 10) {
            double mult = numero * i;
            double soma = numero + i;
            double sub = numero - i;
            double div = numero / i;

            System.out.println("\nPara i = " + i + ":");
            System.out.println(numero + " x " + i + " = " + mult);
            System.out.println(numero + " + " + i + " = " + soma);
            System.out.println(numero + " - " + i + " = " + sub);
            System.out.println(numero + " / " + i + " = " + div);

            i++;
        }

        sc.close();
    }
}

 */

