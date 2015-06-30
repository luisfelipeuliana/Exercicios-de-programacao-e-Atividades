package control;
import java.util.regex.Matcher;
//pacote de validação regex
import java.util.regex.Pattern;

import entily.Pessoa;

public class ValidaPessoa {
	Pattern p;
	Matcher m;
	
	public boolean isNome(String nome){
		p = Pattern.compile("[A-Za-z]{3,35}");
		m = p.matcher(nome);
		return m.matches();
	}
	public boolean isEmail(String email){
		p = Pattern.compile(".+@.+\\.[a-z]+");
		m = p.matcher(email);
		return m.matches();
	}
	public static void main(String args[]){
		System.out.println("teste");
	}
}
