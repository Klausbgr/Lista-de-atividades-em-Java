
 import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
  Scanner teclado = new Scanner(System.in);
    
    int codigoMaisAlto = 0, codigoMaisBaixo = 0, codigoMaisGordo = 0, codigoMaisMagro = 0;
            double alturaMaisAlto = Double.MIN_VALUE, alturaMaisBaixo = Double.MAX_VALUE;
            double pesoMaisGordo = Double.MIN_VALUE, pesoMaisMagro = Double.MAX_VALUE;
            double somaAlturas = 0, somaPesos = 0;
            int quantidadeClientes = 0;

            System.out.println("Digite o código, a altura e o peso dos clientes (digite 0 para encerrar):");

            while (true) {
                System.out.print("Código: ");
                int codigo = teclado.nextInt();

                if (codigo == 0) {
                    break;
                }

                System.out.print("Altura (m): ");
                double altura = teclado.nextDouble();

                System.out.print("Peso (kg): ");
                double peso = teclado.nextDouble();

                somaAlturas += altura;
                somaPesos += peso;
                quantidadeClientes++;

                if (altura > alturaMaisAlto) {
                    alturaMaisAlto = altura;
                    codigoMaisAlto = codigo;
                }

                if (altura < alturaMaisBaixo) {
                    alturaMaisBaixo = altura;
                    codigoMaisBaixo = codigo;
                }

                if (peso > pesoMaisGordo) {
                    pesoMaisGordo = peso;
                    codigoMaisGordo = codigo;
                }

                if (peso < pesoMaisMagro) {
                    pesoMaisMagro = peso;
                    codigoMaisMagro = codigo;
                }
            }

            if (quantidadeClientes > 0) {
                double mediaAlturas = somaAlturas / quantidadeClientes;
                double mediaPesos = somaPesos / quantidadeClientes;

                System.out.println("Cliente mais alto - Código: " + codigoMaisAlto + ", Altura: " + alturaMaisAlto + "m");
                System.out.println("Cliente mais baixo - Código: " + codigoMaisBaixo + ", Altura: " + alturaMaisBaixo + "m");
                System.out.println("Cliente mais gordo - Código: " + codigoMaisGordo + ", Peso: " + pesoMaisGordo + "kg");
                System.out.println("Cliente mais magro - Código: " + codigoMaisMagro + ", Peso: " + pesoMaisMagro + "kg");
                System.out.println("Média das alturas: " + mediaAlturas + "m");
                System.out.println("Média dos pesos: " + mediaPesos + "kg");
            } else {
                System.out.println("Nenhum cliente cadastrado.");
            }
        }
    }