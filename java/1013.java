import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
 
       Scanner entrada = new Scanner(System.in);
		
    		int A = entrada.nextInt();
    		int B = entrada.nextInt();
    		int C = entrada.nextInt();
    		
    		int maiorAB = ( A + B + Math.abs( A - B)) / 2;
    		int maiorABC = ( maiorAB + C + Math.abs( maiorAB - C)) / 2;
    		
    		System.out.printf("%d eh o maior\n", maiorABC);
    		
    		entrada.close();
      
    }
}
