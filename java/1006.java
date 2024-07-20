import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
    
        Scanner entrada = new Scanner(System.in);
    		double notaA = entrada.nextDouble();
    		double notaB = entrada.nextDouble();
    		double notaC = entrada.nextDouble();
    		double mediaNota = ((notaA * 2) + (notaB * 3) + (notaC * 5)) / 10;
    		
    		System.out.printf("MEDIA = %.1f\n", mediaNota);
    		
    		entrada.close();
        
    }
}
