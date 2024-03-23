
 import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
  Scanner teclado = new Scanner(System.in);
    
     System.out.print("Digite o preço do pão: R$ ");
            double precoPao = teclado.nextDouble();

            System.out.println("Panificadora Pão de Ontem - Tabela de preços");

            for (int i = 1; i <= 50; i++) {
                double precoTotal = i * precoPao;
                System.out.println(i + " - R$ " + String.format("%.2f", precoTotal));
            }
        }
    }