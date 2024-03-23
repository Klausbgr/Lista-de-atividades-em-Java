
 import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
  Scanner teclado = new Scanner(System.in);

  int quantidadePares = 0;
  int quantidadeImpares = 0;

    System.out.println("Digite 10 numeros inteiros:");

    for (int i = 0; i < 10; i++) {
      int numero = teclado.nextInt();

      if (numero % 2 == 0) {
        quantidadePares++;
      } else {
        quantidadeImpares++;
      }
    }
    System.out.println("Quantidade de numeros pares: " + quantidadePares);
    System.out.println("Quantidade de numeros impares: " + quantidadeImpares);
    teclado.close();
  }
}