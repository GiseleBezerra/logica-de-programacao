import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
       Scanner entrada = new Scanner(System.in);
		
    		int quilometro = entrada.nextInt();
    		double combustivel = entrada.nextDouble();
    		double consumoMedio = quilometro / combustivel;
    		
    		System.out.printf("%.3f km/l\n", consumoMedio);
    		
    		entrada.close();
 
    }
}
