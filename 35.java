
 import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
  Scanner teclado = new Scanner(System.in);
    
    System.out.print("Digite um número inteiro: ");
            int limiteSuperior = teclado.nextInt();

            System.out.println("Números primos entre 1 e " + limiteSuperior + ":");
            listarNumerosPrimos(limiteSuperior);
        }

        public static void listarNumerosPrimos(int limiteSuperior) {
            for (int numero = 2; numero <= limiteSuperior; numero++) {
                if (ehPrimo(numero)) {
                    System.out.print(numero + " ");
                }
            }
            System.out.println();
        }

        public static boolean ehPrimo(int numero) {
            if (numero <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }