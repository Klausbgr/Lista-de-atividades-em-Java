
 import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
  Scanner teclado = new Scanner(System.in);

  int maior = Integer.MIN_VALUE;

    System.out.println("Digite 5 números: ");
    for (int i = 0; i < 5; i++) {
      int numero = teclado.nextInt();
      if (numero > maior) {
        maior = numero;
      }
    }
    System.out.println("O maior número digitado foi: " + maior);
    
    teclado.close();
  }
}