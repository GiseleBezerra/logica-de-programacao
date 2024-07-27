import java.io.IOException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws IOException {

    Scanner entrada = new Scanner(System.in);
    
    String[] dataInicio = entrada.nextLine().split(" ");
    String[] horarioInicio = entrada.nextLine().split(" : ");
    String[] diaFinal = entrada.nextLine().split(" ");
    String[] horarioFinal = entrada.nextLine().split(" : ");

    int diaInicio = Integer.parseInt(dataInicio[1]);
    int horaInicio = Integer.parseInt(horarioInicio[0]);
    int minInicio = Integer.parseInt(horarioInicio[1]);
    int segInicio = Integer.parseInt(horarioInicio[2]);

    int diaFim = Integer.parseInt(diaFinal[1]);
    int horaFim = Integer.parseInt(horarioFinal[0]);
    int minFim = Integer.parseInt(horarioFinal[1]);
    int segFim = Integer.parseInt(horarioFinal[2]);

    int dias = diaFim - diaInicio;
    int horas = horaFim - horaInicio;
    int minutos = minFim - minInicio;
    int segundos = segFim - segInicio;

    if(segundos < 0){
      segundos+=60;
      minutos--;
    }

    if(minutos < 0){
      minutos+=60;
      horas--;
    }

    if(horas < 0){
      horas+=24;
      dias--;
    }

    System.out.println(dias + " dia(s)");
    System.out.println(horas + " hora(s)");
    System.out.println(minutos + " minuto(s)");
    System.out.println(segundos + " segundo(s)");
    
    entrada.close();
  }
}
