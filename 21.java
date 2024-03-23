
 import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
  Scanner teclado = new Scanner(System.in);
    
    System.out.print("Digite um número inteiro: ");
    int numero = teclado.nextInt();

    if (numero <= 1) {
      System.out.println("O número não é primo.");
    } else {
      boolean ehPrimo = true;
      for (int i = 2; i <= Math.sqrt(numero); i++) {
        if (numero % i == 0) {
          ehPrimo = false;
          break;
        }
      }
      if (ehPrimo) {
        System.out.println("O número é primo.");
      } else {
        System.out.println("O número não é primo.");
      }
    }

    teclado.close();
  }
}