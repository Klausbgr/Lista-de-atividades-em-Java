
 import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
  
    Scanner teclado = new Scanner(System.in);
    

      System.out.print("Digite o nome de usuario: ");
      String nomeUsuario = teclado.nextLine();
    
      String senha;

      do {
        System.out.print("Digite a senha: ");
        senha = teclado.nextLine();

        if (senha.equals(nomeUsuario)) {
          System.out.println("Erro: a senha não pode ser igual ao nome de usuário.");
        }
      } while (senha.equals(nomeUsuario));

      System.out.println("Cadastro realizado com sucesso!");
       
    
    teclado.close();
  }
}