import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {   
	
	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in)); 
    public static void main(String[] args) throws IOException {
        String numero; //dois digitos q formam a primeira linha
        int P = 0;     //posição
        while ((numero = read()) != null && numero.length() != 0) {    //ler os 2 primeiros digitos como uma, String, tambem controla a 
            List<Integer> registro = new ArrayList<>();
            String[] div = numero.split("[ ]+");                          // define q o espaço sera a condiçao para separar a string                                                                     
            int N = Integer.parseInt(div[0]);                             // N sera o valor int, formado pelo primeiro char antes do 
            int Q = Integer.parseInt(div[1]);                             // Q sera o valor int, formado pelo segundo char, depois  do 
            for (int i = 0; i < N; i++) {                                 // enquanto i for menor que o 'N' numero de habitantes, insere 
                    registro.add(readInt());
                }           
            Collections.sort(registro);                               //ordena de forma crescente e depois inverte a ordem         
            Collections.reverse(registro);          
            for (int i = 0; i < Q; i++) { 		                          
                P = readInt();                                      //ler um int relativo a posição a ser exibida
                System.out.println("" + registro.get(P - 1));       //exibe a posição menos um, do arraylist registro
            }
        }
    }
    private static String read() throws IOException {               	
    return input.readLine();
	}
	private static int readInt() throws IOException {
		return Integer.parseInt(input.readLine());
	}
}
