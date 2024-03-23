import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
  Scanner teclado = new Scanner(System.in);
          
     System.out.print("Digite a quantidade de termos (N) da série: ");
            int N = teclado.nextInt();

            double soma = 0;

            for (int i = 1; i <= N; i++) {
                soma += 1.0 / i;
            }

            System.out.println("O valor de H com " + N + " termos é: " + soma);

            teclado.close();
        }
    }