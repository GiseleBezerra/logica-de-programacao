import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner entrada = new Scanner(System.in);
        
        double numero1 = entrada.nextDouble();
        double numero2 = entrada.nextDouble();
        double numero3 = entrada.nextDouble();
        double[] valores = {numero1, numero2, numero3};
        Arrays.sort(valores);
        
        double A = valores[2];
        double B = valores[1];
        double C = valores[0];
        
        if(A >= B + C) {
          System.out.println("NAO FORMA TRIANGULO");
        }
        else{
          if(Math.pow(A, 2) == Math.pow(B, 2) + Math.pow(C, 2)) {
            System.out.println("TRIANGULO RETANGULO");
          }
          else if(Math.pow(A, 2) > Math.pow(B, 2) + Math.pow(C, 2)) {
            System.out.println("TRIANGULO OBTUSANGULO");
          }
          else if(Math.pow(A, 2) < Math.pow(B, 2) + Math.pow(C, 2)) {
            System.out.println("TRIANGULO ACUTANGULO");
          }
          
          if(A == B && B == C) {
            System.out.println("TRIANGULO EQUILATERO");
          }
          else if(A == B || B == C || A == C) {
            System.out.println("TRIANGULO ISOSCELES");
          }
        }
		
		entrada.close();
 
    }
}
