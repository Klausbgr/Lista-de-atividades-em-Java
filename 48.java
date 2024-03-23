import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
  Scanner teclado = new Scanner(System.in);
          
        System.out.print("Digite um número inteiro positivo: ");
            String numero = teclado.nextLine();

            if (numero.matches("\\d+")) {
                String numeroInvertido = new StringBuilder(numero).reverse().toString();
                System.out.println("O número invertido é: " + numeroInvertido);
            } else {
                System.out.println("Por favor, digite um número inteiro positivo válido.");
            }

            teclado.close();
        }
    }