package Aula2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MinhaPrimeiraJanela2 {

	private JFrame janela; // janela
	private JButton botaoLimpa; // botão
	final JTextField campoTexto = new JTextField(10); // texto
	private JPanel painelPrincipal;

	public MinhaPrimeiraJanela2() {
	}

	public void montaTela() {
		preparaJanela();
		preparaBotaoLimpar();
		preencheCampoTexto();
		preparaPainelPrincipal();
		mostraJanela();
		preparaBotaoSair();
	}

	private void mostraJanela() {// método para exibir a janela, com tamanho e
									// posição
		janela.pack();
		janela.setSize(540, 540);
		janela.setVisible(true);

	}

	private void preparaBotaoLimpar() {
		botaoLimpa = new JButton("Limpa");
		// Quando o usuário clicar no botao, limpa o campo de texto
		botaoLimpa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				campoTexto.setText("");
			}
		});

	}

	private void preencheCampoTexto() {
		campoTexto.setText("Java");
	}

	private void preparaPainelPrincipal() {
		painelPrincipal = new JPanel();
		
		//janela.add(painelPrincipal);
		//JPanel painel = new JPanel(); // adiciona componentes
		painelPrincipal.add(botaoLimpa);
		painelPrincipal.add(campoTexto);
		janela.getContentPane().add(painelPrincipal);

	}

	private void preparaJanela() {
		janela = new JFrame("Primeira Janela Simples");
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	
	private void preparaBotaoSair() {
		  JButton botaoSair = new JButton("Sair");
		  botaoSair.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		      System.exit(0);
		    }
		  });
		  painelPrincipal.add(botaoSair);
		}

	public static void main(String[] args) {
		new MinhaPrimeiraJanela2().montaTela();
	}

}