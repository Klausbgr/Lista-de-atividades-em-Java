
 import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
  Scanner teclado = new Scanner(System.in);
    
    double somaTemperaturas = 0;
            double menorTemperatura = Double.MAX_VALUE;
            double maiorTemperatura = Double.MIN_VALUE;
            int quantidadeTemperaturas = 0;

            System.out.println("Digite as temperaturas (digite 0 para finalizar):");

            while (true) {
                System.out.print("Temperatura: ");
                double temperatura = teclado.nextDouble();

                if (temperatura == 0) {
                    break;
                }

                somaTemperaturas += temperatura;
                quantidadeTemperaturas++;

                if (temperatura < menorTemperatura) {
                    menorTemperatura = temperatura;
                }

                if (temperatura > maiorTemperatura) {
                    maiorTemperatura = temperatura;
                }
            }

            if (quantidadeTemperaturas == 0) {
                System.out.println("Nenhuma temperatura foi inserida.");
            } else {
                double mediaTemperaturas = somaTemperaturas / quantidadeTemperaturas;

                System.out.println("Menor temperatura: " + menorTemperatura);
                System.out.println("Maior temperatura: " + maiorTemperatura);
                System.out.println("Média das temperaturas: " + mediaTemperaturas);
            }
        }
    }