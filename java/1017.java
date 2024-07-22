import java.io.IOException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws IOException {

      Scanner entrada = new Scanner(System.in);
    
      int tempoGasto = entrada.nextInt();
      int velocidade = entrada.nextInt();
      double gasto = velocidade / 12.0 * tempoGasto;
      
      System.out.printf("%.3f\n", gasto);
      
      entrada.close();

  }

}
