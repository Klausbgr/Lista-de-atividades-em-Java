
 import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
  Scanner teclado = new Scanner(System.in);
    
    System.out.print("Digite a quantidade de CDs na coleção: ");
            int quantidadeCDs = teclado.nextInt();

            if (quantidadeCDs <= 0) {
                System.out.println("Quantidade inválida de CDs.");
                return;
            }

            double totalInvestido = 0;

            for (int i = 1; i <= quantidadeCDs; i++) {
                System.out.print("Digite o valor do CD " + i + ": ");
                double valorCD = teclado.nextDouble();

                if (valorCD <= 0) {
                    System.out.println("Valor inválido para o CD " + i + ".");
                    return;
                }

                totalInvestido += valorCD;
            }

            double mediaGastoPorCD = totalInvestido / quantidadeCDs;

            System.out.println("O valor total investido na coleção é: R$" + totalInvestido);
            System.out.println("O valor médio gasto em cada CD é: R$" + mediaGastoPorCD);
        }
    }