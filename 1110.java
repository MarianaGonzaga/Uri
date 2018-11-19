import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

		String num;
       
        while ((num = input.readLine()) != null && Integer.valueOf(num) != 0) {
        	int n =Integer.parseInt(num);
						
			ArrayList<Integer> carta = new ArrayList<>();

			for (int i = 0; i < n; i++) {                  // inserindo as cartas, para que a contagem vá de 1 até n 
				carta.add(i + 1);           
			}
			int primeira = 0;                              //primeira é a carta do topo pilha, embora fale pilha eu usei a estrutura fila
		 
			w.write("Discarded cards: ");	
			while (n > 1) {                                //enquanto n for maior que 1, ou seja enquanto o numero de cartas for maior que 1  
				if (primeira > 0) {           
					w.write(", ");	                       //se ainda tiver uma carta no topo, vai colocar a virgula
				}	
				w.write(""+carta.get(primeira));		    //essas serão as cartas discartadas a serem exibidas
				primeira++;                                 //fingi uma remoção, passando a primeira para uma posiçao acima
				n--;                                        //E aqui diminui 1 do numero total de cartas
				int numero = carta.get(primeira);           //numero recebe os numeros reorganizados
				carta.add(numero);                          // e numero é adicionado a pilha de cartas 
				primeira++;                                 // acha a proxima carta
			}
			
			w.write("\n");
			w.write("Remaining card: " + carta.get(primeira) + "\n");     //get(primeira), pega a carta que sobrou e imprimi
        }
        w.close();
	}
  }
