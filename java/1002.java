import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner entrada = new Scanner(System.in);
		
    		double raio = entrada.nextDouble();
    		double pi = 3.14159;
    		double area = pi * (raio * raio);
    		
    		System.out.printf("A=%.4f\n", area);
    		
    		entrada.close();
        
    } 
}
