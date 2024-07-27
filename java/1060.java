import java.io.IOException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws IOException {

    Scanner entrada = new Scanner(System.in);
    int valores_positivos = 0;

    for(int i = 0; i < 6; i++){
      double n1 = entrada.nextDouble();
      if(n1 > 0){
        valores_positivos++;
      }
    }
    System.out.printf("%d valores positivos\n", valores_positivos);
    entrada.close();
  }
}
