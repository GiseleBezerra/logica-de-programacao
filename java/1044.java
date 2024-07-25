import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner entrada = new Scanner(System.in);
        
        int A = entrada.nextInt();
        int B = entrada.nextInt();
        
        if(A > B) {
          if(A % B == 0) {
            System.out.println("Sao Multiplos");
          }
          else {
            System.out.println("Nao sao Multiplos");
          }
        }
        else {
          if(B % A == 0) {
            System.out.println("Sao Multiplos");
          }
          else {
            System.out.println("Nao sao Multiplos");
          }
        }
      
        entrada.close();
		
	}
}
