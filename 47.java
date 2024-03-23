import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
  Scanner teclado = new Scanner(System.in);
          
      while (true) {
                System.out.print("Nome do ginasta (ou deixe em branco para encerrar): ");
                String nomeGinasta = teclado.nextLine();
                }


                for (int i = 1; i <= 7; i++) {
                    System.out.print("Nota do jurado " + i + ": ");
                    double nota = Double.parseDouble(teclado.nextLine());
                 
                }

                double somaNotas = 0;
                for (double nota : notas) {
                    somaNotas += nota;
                }
                double mediaNotas = somaNotas / notas.size();

        
                System.out.println("Resultado final:");
                System.out.println("Atleta: " + nomeGinasta);
                System.out.println("Melhor nota: " 
                System.out.println("Pior nota: "  
                System.out.printf("Média: %.2f\n\n", mediaNotas);
            }

            teclado.close();
        }
    }