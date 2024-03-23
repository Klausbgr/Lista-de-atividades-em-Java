
 import java.util.Scanner;
import java.text.DecimalFormat;
public class Main {
  public static void main(String[] args) {
  Scanner teclado = new Scanner(System.in);
    
     int intervalo0a25 = 0;
            int intervalo26a50 = 0;
            int intervalo51a75 = 0;
            int intervalo76a100 = 0;

            System.out.println("Digite números positivos (digite um número negativo para parar):");

            while (true) {
                int numero = teclado.nextInt();

                if (numero < 0) {
                    break;
                } else if (numero >= 0 && numero <= 25) {
                    intervalo0a25++;
                } else if (numero >= 26 && numero <= 50) {
                    intervalo26a50++;
                } else if (numero >= 51 && numero <= 75) {
                    intervalo51a75++;
                } else if (numero >= 76 && numero <= 100) {
                    intervalo76a100++;
                }
            }

            System.out.println("Quantidade de números nos intervalos:");
            System.out.println("[0-25]: " + intervalo0a25);
            System.out.println("[26-50]: " + intervalo26a50);
            System.out.println("[51-75]: " + intervalo51a75);
            System.out.println("[76-100]: " + intervalo76a100);

            teclado.close();
        }
    }