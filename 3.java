
 import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
  
    Scanner teclado = new Scanner(System.in);
    String nome;

      do {
        System.out.print("Digite o nome (maior que 3 caracteres): ");
        nome = teclado.nextLine();
      } while (nome.length() <= 3);

     int idade;
    do {
      System.out.print("Digite a idade (entre 0 e 150): ");
      idade = teclado.nextInt();
    } while (idade < 0 || idade > 150);
       
    double salario;
    do {
      System.out.print("Digite o salário (maior que zero): ");
      salario = teclado.nextDouble();
    } while (salario <= 0);

    String sexo;
    do {
      System.out.print("Digite o sexo ('f' ou 'm'): ");
      sexo = teclado.next();
    } while (!sexo.equals("f") && !sexo.equals("m"));

    String estadoCivil;
    do {
      System.out.print("Digite o estado civil ('s', 'c', 'v', 'd'): ");
      estadoCivil = teclado.next();
    } while (!estadoCivil.equals("s") && !estadoCivil.equals("c") && !estadoCivil.equals("v") && !estadoCivil.equals("d"));

    System.out.println("Nome: " + nome);
    System.out.println("Idade: " + idade);
    System.out.println("Salário: " + salario);
    System.out.println("Sexo: " + sexo);
    System.out.println("Estado civil: " + estadoCivil);

    
    teclado.close();
  }
}