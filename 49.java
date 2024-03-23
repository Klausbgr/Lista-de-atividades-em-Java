import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
  Scanner teclado = new Scanner(System.in);
          
      System.out.print("Digite a quantidade de termos (n) da série: ");
            int n = teclado.nextInt();

            double somaSerie = 0;

            System.out.println("Termos da série:");

            for (int i = 1; i <= n; i++) {
                double termo = (double) i / (2 * i - 1);
                System.out.printf("%.2f", termo);

                if (i < n) {
                    System.out.print(" + ");
                } else {
                    System.out.print(" ");
                }

                somaSerie += termo;
            }

            System.out.println("\n\nSoma da série: " + somaSerie);

            teclado.close();
        }
    }