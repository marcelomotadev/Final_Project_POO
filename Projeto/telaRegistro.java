
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.event.ActionEvent;



public class telaRegistro extends tela {
	private String nome;
	private String email;
	private JTextField tfNome;
	private JTextField tfEmail;

	public telaRegistro(ArrayList<Cliente> clientes) {
		super("Registro");
		getContentPane().setLayout(null);
		geraBtVoltar();
		
		JLabel lblNomedeUsuario = new JLabel("Nome de usuario");
		lblNomedeUsuario.setBounds(10, 11, 194, 22);
		getContentPane().add(lblNomedeUsuario);
		
		tfNome = new JTextField();
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
		
		tfEmail = new JTextField();
		tfEmail.setBounds(10, 119, 290, 20);
		getContentPane().add(tfEmail);
		tfEmail.setColumns(10);
		
		
		JLabel lbMsgEmail = new JLabel("");
		lbMsgEmail.setForeground(Color.RED);
		lbMsgEmail.setBackground(Color.WHITE);
		lbMsgEmail.setBounds(10, 150, 290, 14);
		getContentPane().add(lbMsgEmail);
		
		JButton btnNewButton = new JButton("Confirmar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nome = tfNome.getText();
				email = tfEmail.getText();
				lbMsgNome.setText("");
				if (nome.trim().equals("")) {
					lbMsgNome.setText("Preencha o nome de usuario");
				}
				if (email.trim().equals("")) {
					lbMsgEmail.setText("Preencha o campo de email");
				}
				else if (jaRegistrado(clientes, email)) {
					lbMsgEmail.setText("Email já cadastrado");
				}
				else {
					// coloca os dados do usário no sistema
					clientes.add(new Cliente(nome, email));
					// deixa os lbls e tf vazios
					tfNome.setText("");
					tfEmail.setText("");
					lbMsgNome.setText("");
					lbMsgEmail.setText("");
					setVisible(false);
					
				}

				
			}
		});
		btnNewButton.setBounds(10, 184, 136, 23);
		getContentPane().add(btnNewButton);
		

		
	
	}
	

	

	
	private Boolean jaRegistrado(ArrayList<Cliente> clientes, String email) { // checa se o email do usuario já está registrado no sistema
		for(Cliente cli : clientes) {
			if (cli.getEmail().equals(email.trim())) {
				return true;
			}
		}
		return false;
	}
}
