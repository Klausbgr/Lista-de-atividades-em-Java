
 import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
  Scanner teclado = new Scanner(System.in);
    
       System.out.println("Digite o gabarito da prova (respostas separadas por espaço):");
            String gabarito = teclado.nextLine();
            String[] gabarito1 = gabarito.split(" ");

          
            int totalAlunos = 0;
            int maiorAcerto = 0;
            int menorAcerto = 10;
            int totalAcertosTurma = 0;

           
            while (true) {
                totalAlunos++;
                int acertos = 0;

                System.out.println("Digite as respostas do aluno (respostas separadas por espaço):");
                String respostasAluno = teclado.nextLine();
                String[] respostas = respostasAluno.split(" ");

                for (int i = 0; i < gabarito1.length; i++) {
                    if (gabarito1[i].equalsIgnoreCase(respostas[i])) {
                        acertos++;
                    }
                }

       
                if (acertos > maiorAcerto) {
                    maiorAcerto = acertos;
                }
                if (acertos < menorAcerto) {
                    menorAcerto = acertos;
                }
                totalAcertosTurma += acertos;

 
                System.out.println("Outro aluno vai utilizar o sistema? (s/n)");
                String resposta = teclado.nextLine();
                if (!resposta.equalsIgnoreCase("s")) {
                    break;
                }
            }


            double mediaNotasTurma = (double) totalAcertosTurma / totalAlunos;

          
            System.out.println("Resultados:");
            System.out.println("Maior acerto: " + maiorAcerto);
            System.out.println("Menor acerto: " + menorAcerto);
            System.out.println("Total de alunos que utilizaram o sistema: " + totalAlunos);
            System.out.println("Média das notas da turma: " + mediaNotasTurma);

            teclado.close();
        }
    }