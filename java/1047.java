import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
 
		Scanner entrada = new Scanner(System.in);
		
		int horaInicial = entrada.nextInt();
		int minutoInicial = entrada.nextInt();
		int horaFinal = entrada.nextInt();
		int minutoFinal = entrada.nextInt();
		int tempoHora;
		int tempoMinuto;

		tempoHora = horaFinal - horaInicial;
		tempoMinuto = minutoFinal - minutoInicial;
		
		if(tempoHora <= 0 && tempoMinuto <= 0) {
			tempoHora += 24;
		}
		if(tempoMinuto < 0) {
			tempoMinuto += 60;
			tempoHora--;
		}
		
		System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", tempoHora, tempoMinuto);
		
		entrada.close();
 
    }
}
