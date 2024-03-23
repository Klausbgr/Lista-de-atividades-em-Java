
 import java.awt.List;
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
  Scanner teclado = new Scanner(System.in);
          
      while (true) {
                System.out.print("Nome do atleta (ou deixe em branco para encerrar): ");
                String nomeAtleta = teclado.nextLine();
                }

                for (int i = 1; i <= 5; i++) {
                    System.out.print("Digite a distância alcançada no " + i + "º salto (em metros): ");
                    double salto = Double.parseDouble(teclado.nextLine());
                }

     
                double melhorSalto = 
                double piorSalto = 
                for (double salto : saltos) {
                    if (salto > melhorSalto) {
                        melhorSalto = salto;
                    }
                    if (salto < piorSalto) {
                        piorSalto = salto;
                    }
                }

              
                double somaSaltos = 0;
                for (double salto : saltos) {
                    somaSaltos += salto;
                }
                double mediaSaltos = (somaSaltos - melhorSalto - piorSalto) / 3;

            
                System.out.println("Resultado final:");
                System.out.println("Atleta: " + nomeAtleta);
                System.out.println("Melhor salto: " + melhorSalto + " m");
                System.out.println("Pior salto: " + piorSalto + " m");
                System.out.println("Média dos demais saltos: " + mediaSaltos + " m\n");
            }

            teclado.close();
        }
    }