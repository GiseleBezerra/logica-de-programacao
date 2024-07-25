import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner entrada = new Scanner(System.in);
        
        double A = entrada.nextDouble();
        double B = entrada.nextDouble();
        double C = entrada.nextDouble();
        double[] valores = {A, B, C};
        
        Arrays.sort(valores);
        
        if(valores[2] >= valores[0] + valores[1]) {
          double area = (A + B) * C / 2;
          System.out.printf("Area = %.1f\n", area);
        }
        else {
          double perimetro = A + B + C;
          System.out.printf("Perimetro = %.1f\n", perimetro);
        }
        
        entrada.close();
 
    } 
}
