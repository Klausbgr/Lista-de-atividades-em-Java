
 import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
  Scanner teclado = new Scanner(System.in);
    
    System.out.print("Quantas pessoas na turma? ");
            int n = teclado.nextInt();

            if (n <= 0) {
                System.out.println("Por favor, insira um número positivo maior que zero.");
                return;
            }

            int somaIdades = 0;

            for (int i = 1; i <= n; i++) {
                System.out.print("Digite a idade da " + i + "ª pessoa: ");
                int idade = teclado.nextInt();
                somaIdades += idade;
            }

            double mediaIdades = (double) somaIdades / n;

            System.out.println("A média de idade da turma é: " + mediaIdades);

            if (mediaIdades >= 0 && mediaIdades <= 25) {
                System.out.println("A turma é jovem.");
            } else if (mediaIdades >= 26 && mediaIdades <= 60) {
                System.out.println("A turma é adulta.");
            } else {
                System.out.println("A turma é idosa.");
            }
        }
    }