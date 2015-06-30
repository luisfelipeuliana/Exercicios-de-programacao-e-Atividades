package exerVECTOR;

import java.util.Iterator;
import java.util.Vector;

public class ClassVectorConta {

	Vector<Conta> vectorContas = new Vector<>();

	public static void main(String args[]) {
		ClassVectorConta classeVectorConta = new ClassVectorConta();
		Conta c1 = new Conta();
		Conta c2 = new Conta();
		Conta c3 = new Conta();
		c1.setConta("1");
		c1.setSaldo(100);
		c2.setConta("2");
		c2.setSaldo(200);
		c3.setConta("3");
		c3.setSaldo(300);
		c1.atualizaSaldo(-50);
		classeVectorConta.addcontas(c1);
		classeVectorConta.addcontas(c2);
		classeVectorConta.addcontas(c3);

		System.out.println(classeVectorConta.saldototal());

	}

	public ClassVectorConta() {

	}

	public Vector<Conta> getVectorContas() {
		return vectorContas;
	}

	public void addcontas(Conta c) {
		vectorContas.addElement(c);
	}

	public double saldototal() {
		double saldototal = 0;
		Iterator<Conta> t1 = vectorContas.iterator();
		while (t1.hasNext()) {
			saldototal += t1.next().getSaldo();
		}
		return saldototal;
	}

}
