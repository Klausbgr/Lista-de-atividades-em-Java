
 import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
  Scanner teclado = new Scanner(System.in);
    
    System.out.print("Digite um número inteiro para encontrar todos os números primos até ele: ");
        int N = teclado.nextInt();

        int totalDivisoes = 0;

        System.out.println("Números primos entre 1 e " + N + ":");

        for (int i = 2; i <= N; i++) {
            if (ehPrimo(i)) {
                System.out.print(i + " ");
                totalDivisoes++;
            }
        }

        System.out.println("\nTotal de divisões realizadas: " + totalDivisoes);
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
        }
  
