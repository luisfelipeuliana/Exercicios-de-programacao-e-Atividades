import java.awt.HeadlessException;

import javax.swing.JOptionPane;


public class AulaTRY {
		public static void main(String args[]) throws HeadlessException, ExecaoDivisaoPorZero{
			double n1, n2;
			String aux=JOptionPane.showInputDialog(null,"Informe um valor Inteiro");
			try {
				n1=Double.parseDouble(aux);
				aux=JOptionPane.showInputDialog(null, "digite outro valor");
				n2=Double.parseDouble(aux);
				AulaTRY aula = new AulaTRY();
				JOptionPane.showMessageDialog(null, "Produto "+(n1*n2));
				JOptionPane.showMessageDialog(null, "Divisão "+aula.calculaDivisao(n1, n2));
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "erro na entrada de dados");
			}
			finally{
				JOptionPane.showMessageDialog(null, "Final de execução");
			}
		}

		
		public double calculaDivisao(double a, double b)throws ExecaoDivisaoPorZero{
			if(b==0){
				throw new ExecaoDivisaoPorZero();
			}
			return a / b ;
		}
}
