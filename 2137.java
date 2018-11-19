import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in)); // para que ele pare no fim do arquivo, parecido com o	Scanner.
																				
		String n = ""; // n é o numero q define, quantos registro serão guardados dentro do vetor
		int i = 0; // i usado no for
		String[] registro = new String[1005]; // array que será usado

		while ((n = input.readLine()) != null && n.length() != 0) { // while com a condição de parada
			
			int numero = Integer.parseInt(n); // passa o n de String para inteiro, para possibilitar o for

			for (i = 0; i < numero; i++) {
				registro[i] = input.readLine(); // inserção dos valores no vetor "registro".
			}
			Arrays.sort(registro, 0, numero);
			/*
			 * ordenaçao do vetor, começa a ordenar do 0 e vai até o numero lido, esse
			 * numero define a quantidade de registros que foram guardados
			 */
			for (i = 0; i < numero; i++) {
				//exibe o vetor.
				System.out.println(registro[i]);

			}
		}
	}

}
