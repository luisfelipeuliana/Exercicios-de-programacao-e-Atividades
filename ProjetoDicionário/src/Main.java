import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

// implementa SortedSet ele insere elementos ordenados automaticamente
//e tambem ignora os valores repetidos
public class Main {
	
	TreeSet<String> palavras = new TreeSet<>();

	public static void main(String args[]) {
		
		Main dicionario = new Main();
		dicionario.addPalavras("eu");
		dicionario.addPalavras("eu");
		dicionario.addPalavras("para");
		dicionario.addPalavras("ganhar");
		dicionario.addPalavras("1");
		dicionario.addPalavras("1");
		dicionario.addPalavras("kkkkkkkk");
		System.out.println(dicionario.procurarTermo("ponto"));
		System.out.println("listando todos termos");
		dicionario.listarTodosTermos();

	}

	public Main() {
		super();
	}

	public Main(TreeSet<String> palavras) {
		super();
		this.palavras = palavras;
	}

	public TreeSet<String> getPalavras() {
		return palavras;
	}

	public void addPalavras(String palavras) {
		this.palavras.add(palavras);
	}

	public String procurarTermo(String termo) {
		if (this.palavras.contains(termo)) {
			return "Termo encontrado";
		} else {
			return "termo nao encontrado";
		}

	}

	public void listarTodosTermos() {
		Iterator it = palavras.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
