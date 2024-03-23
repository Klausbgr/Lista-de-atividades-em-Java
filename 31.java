
 import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
  Scanner teclado = new Scanner(System.in);
    
    int numeroProduto = 1;
            double totalCompra = 0;

            System.out.println("Lojas Tabajara");

            while (true) {
                System.out.print("Produto " + numeroProduto + ": R$ ");
                double precoProduto = teclado.nextDouble();

                if (precoProduto == 0) {
                    break;
                }

                totalCompra += precoProduto;
                numeroProduto++;
            }

            System.out.println("Total: R$ " + String.format("%.2f", totalCompra));

            System.out.print("Dinheiro: R$ ");
            double dinheiroCliente = teclado.nextDouble();

            double troco = dinheiroCliente - totalCompra;
            System.out.println("Troco: R$ " + String.format("%.2f", troco));
        }
    }