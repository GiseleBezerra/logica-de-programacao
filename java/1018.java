import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
      Scanner entrada = new Scanner(System.in);
  		
      int cedula = entrada.nextInt();
      
      System.out.println(cedula);
      
      System.out.printf("%d nota(s) de R$ 100,00\n", cedula/100);
      cedula %= 100;
      
      System.out.printf("%d nota(s) de R$ 50,00\n", cedula/50);
      cedula %= 50;
      
      System.out.printf("%d nota(s) de R$ 20,00\n", cedula/20);
      cedula %= 20;
      
      System.out.printf("%d nota(s) de R$ 10,00\n", cedula/10);
      cedula %= 10;
      
      System.out.printf("%d nota(s) de R$ 5,00\n", cedula/5);
      cedula %= 5;
      
      System.out.printf("%d nota(s) de R$ 2,00\n", cedula/2);
      cedula %= 2;
      
      System.out.printf("%d nota(s) de R$ 1,00\n", cedula);
      
      entrada.close();
 
    }
}
