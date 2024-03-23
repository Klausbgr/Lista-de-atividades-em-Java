
 import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
  Scanner teclado = new Scanner(System.in);

  System.out.println("Digite um numero para ver a tabuada (de 1 a 10): ");
  int numero = teclado.nextInt();

    for (int i = 1; i <= 10; i++) {
      System.out.println(numero + " x " + i + " = " + (numero * i));
    }
    teclado.close();
  }
}