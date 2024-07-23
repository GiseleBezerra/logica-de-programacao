import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
 
      Scanner entrada = new Scanner(System.in);
      
      int idadeDias = entrada.nextInt();
      
      System.out.printf("%d ano(s)\n", idadeDias/365);
      idadeDias %= 365;
      
      System.out.printf("%d mes(es)\n", idadeDias/30);
      idadeDias %= 30;
      
      System.out.printf("%d dia(s)\n", idadeDias);
      
      entrada.close();
 
    }
}
