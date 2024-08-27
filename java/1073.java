import java.io.IOException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws IOException {

  Scanner entrada = new Scanner(System.in);
  int N = entrada.nextInt();
  
  for (int i = 2; i <= N; i += 2) {
    int calculo = (int)Math.pow(i, 2);
    System.out.printf("%d^2 = %d\n", i, calculo);
  }
  entrada.close();
  }

}
