
 import java.util.Scanner;
import java.text.DecimalFormat;
public class Main {
  public static void main(String[] args) {
  Scanner teclado = new Scanner(System.in);
    
     String[] especificacoes = {"Cachorro Quente", "Bauru Simples", "Bauru com ovo", "Hambúrguer", "Cheeseburguer", "Refrigerante"};
            int[] codigos = {100, 101, 102, 103, 104, 105};
            double[] precos = {1.20, 1.30, 1.50, 1.20, 1.30, 1.00};

            double totalPedido = 0.0;

            while (true) {
                System.out.println("Digite o código do item (ou -1 para encerrar o pedido):");
                int codigo = teclado.nextInt();

                if (codigo == -1) {
                    break;
                }

                boolean codigoValido = false;
                int indiceItem = 0;
                for (int i = 0; i < codigos.length; i++) {
                    if (codigo == codigos[i]) {
                        codigoValido = true;
                        indiceItem = i;
                        break;
                    }
                }

              
                if (!codigoValido) {
                    System.out.println("Código inválido. Por favor, digite um código válido.");
                    continue;
                }

              
                System.out.println("Digite a quantidade desejada:");
                int quantidade = teclado.nextInt();

                double valorItem = precos[indiceItem] * quantidade;
                System.out.printf("Item: %s - Quantidade: %d - Valor a ser pago: R$ %.2f\n", especificacoes[indiceItem], quantidade, valorItem);

                totalPedido += valorItem;
            }

            System.out.printf("Total do pedido: R$ %.2f\n", totalPedido);

            teclado.close();
        }
    }