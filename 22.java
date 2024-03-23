
 import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
  Scanner teclado = new Scanner(System.in);
    
    System.out.print("Digite um número inteiro: ");
        int numero = teclado.nextInt();

        if (ehPrimo(numero)) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
            System.out.println("Divisores de " + numero + ":");
            listarDivisores(numero);
        }
    }

    public static boolean ehPrimo(int numero) {
        if (numero <= 1)
            return false;

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0)
                return false;
        }
        return true;
    }

    public static void listarDivisores(int numero) {
        for (int i = 2; i <= numero / 2; i++) {
            if (numero % i == 0) {
                System.out.println(i);
            }
        }
  }
}