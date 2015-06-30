package exerVECTOR;

public class Conta {
	private String conta;
	private double saldo;

	public String getConta() {
		return conta;
	}

	public void setConta(String conta) {
		this.conta = conta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void atualizaSaldo(double s){
		this.saldo = saldo + s;
	}

}
