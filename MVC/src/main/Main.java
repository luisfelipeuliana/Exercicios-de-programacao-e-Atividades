package main;

import persistence.PessoaDao;
import control.ValidaPessoa;
import entily.Pessoa;


public class Main {
	public static void main(String[] args) {
		InputPessoa LerDadosPessoa = new InputPessoa();//leitura dos dados no teclado
		ValidaPessoa vp = new ValidaPessoa();//valida os dados da pessoa
		PessoaDao pdao = new PessoaDao();//classe dados
		
		try{
		int codigo = LerDadosPessoa.lerCodigo();
		String name= LerDadosPessoa.lerNome();
		String email = LerDadosPessoa.lerEmail();
		
			if(vp.isNome(name)&& vp.isEmail(email)){//valindando o nome e email
				Pessoa p = new Pessoa();//setando a classe e inserindo valores
				p.setIdPessoa(codigo);
				p.setEmail(email);
				p.setNome(name);
				pdao.create(p);//grava no banco de dados
				
				for(Pessoa pAux: pdao.findPessoaDB()){
					System.out.println(pAux.toString());//lista todos dados do bando de dados na tabela
				}
			}	
			else
			{
			System.out.println("nome ou email incorreto");
			}
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}
