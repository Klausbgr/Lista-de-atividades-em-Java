
 import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
  Scanner teclado = new Scanner(System.in);
    
    int codigoCidadeMaisAcidentes = 0, codigoCidadeMenosAcidentes = 0;
            int maiorIndiceAcidentes = Integer.MIN_VALUE, menorIndiceAcidentes = Integer.MAX_VALUE;
            int totalVeiculos = 0, totalCidadesMenosVeiculos = 0;
            int totalAcidentes = 0, totalAcidentesCidadesMenosVeiculos = 0;

            for (int i = 1; i <= 5; i++) {
                System.out.println("Cidade " + i);
                System.out.print("Código da cidade: ");
                int codigoCidade = teclado.nextInt();

                System.out.print("Número de veículos de passeio em 1999: ");
                int veiculos = teclado.nextInt();
                totalVeiculos += veiculos;

                System.out.print("Número de acidentes de trânsito com vítimas em 1999: ");
                int acidentes = teclado.nextInt();
                totalAcidentes += acidentes;

                if (acidentes > maiorIndiceAcidentes) {
                    maiorIndiceAcidentes = acidentes;
                    codigoCidadeMaisAcidentes = codigoCidade;
                }

                if (acidentes < menorIndiceAcidentes) {
                    menorIndiceAcidentes = acidentes;
                    codigoCidadeMenosAcidentes = codigoCidade;
                }

                if (veiculos < 2000) {
                    totalCidadesMenosVeiculos++;
                    totalAcidentesCidadesMenosVeiculos += acidentes;
                }

                System.out.println();
            }

            double mediaVeiculos = (double) totalVeiculos / 5;
            double mediaAcidentesCidadesMenosVeiculos = totalCidadesMenosVeiculos > 0 ?
                    (double) totalAcidentesCidadesMenosVeiculos / totalCidadesMenosVeiculos : 0;

            System.out.println("Cidade com maior índice de acidentes: " + codigoCidadeMaisAcidentes +
                    ", número de acidentes: " + maiorIndiceAcidentes);
            System.out.println("Cidade com menor índice de acidentes: " + codigoCidadeMenosAcidentes +
                    ", número de acidentes: " + menorIndiceAcidentes);
            System.out.println("Média de veículos nas cinco cidades: " + mediaVeiculos);
            System.out.println("Média de acidentes de trânsito nas cidades com menos de 2.000 veículos de passeio: " +
                    mediaAcidentesCidadesMenosVeiculos);
        }
    }