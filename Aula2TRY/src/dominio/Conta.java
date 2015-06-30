package dominio;


public class Conta {
	private int numero;
	private int agencia;
	private String tipoConta;
	
	public Conta(){
		//contru
	}
	
	public Conta(int numero, int agencia, String tipoConta) {
		super();
		this.numero = numero;
		this.agencia = agencia;
		this.tipoConta = tipoConta;
	}
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero){
		this.numero = numero;
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public String getTipoConta() {
		return tipoConta;
	}
	
	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}
}
