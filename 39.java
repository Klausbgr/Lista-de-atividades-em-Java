
 import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
  Scanner teclado = new Scanner(System.in);
    
    int alunoMaisAlto = 0, alunoMaisBaixo = 0;
            int alturaMaisAlta = Integer.MIN_VALUE, alturaMaisBaixa = Integer.MAX_VALUE;

            for (int i = 1; i <= 10; i++) {
                System.out.print("Digite o número do aluno " + i + ": ");
                int numeroAluno = teclado.nextInt();

                System.out.print("Digite a altura do aluno " + i + " (em centímetros): ");
                int alturaAluno = teclado.nextInt();

                if (alturaAluno > alturaMaisAlta) {
                    alturaMaisAlta = alturaAluno;
                    alunoMaisAlto = numeroAluno;
                }

                if (alturaAluno < alturaMaisBaixa) {
                    alturaMaisBaixa = alturaAluno;
                    alunoMaisBaixo = numeroAluno;
                }
            }

            System.out.println("O aluno mais alto é o número " + alunoMaisAlto + " com " + alturaMaisAlta + " centímetros.");
            System.out.println("O aluno mais baixo é o número " + alunoMaisBaixo + " com " + alturaMaisBaixa + " centímetros.");
        }
    }