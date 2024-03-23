import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
  Scanner teclado = new Scanner(System.in);
          
         while (true) {
                System.out.print("Digite um número inteiro positivo menor que 16 (ou -1 para encerrar): ");
                int numero = teclado.nextInt();

               
                if (numero == -1) {
                    System.out.println("Programa encerrado.");
                    break;
                }

                if (numero < 0 || numero >= 16) {
                    System.out.println("Por favor, digite um número inteiro positivo menor que 16.");
                    continue;
                }

                long fatorial = calcularFatorial(numero);
                System.out.println("O fatorial de " + numero + " é: " + fatorial);
            }

            teclado.close();
        }

        public static long calcularFatorial(int numero) {
            long fatorial = 1;
            for (int i = 1; i <= numero; i++) {
                fatorial *= i;
            }
            return fatorial;
        }
    }