import java.io.IOException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws IOException {

    Scanner entrada = new Scanner(System.in);
    int valoresPares = 0;
    int valoresImpares = 0;
    int valoresPositivos = 0;
    int valoresNegativos = 0;

    for(int i = 0; i <  5; i++){
      int n = entrada.nextInt();

      if(n % 2 == 0){
        valoresPares++;
      }
      else{
        valoresImpares++;
      }

      if(n != 0){
        if(n > 0 ){
          valoresPositivos++;
        }
        else{
          valoresNegativos++;  
        }
      }
    }

    System.out.printf("%d valor(es) par(es)\n", valoresPares);
    System.out.printf("%d valor(es) impar(es)\n", valoresImpares);
    System.out.printf("%d valor(es) positivo(s)\n", valoresPositivos);
    System.out.printf("%d valor(es) negativo(s)\n", valoresNegativos);

    entrada.close();
  }
}
