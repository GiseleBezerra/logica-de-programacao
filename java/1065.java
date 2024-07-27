import java.io.IOException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws IOException {

    Scanner entrada = new Scanner(System.in);
    int somaValoresPares = 0;
    
    for(int i = 0; i < 5; i++){
      int n = entrada.nextInt();

      if(n % 2 == 0){
        somaValoresPares++;
      }
    }

    System.out.printf("%d valores pares\n", somaValoresPares);
    
    entrada.close();
  }
}
