import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String num = in.readLine();
        int N = Integer.parseInt(num);
        String[] S;
        while (N-- > 0) {                                       //condiçao de parada do programa       
            S = in.readLine().split(" ");                        //o 'split' separa a String em substrings quando encontra um espaço entre elas.   
            //O vetor 'S' recebe as substrings  

            Arrays.sort(S, new Comparator<String>() {           //Arrays.sort faz a ordenação, por padrao em ordem alfabetica para Strings
                @Override
                public int compare(String p, String s) {       //método Comparator, ele comparara as duas strings passada e retorna um inteiro negativo, 
                    return s.length() - p.length();            //ou 0 ou um inteiro positivo caso, o primeiro objeto(p) seja maior q o segundo(s); 
                }
            });
            for (int j = 0; j < S.length; j++) {                   //Exibição do array
                if (j == 0) {
                    System.out.print(S[j]);
                } else {
                    System.out.print(" " + S[j]);
                }
            }
            System.out.println("");
        }

    }
}
