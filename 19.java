
 import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
  Scanner teclado = new Scanner(System.in);

    System.out.print("Quantos números deseja inserir? ");
    int n = teclado.nextInt();

    if (n <= 0) {
        System.out.println("Por favor, insira um número positivo maior que zero.");
    }

    int[] numeros = new int[n];

    for (int i = 0; i < n; i++) {
        int numero;
        do {
            System.out.print("Digite o " + (i + 1) + "º número (entre 0 e 1000): ");
            numero = teclado.nextInt();
        } while (numero < 0 || numero > 1000);
        numeros[i] = numero;
    }

    int menor = numeros[0];
    int maior = numeros[0];
    int soma = numeros[0];

    for (int i = 1; i < n; i++) {
        if (numeros[i] < menor) {
            menor = numeros[i];
        }
        if (numeros[i] > maior) {
            maior = numeros[i];
        }
        soma += numeros[i];
    }

    System.out.println("Menor valor: " + menor);
    System.out.println("Maior valor: " + maior);
    System.out.println("Soma dos valores: " + soma);
    teclado.close();
  }
}