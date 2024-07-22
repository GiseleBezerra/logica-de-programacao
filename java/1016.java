import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
	Scanner entrada = new Scanner(System.in);
		
	int distancia = entrada.nextInt();
	int distanciaCalculo = distancia * 2;
	
	System.out.printf("%d minutos\n", distanciaCalculo);

	entrada.close();
	    	
    }
}
