package Entidade;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTable;
import javax.swing.border.BevelBorder;
import javax.swing.table.DefaultTableModel;

public class Interface {

	private JFrame frame;
	private JTextField tfNome;
	private JTextField tfCPF;
	private JTextField tfEmail;
	private JTextField tfCelular;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface window = new Interface();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Interface() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.GRAY);
		frame.setBounds(100, 100, 535, 461);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panelHeader = new JPanel();
		panelHeader.setBounds(12, 12, 503, 82);
		frame.getContentPane().add(panelHeader);
		panelHeader.setLayout(null);	
		
		JLabel lblCadastroDeUsuarios = new JLabel("Cadastro de Usuarios");
		lblCadastroDeUsuarios.setFont(new Font("Courier 10 Pitch", Font.ITALIC, 20));
		lblCadastroDeUsuarios.setForeground(Color.BLUE);
		lblCadastroDeUsuarios.setBackground(Color.BLACK);
		lblCadastroDeUsuarios.setBounds(12, 0, 267, 70);
		panelHeader.add(lblCadastroDeUsuarios);
		
		
		JPanel panelBody = new JPanel();
		panelBody.setBounds(12, 97, 503, 122);
		frame.getContentPane().add(panelBody);
		panelBody.setLayout(null);
		
		
		JLabel lblNome = new JLabel("Nome :");
		lblNome.setBounds(12, 12, 70, 15);
		panelBody.add(lblNome);
		
		JLabel lblCpf = new JLabel("CPF :");
		lblCpf.setBounds(12, 39, 70, 15);
		panelBody.add(lblCpf);
		
		JLabel lblEmail = new JLabel("E-mail :");
		lblEmail.setBounds(12, 66, 70, 15);
		panelBody.add(lblEmail);
		
		JLabel lblNewLabel = new JLabel("Celular :");
		lblNewLabel.setBounds(12, 93, 70, 15);
		panelBody.add(lblNewLabel);
		
		tfNome = new JTextField();
		tfNome.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
			
			
			}
		});
		tfNome.setBounds(77, 10, 229, 19);
		panelBody.add(tfNome);
		tfNome.setColumns(10);
		
		tfCPF = new JTextField();
		tfCPF.setBounds(77, 39, 132, 19);
		panelBody.add(tfCPF);
		tfCPF.setColumns(10);

		tfEmail = new JTextField();
		tfEmail.setBounds(77, 66, 229, 19);
		panelBody.add(tfEmail);
		tfEmail.setColumns(10);
		
		tfCelular = new JTextField();
		tfCelular.setBounds(77, 91, 132, 19);
		panelBody.add(tfCelular);
		tfCelular.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 220, 503, 80);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			Pessoa pes = new Pessoa();
			pes.setNome(tfNome.getText());
			pes.setCpf(tfCPF.getText());
			pes.setEmail(tfEmail.getText());
			pes.setCelular(tfCelular.getText());
			table.setValueAt(pes.getNome(),0,0);
			table.setValueAt(pes.getCpf(), 0, 1);
			table.setValueAt(pes.getEmail(), 0, 2);
			table.setValueAt(pes.getCelular(), 0, 3);
			}
		});
		btnCadastrar.setBounds(12, 28, 117, 25);
		panel.add(btnCadastrar);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			tfNome.setText("");
			tfCPF.setText("");
			tfEmail.setText("");
			tfCelular.setText("");
			tfNome.requestFocus();
			}
		});
		btnLimpar.setBounds(182, 28, 117, 25);
		panel.add(btnLimpar);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(JOptionPane.showConfirmDialog(null, "deseja sair ?", "Alerta",JOptionPane.YES_NO_OPTION)==0)
				{
					System.exit(0);
				}
			}
		});
		btnSair.setBounds(355, 28, 117, 25);
		panel.add(btnSair);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(12, 308, 503, 113);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"Nome", "CPF", "Email", "Celular"
			}
		));
		table.setBounds(30, 12, 439, 89);
		
		panel_1.add(table);
	}
}
