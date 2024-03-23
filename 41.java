
 import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
  Scanner teclado = new Scanner(System.in);
    
    System.out.print("Digite o valor da dívida: ");
            double divida = teclado.nextDouble();

            System.out.println("Valor da dívida: R$ " + divida);
            System.out.println("Quantidade de Parcelas\t% de Juros\tValor da Parcela");

            double[] juros = {0, 0.1, 0.15, 0.2, 0.25};
            int[] parcelas = {1, 3, 6, 9, 12};

            for (int i = 0; i < juros.length; i++) {
                double valorParcela = calcularValorParcela(divida, juros[i], parcelas[i]);
                System.out.println(parcelas[i] + "\t\t\t\t" + (juros[i] * 100) + "%\t\t\t\tR$ " + valorParcela);
            }
        }

        public static double calcularValorParcela(double divida, double juros, int parcelas) {
            double valorComJuros = divida * (1 + juros);
            return valorComJuros / parcelas;
        }
    }