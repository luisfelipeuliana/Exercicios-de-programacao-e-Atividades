import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import dominio.Conta;

public class Cadastro {
	private List<Conta> listaConta = new ArrayList<>(5);

	public static void main(String Args[]) throws Exception {

	}

	public void inserir(int num, int ag, String tc) throws Exception {

		for (Conta lconta : listaConta) {
			if (lconta.getNumero() == num && lconta.getAgencia() == ag) {
				JOptionPane.showMessageDialog(null, "ocorreu uma Exeption");
				throw new ExcecaoDadoInvalido();
			}
		}
		if (listaConta.size() >= 4) {
			throw new Exception();
		}
		Conta conta = new Conta();
		conta.setNumero(num);
		conta.setAgencia(ag);
		conta.setTipoConta(tc);
		listaConta.add(conta);
	}

	public List<Conta> getListaConta() {
		return listaConta;
	}

	public void setListaConta(List<Conta> listaConta) {
		this.listaConta = listaConta;
	}

}