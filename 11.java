
 import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
  Scanner teclado = new Scanner(System.in);

  System.out.println("Digite o primeiro número inteiro: ");
    int numero1 = teclado.nextInt();

  System.out.println("Digite o segundo número inteiro: ");
    int numero2 = teclado.nextInt();

    System.out.println("Números no intervalo entre " + numero1 + " e " + numero2 + ":");

  int inicio = Math.min(numero1, numero2);
  int fim = Math.max(numero1, numero2);

    int soma = 0;

    for (int i = inicio; i <= fim; i++)
      System.out.println(i);
      soma += i;
    
    System.out.println("Soma dos números no intervalo: " + soma);
    
    teclado.close();
  }
}