package Aula2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
	

public class Inteface {
		public Inteface() {
		final JButton jButton = new JButton("Limpar");
		final JTextField JTextField = new JTextField(10);
		JTextField.setText("Java");
		final JFrame JFrame = new JFrame("Janela Simples");
		JFrame.setSize(300, 100);
		final JButton jButton2 = new JButton("Sair");
		JPanel jPanel = new JPanel();
		jPanel.add(jButton);
		jPanel.add(JTextField);
		JFrame.add(jPanel);
		jPanel.add(jButton2);
		
		jButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		jButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTextField.setText("");
			}
		});
		JFrame.setVisible(true);
	}
		public static void main(String args[]){
			
			new Inteface();
		}
}
