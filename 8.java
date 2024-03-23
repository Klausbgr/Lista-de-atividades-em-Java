
 import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
  Scanner teclado = new Scanner(System.in);

  int soma = 0;
  int contador = 0;

    System.out.println("Digite 5 números: ");

    while (contador < 5) {
      int numero = teclado.nextInt();
      soma += numero;
      contador++;
    }

    double media = (double) soma / 5;

    System.out.println("A média dos números é: " + media);
    System.out.println("A soma dos números é: " + soma);
    
    teclado.close();
  }
}