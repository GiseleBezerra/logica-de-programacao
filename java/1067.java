import java.io.IOException;
import java.util.Scanner;


public class Main {
  public static void main(String[] args) throws IOException {
    
      Scanner entrada = new Scanner(System.in);
      
      int valor = entrada.nextInt();
      
      for (int i = 0; i <= valor; i++) {	
        if (i % 2 == 1) {
          System.out.println(i);
      }
    } 
    entrada.close();
  }
}
