import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
 
public class Main {

    public static void main(String[] args) throws IOException {
        Stack<String> pilha = new Stack<String>();    	//inciando a pilha.
        String entrada; //variavel que representa a entrada de dados.
        
       BufferedReader input = new BufferedReader(new InputStreamReader(System.in)); //bufferedReader porque o uri precisa saber o final das entradas.
        while ((entrada=input.readLine())!= null && entrada.length()!=0) {//laço para manter o programa recebendo as entradas, desde q elas sejam diferentes de null. 
            pilha.removeAllElements();         //remove os elementos, para quando repetir o loop não tenha nada na pilha
            
            for (int i = 0; i < entrada.length(); i++) {
                if (entrada.charAt(i) == ('(')) {
                   //for para percorrer o indice, charAt procura o caracter '('.     
                	pilha.push("("); //insere '(' na pilha.
                } else if (entrada.charAt(i) == (')')) { //procura o caracter ')'. 
                    
                	if (pilha.isEmpty()) { 
                        pilha.push("x");   //Ver se a pilha está vazia, se tiver adiciona 'x' e sai do if.
                        break;
                    } else {
                        pilha.pop(); //se não estiver vazia remove um elemento
                    }
                }

            }
            if (pilha.isEmpty()) {
                System.out.println("correct"); 
            //se a pilha esta vazia entao esta correto, senão esta incorreto.
            } else {
                System.out.println("incorrect"); 

            }

        }
    }
}
