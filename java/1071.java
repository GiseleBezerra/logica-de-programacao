import java.io.IOException;
import java.util.Scanner; 

public class Main {

  public static void main(String[] args) throws IOException {

      Scanner entrada = new Scanner(System.in);
      int X = entrada.nextInt();
      int Y = entrada.nextInt();
      int soma = 0;
      
      if(X > Y) {
        for(int i = Y; i < X; i++) {
          if(i % 2 != 0 && i != Y) {
            soma += i;
          }
        }
      }
      else {
        for (int i = Y + 1; i < X; i++) {
          if (i % 2 != 0) {
            soma += 1;
          }
        }
      }
      System.out.println(soma);
      
      entrada.close();

  }

}
