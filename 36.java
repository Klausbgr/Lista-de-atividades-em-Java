
 import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
  Scanner teclado = new Scanner(System.in);
    
    System.out.print("Montar a tabuada de: ");
            int numero = teclado.nextInt();

            System.out.print("Começar por: ");
            int inicio = teclado.nextInt();

            int fim;
            do {
                System.out.print("Terminar em: ");
                fim = teclado.nextInt();

                if (fim < inicio) {
                    System.out.println("O valor final deve ser maior ou igual ao valor inicial. Tente novamente.");
                }
            } while (fim < inicio);

            System.out.println("Vou montar a tabuada de " + numero + " começando em " + inicio + " e terminando em " + fim + ":");

            for (int i = inicio; i <= fim; i++) {
                int resultado = numero * i;
                System.out.println(numero + " X " + i + " = " + resultado);
            }
        }
    }