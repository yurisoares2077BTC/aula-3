import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // 1. Leitura dos quatro números inteiros
        System.out.print("Digite o primeiro número: ");
        int numero1 = entrada.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = entrada.nextInt();

        System.out.print("Digite o terceiro número: ");
        int numero3 = entrada.nextInt();

        System.out.print("Digite o quarto número: ");
        int numero4 = entrada.nextInt();

        // 2. Cálculo da soma
        int soma = numero1 + numero2 + numero3 + numero4;

        // 3. Exibição do resultado
        System.out.println("A soma dos quatro números é: " + soma);

        entrada.close();
    }
}
