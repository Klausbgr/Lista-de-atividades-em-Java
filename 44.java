
 import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
  Scanner teclado = new Scanner(System.in);
    
      int[] votosCandidatos = new int[4]; 
            int votosNulos = 0;
            int votosEmBranco = 0;
            int totalVotos = 0;

    
            while (true) {
                System.out.println("Digite o código do voto (ou 0 para encerrar):");
                int voto = teclado.nextInt();

                if (voto == 0) {
                    break;
                }

                switch (voto) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
          
                        votosCandidatos[voto - 1]++;
                        totalVotos++;
                        break;
                    case 5:
            
                        votosNulos++;
                        totalVotos++;
                        break;
                    case 6:
                
                        votosEmBranco++;
                        totalVotos++;
                        break;
                    default:
                
                        System.out.println("Código inválido. Por favor, digite um código válido.");
                }
            }

            System.out.println("Total de votos para cada candidato:");
            for (int i = 0; i < votosCandidatos.length; i++) {
                System.out.println("Candidato " + (i + 1) + ": " + votosCandidatos[i]);
            }

            System.out.println("Total de votos nulos: " + votosNulos);
            System.out.println("Total de votos em branco: " + votosEmBranco);

            double percentualNulos = (double) votosNulos / totalVotos * 100;
            double percentualEmBranco = (double) votosEmBranco / totalVotos * 100;
            System.out.printf("Percentagem de votos nulos sobre o total de votos: %.2f%%\n", percentualNulos);
            System.out.printf("Percentagem de votos em branco sobre o total de votos: %.2f%%\n", percentualEmBranco);

            teclado.close();
        }
    }