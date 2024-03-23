
 import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
  Scanner teclado = new Scanner(System.in);
    
    System.out.println("Lojas Quase Dois - Tabela de preços");

      for (int i = 1; i <= 50; i++) {
          double preco = i * 1.99;
          System.out.println(i + " - R$ " + String.format("%.2f", preco));
      }
    }
    }