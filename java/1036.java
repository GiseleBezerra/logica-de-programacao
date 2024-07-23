import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner entrada = new Scanner(System.in);
		
        double A = entrada.nextDouble();
        double B = entrada.nextDouble();
        double C = entrada.nextDouble();
        double delta = Math.pow(B, 2) - 4 * A * C;
        double x1 = ((B * -1) + Math.sqrt(delta)) / (2 * A);
        double x2 = ((B * -1) - Math.sqrt(delta)) / (2 * A);
        
        if( A == 0 || B == 0 || delta < 0) {
          System.out.println("Impossivel calcular");
        } else {
          System.out.printf("R1 = %.5f\n", x1);
          System.out.printf("R2 = %.5f\n", x2);
        }
        
        entrada.close();
 
    }
 
}
