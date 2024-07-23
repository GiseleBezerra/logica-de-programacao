import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner entrada = new Scanner(System.in);
		
        int A = entrada.nextInt();
        int B = entrada.nextInt();
        int C = entrada.nextInt();
        int D = entrada.nextInt();
        
        if(B > C && D > A) {
          if(C + D > A + B) {
            if(C > 0 && D > 0) {
              if(A % 2 == 0) {
                System.out.println("Valores aceitos");
              } else {
                System.out.println("Valores nao aceitos");
              }
            } else {
              System.out.println("Valores nao aceitos");
            }
            
          } else {
            System.out.println("Valores nao aceitos");
          }
        } else {
          System.out.println("Valores nao aceitos");
        }
        
        entrada.close();
 
    }
}
