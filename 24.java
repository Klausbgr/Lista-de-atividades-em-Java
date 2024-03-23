
 import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
  Scanner teclado = new Scanner(System.in);
    
     System.out.print("Quantas notas deseja calcular a média? ");
            int n = teclado.nextInt();

            if (n <= 0) {
                System.out.println("Por favor, insira um número positivo maior que zero.");
                return;
            }

            double soma = 0;

            for (int i = 1; i <= n; i++) {
                System.out.print("Digite a " + i + "ª nota: ");
                double nota = teclado.nextDouble();
                soma += nota;
            }

            double media = soma / n;
            System.out.println("A média aritmética das " + n + " notas é: " + media);
        }
    }