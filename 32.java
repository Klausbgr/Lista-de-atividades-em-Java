
 import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
  Scanner teclado = new Scanner(System.in);
    
     System.out.print("Digite um número inteiro para calcular o fatorial: ");
            int numero = teclado.nextInt();

            System.out.println("Fatorial de: " + numero);

            int fatorial = calcularFatorial(numero);

            System.out.print(numero + "! = ");
            for (int i = numero; i >= 1; i--) {
                System.out.print(i);
                if (i > 1) {
                    System.out.print(" . ");
                }
            }
            System.out.println(" = " + fatorial);
        }

        public static int calcularFatorial(int numero) {
            if (numero == 0 || numero == 1) {
                return 1;
            }
            return numero * calcularFatorial(numero - 1);
        }
    }