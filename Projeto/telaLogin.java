
import java.util.ArrayList;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class telaLogin extends tela {



	private String nome;
	private String email;

	
	public telaLogin(Feed feed, telaInicial tl) {
		super("Login");
		getContentPane().setLayout(null);
		geraBtVoltar();
		
		JLabel lblNomedeUsuario = new JLabel("Nome de usuario");
		lblNomedeUsuario.setBounds(10, 11, 194, 22);
		getContentPane().add(lblNomedeUsuario);
		
		JTextField tfNome = new JTextField();
		tfNome.setBounds(10, 44, 290, 20);
		getContentPane().add(tfNome);
		tfNome.setColumns(10);
		
		JLabel lbMsgNome = new JLabel("");
		lbMsgNome.setForeground(Color.RED);
		lbMsgNome.setBounds(10, 75, 290, 14);
		getContentPane().add(lbMsgNome);
		
		JLabel lbEmail = new JLabel("Email");
		lbEmail.setBounds(10, 94, 46, 14);
		getContentPane().add(lbEmail);
		
		JTextField tfEmail = new JTextField();
		tfEmail.setBounds(10, 119, 290, 20);
		getContentPane().add(tfEmail);
		tfEmail.setColumns(10);
		
		JLabel lbMsgEmail = new JLabel("");
		lbMsgEmail.setForeground(Color.RED);
		lbMsgEmail.setBounds(10, 150, 290, 14);
		getContentPane().add(lbMsgEmail);
		
		
		JButton btnNewButton = new JButton("Confirmar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nome = tfNome.getText();
				email = tfEmail.getText();
				lbMsgNome.setText("");
				lbMsgEmail.setText("");
				if (email.trim().equals("")) {
					lbMsgEmail.setText("Preencha o campo de Email");
				} else {
					lbMsgEmail.setText("");
				}
				
				if (nome.trim().equals("")) {
					lbMsgNome.setText("Preencha o campo de nome de usuario");
				} else {
					lbMsgEmail.setText("");
				}
				if (usuarioCadastrado(feed.getClientes(), email)) {
					Cliente cliente = achaCliente(feed.getClientes(), nome, email);
					if (cliente != null) {
						feed.setClienteAtual(cliente);
						tfNome.setText("");
						tfEmail.setText("");
						lbMsgNome.setText("");
						lbMsgEmail.setText("");
						setVisible(false);
						tl.setVisible(true);
					}
					else {
						lbMsgNome.setText("Nome de usuario incorreto.");
						
					}
				}
				else {
					lbMsgEmail.setText("Email nao registrado no sistema.");
				}
			}
		});
		btnNewButton.setBounds(10, 184, 136, 23);
		getContentPane().add(btnNewButton);
	}
	
	private Boolean usuarioCadastrado(ArrayList<Cliente> clientes, String email) { // checa se o email está registrado na lista de emails do sistemas
		for (Cliente cli : clientes) {
			if (cli.getEmail().equals(email)) {
				return true;
			}
		}
		return false;
	}
	
	
	private Cliente achaCliente(ArrayList<Cliente> clientes, String nome, String email) { // acha um cliente dado uma lista de clientes, o nome e o email
		for (Cliente cli : clientes) {
			if (cli.getEmail().equals(email) && cli.getName().equals(nome)) {
				return cli;
			}
		}
		return null;
	}
	


}
