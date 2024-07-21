import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner entrada = new Scanner(System.in);
		
    		double A = entrada.nextDouble();
    		double B = entrada.nextDouble();
    		double C = entrada.nextDouble();
    		
    		double triangulo = (A * C) / 2;
    		double areaCirculoRaio = 3.14159 * (C * C); 
    		double areaTrapezio = ((A + B) * C) / 2;
    		double areaQuadrado = B * B;
    		double areaRetangulo = A * B;
    		
    		
    		System.out.printf("TRIANGULO: %.3f\n", triangulo);
    		System.out.printf("CIRCULO: %.3f\n", areaCirculoRaio);
    		System.out.printf("TRAPEZIO: %.3f\n", areaTrapezio);
    		System.out.printf("QUADRADO: %.3f\n", areaQuadrado);
    		System.out.printf("RETANGULO: %.3f\n", areaRetangulo);
    		
    		entrada.close();        
 
    }
}
