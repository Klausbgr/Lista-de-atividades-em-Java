
 import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
  Scanner teclado = new Scanner(System.in);
    
    System.out.print("Digite o número total de eleitores: ");
            int totalEleitores = teclado.nextInt();

            if (totalEleitores <= 0) {
                System.out.println("Número inválido de eleitores.");
                return;
            }

            int[] votos = new int[3];

            for (int i = 0; i < totalEleitores; i++) {
                System.out.println("Eleitor " + (i + 1) + ":");
                System.out.println("1 - Candidato 1");
                System.out.println("2 - Candidato 2");
                System.out.println("3 - Candidato 3");
                System.out.print("Digite o número do candidato escolhido: ");
                int voto = teclado.nextInt();

                if (voto >= 1 && voto <= 3) {
                    votos[voto - 1]++;
                } else {
                    System.out.println("Voto inválido! Tente novamente.");
                    i--;
                }
            }

            System.out.println("\nResultado da eleição:");
            for (int i = 0; i < votos.length; i++) {
                System.out.println("Candidato " + (i + 1) + ": " + votos[i] + " votos");
            }
        }
    }