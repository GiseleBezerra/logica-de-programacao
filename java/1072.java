import java.io.IOException;
import java.util.Scanner;

public class Main {

public static void main(String[] args) {
  
  Scanner entrada = new Scanner(System.in);
  int numeroEntrada = entrada.nextInt();
  int dentroDaEntrada = 0;
  int foraDaEntrada = 0;
  
  for (int i = 0; i < numeroEntrada; i++) {
    int leituraDaEntrada = entrada.nextInt();
    if (leituraDaEntrada >= 10 && leituraDaEntrada <= 20) {
      dentroDaEntrada++;
    } else {
      foraDaEntrada++;
    }
  }
  
  System.out.printf("%d in\n", dentroDaEntrada);
  System.out.printf("%d out\n", foraDaEntrada);
  
  entrada.close();
  
}

}
