import java.io.IOException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws IOException {

    Scanner entrada = new Scanner(System.in);
    int valoresPositivos = 0;
    double somaValoresPositivos = 0;

    for(int i = 0; i < 6; i++){
      double n = entrada.nextDouble();
      if(n > 0){
        valoresPositivos++;
        somaValoresPositivos += n;
      }
    }
    System.out.printf("%d valores positivos\n", valoresPositivos);
    System.out.printf("%.1f\n", somaValoresPositivos / valoresPositivos);
    
    entrada.close();
  }
}
