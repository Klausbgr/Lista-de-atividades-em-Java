
 import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
  Scanner teclado = new Scanner(System.in);
    
    System.out.print("Digite a quantidade de turmas: ");
            int quantidadeTurmas = teclado.nextInt();

            if (quantidadeTurmas <= 0) {
                System.out.println("Quantidade de turmas inválida.");
                return;
            }

            int totalAlunos = 0;
            for (int i = 1; i <= quantidadeTurmas; i++) {
                System.out.print("Digite a quantidade de alunos na turma " + i + ": ");
                int quantidadeAlunos = teclado.nextInt();

                if (quantidadeAlunos < 0 || quantidadeAlunos > 40) {
                    System.out.println("Quantidade de alunos inválida.");
                    return;
                }

                totalAlunos += quantidadeAlunos;
            }

            double mediaAlunosPorTurma = (double) totalAlunos / quantidadeTurmas;

            System.out.println("A média de alunos por turma é: " + mediaAlunosPorTurma);
        }
    }