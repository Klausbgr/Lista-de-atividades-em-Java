
 import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
  Scanner teclado = new Scanner(System.in);

  int n = 0;
  int fibterm = 0;

    System.out.println("Os termos da série de Fibonacci até que um termo maior que 500 seja encontrado são: ");
    while (fibterm <= 500) {
      System.out.println(fibterm);
      fibterm = n + fibterm;
      n = fibterm - n;
    }
    teclado.close();
  }
}