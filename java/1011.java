import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner entrada = new Scanner(System.in);
		
    		double raio = entrada.nextDouble();
    		double valorPi = 3.14159;
    		double calculoVolume = (4.0 / 3) * valorPi * (raio * raio * raio);
    		
    		System.out.printf("VOLUME = %.3f\n", calculoVolume);
    		
    
    		entrada.close();
    }
}
