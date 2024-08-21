import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
      Scanner entrada = new Scanner(System.in);
      int valor = entrada.nextInt();
      int i = 0;
      
      while (i < 6) {
        if(valor % 2 == 1) {
          System.out.println(valor);
          i++;
        }
        valor++;
      }
      entrada.close();
    }
 
}
