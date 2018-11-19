import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
	
//Metodos Usados:
	public class Main implements Comparable<Main>{
	public String nome;
	public String escolha;

	public Main(String nome, String escolha) {
		this.nome = nome;
		this.escolha = escolha;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEscolha() {
		return escolha;
	}
	public void setEscolha(String escolha) {
		this.escolha = escolha;
	}
		@Override
	public String toString() {
		return   nome;
			}
	@Override
	public int compareTo(Main o) {
		return nome.compareTo(o.getNome());
		}	
	 public static void main(String[] args) {
		 
		String nome;
		String escolha;
		Scanner in = new Scanner(System.in);
		List<Main> amigos = new ArrayList<Main>();
		Set<Main> amigoC = new TreeSet<Main>();
		List<Main> amigos2 = new ArrayList<Main>();
		// Lista auxiliar para armazenar quem nao quer ser amigo do Habay

		while ((nome = in.next()) != null && !nome.equals("FIM")) {
			// laço para manter o loop, se o nome for diferente de null e de "FIM", ele
			// continua
			escolha = (in.next());
			// ler a escolha

			if (escolha.equals("YES")) {
				amigos.add(new Main(nome, escolha));
				 amigoC.add(new Main(nome, escolha));
				// Se escolha for "NO", armazena o amigo no ArrayList(amigos) e no
				// TreeSet(amigosC)
			}

			if (escolha.equals("NO")) {
				amigos2.add(new Main(nome, escolha));
				// Se escolha for "NO", armazena o amigo no ArrayList(amigos2)
			}
		}

		// faz o TreeSet ser ArrayList
		 List<Main> amigo1 = new ArrayList<Main>(amigoC);
		 for (int k = 0; k < amigo1.size(); k++) {
		 System.out.println(amigo1.get(k).nome);
		 }
		
		Collections.sort(amigos2);
		for (Main elemento : amigos2) {
			System.out.println(elemento);
		}

		System.out.println("");

		// Descobrindo o amigo do Habay
		int index = 0;
		int Win = amigos.get(0).nome.length();
		for (int i = 0; i < amigos.size(); i++) {
			if (amigos.get(i).nome.length() > Win) {
				Win = amigos.get(i).nome.length();
				index = i;
			}
		}
		System.out.println("Amigo do Habay:\n" + amigos.get(index).nome);
	}
}
