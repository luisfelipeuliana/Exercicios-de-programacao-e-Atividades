package entily;

public class Pessoa implements Comparable<Pessoa>{
	private int idPessoa;
	private String nome;
	private String email;
	
	public String toString() {
		return idPessoa + ";" + nome + ";" + email;
		}
	@Override
	public int compareTo(Pessoa o) {
		//return o.getNome().compareTo(this.nome);
		//descrecente
		return this.nome.compareTo(o.getNome());
		//ordem crescente
	}
	
	@Override
	public boolean equals(Object obj) {
		return this.nome.equals(((Pessoa)obj).getNome());
	}
	
		//construtor
		public Pessoa(){
		
		}
		public Pessoa(int idPessoa, String nome, String email) {
			super();
			this.idPessoa = idPessoa;
			this.nome = nome;
			this.email = email;
		}

		//get and set
		public int getIdPessoa() {
			return idPessoa;
		}
		public void setIdPessoa(int idPessoa) {
			this.idPessoa = idPessoa;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}	
	
		
}
