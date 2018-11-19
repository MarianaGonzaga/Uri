  import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.util.Collections;
	import java.util.LinkedList;
	import java.util.PriorityQueue;
	import java.util.Queue;
	import java.util.Stack;
	import java.util.StringTokenizer;
	public class Main {
	
		public static void main (String [] abc) throws IOException {
			BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
			String num; 
			while ((num=in.readLine())!=null) { //controla o fim de arquivo
			int N=Integer.parseInt(num);       
			
				PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder()); //iniciando uma fila de prioridade com reverseOrder, senão 
				Stack<Integer> pilha=new Stack<>();                                        // a ordençao sera a mesma da fila comum o que daria resultados 
			    Queue<Integer> fila=new LinkedList<>();                                    //iguais na hora da inserçao e remoção, demorei pra ver isso
				
				boolean P=true;  boolean F=true; boolean prioridade=true;                  //variaveis que auxiliam na definiçao do resultado     
				
				for (int i=0;i<N;i++) {                                                    // for para controlar o 'n', este define é o numero de linhas    
					
					StringTokenizer st=new StringTokenizer(in.readLine());                  
					String ope=st.nextToken();                                             //jeito que achei para q leia dois caracteres em uma mesma linha  
					int X=Integer.parseInt(st.nextToken());
					
					if (ope.equals("1")) {                                                 // se a operacao escolhida for 1, X sera inserido nas 3 estruturas      
						if (P) pilha.push(X);
						if (F) fila.offer(X);
						if (prioridade) pq.offer(X);                                       // O 'Offer' é semelhante ao add, e nesse caso nao tem diferença 
					}
			
					//Se opçao for diferente de 1, sera feita a remoção do primeiro elemento de cada estrura.
					else  {
						if (P && (pilha.size()==0 || !pilha.pop().equals(X)))       //se P que é bollean, e até aqui true, e pilha vazia ou o primeiro elemento      
							P=false;                                                // diferente de X, entao P=false, mesma condiçao para as demais estruturas      
						if (F && (fila.size()==0 || !fila.poll().equals(X)))         
							F=false;
						if (prioridade && (pq.size()==0 || !pq.poll().equals(X)))   //o 'poll' traz o primeiro elemento, removendo-o depois, se vazio retorna null
							prioridade=false;
					}
				}
				
				if (!P && !F && !prioridade)                //se nao for nenhuma delas, saida é 'impossible'
					System.out.println("impossible");                        
				else if ((P && F) || (P && prioridade) || (F && prioridade))   // se for mais que uma delas 'not sure'
					System.out.println("not sure");
				else if (P) 
					System.out.println("stack");            
				else if (F)
					System.out.println("queue");
				else if (prioridade) 
					System.out.println("priority queue");
			}
		}
	}
