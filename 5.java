
 import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
  Scanner teclado = new Scanner(System.in);

  String continuar;
  do {
    int populacaoA, populacaoB;
    double taxaCrescimentoA, taxaCrescimentoB;

    do {
      System.out.print("Digite a população do país A: ");
      populacaoA = teclado.nextInt();
    } while (populacaoA <= 0);

    do {
      System.out.print("Digite a população do país B: ");
      populacaoB = teclado.nextInt();
    } while (populacaoB <= 0);
    
    do {
      System.out.print("Digite a taxa de crescimento do país A: ");
      taxaCrescimentoA = teclado.nextDouble();  
    } while (taxaCrescimentoA <= 0);

    do {
      System.out.print("Digite a taxa de crescimento do país B: ");
      taxaCrescimentoB = teclado.nextDouble();
    } while (taxaCrescimentoB <= 0);

    taxaCrescimentoA /= 100;
    taxaCrescimentoB /= 100;

    int anos = 0;
    while (populacaoA <= populacaoB) {
      populacaoA *=(1 + taxaCrescimentoA);
      populacaoB *=(1 + taxaCrescimentoB);
      anos++;
    }

    System.out.println("Serão necessários " + anos + " anos para que a população do país A ultrapasse ou iguale a população do país B.");

    System.out.print("Deseja realizar outra comparação? (S/N): ");
    continuar = teclado.next();
  } while (continuar.equalsIgnoreCase("S"));
    
    teclado.close();
  }
}