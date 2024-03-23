
 import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
  Scanner teclado = new Scanner(System.in);

  System.out.println("Digite a base: ");
    double base = teclado.nextDouble();

    System.out.println("Digite o expoente: ");
    double expoente = teclado.nextDouble();

    double resultado = Math.pow(base, expoente);

    System.out.println("O resultado de: " + base + " elevado a " + expoente + " é: " + resultado);

      if (expoente < 0) {
      base = 1 / base;
      expoente = -expoente;
      }

      for (int i = 0; i < expoente; i++) {
        resultado *= base;
      }
    teclado.close();
  }
}