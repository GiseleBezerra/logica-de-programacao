import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
      Scanner entrada = new Scanner(System.in);
      
      int codigoItem = entrada.nextInt();
      int quantidadeItem = entrada.nextInt();
      double cachorroQuente = 4.0 * quantidadeItem;
      double xSalada= 4.50 * quantidadeItem;
      double xBacon = 5.0 * quantidadeItem;
      double torradaSimples = 2.0 * quantidadeItem;
      double refrigerante = 1.50 * quantidadeItem;
      
      
      switch (codigoItem) {
        case 1:
          System.out.printf("Total: R$ %.2f\n", cachorroQuente);
          break;
          
        case 2:
          System.out.printf("Total: R$ %.2f\n", xSalada);
          break;
          
        case 3:
          System.out.printf("Total: R$ %.2f\n", xBacon);
          break;
        
        case 4:
          System.out.printf("Total: R$ %.2f\n", torradaSimples);
          break;
          
        case 5:
          System.out.printf("Total: R$ %.2f\n", refrigerante);
          break;	
      }
      
      entrada.close();
 
    }
}
