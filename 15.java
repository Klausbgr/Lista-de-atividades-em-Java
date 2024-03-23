
 import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
  Scanner teclado = new Scanner(System.in);

  int num1 = 0;
  int num2 = 1; 
  int nextNumber;
  int n;

    System.out.println("Digite o numero de termos da sequencia de Fibonacci: ");
    n = teclado.nextInt();

    for (int i = 1; i <= n; i++) {
      System.out.println(num1);
      nextNumber = num1 + num2;
      num1 = num2;
      num2 = nextNumber;
    }
    teclado.close();
  }
}