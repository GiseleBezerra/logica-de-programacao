import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
 
          Scanner entrada = new Scanner(System.in);
      
          double x = entrada.nextDouble();
          double y = entrada.nextDouble();
      
          if(x > 0 && y > 0){
            System.out.println("Q1");
          }
          else if(x < 0 && y < 0){
            System.out.println("Q3");
          }
          else if(x > 0 && y < 0){
            System.out.println("Q4");
          }
          else if(x < 0 && y > 0){
            System.out.println("Q2");
          }
          else if(x == 0 && y != 0){
            System.out.println("Eixo Y");
          }
          else if(x != 0 && y == 0){
            System.out.println("Eixo X");
          }
          else{
            System.out.println("Origem");
          }
        
          entrada.close();
 
    }
 
}
