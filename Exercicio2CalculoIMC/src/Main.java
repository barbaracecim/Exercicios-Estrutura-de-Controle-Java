import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedindo altura (aceita vírgula ou ponto)
        System.out.println("Digite sua altura em metros (Ex.: 1,75): ");
        String alturaStr = sc.next().replace(",", "."); // troca vírgula por ponto
        double altura = Double.parseDouble(alturaStr);

        // Pedindo peso (aceita vírgula ou ponto)
        System.out.println("Digite seu peso em Kg (Ex.: 70,5): ");
        String pesoStr = sc.next().replace(",", ".");
        double peso = Double.parseDouble(pesoStr);

        // Calculando o IMC
        double imc = peso / (altura * altura);

        System.out.printf("\nSeu IMC é: %.2f\n", imc);

        // Verificação
        if (imc <= 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc <= 24.9) {
            System.out.println("Peso ideal");
        } else if (imc <= 29.9) {
            System.out.println("Levemente acima do peso");
        } else if (imc <= 34.9) {
            System.out.println("Obesidade Grau I");
        } else if (imc <= 39.9) {
            System.out.println("Obesidade Grau II (Severa)");
        } else {
            System.out.println("Obesidade Grau III (Mórbida)");
        }

        sc.close();
    }
}


