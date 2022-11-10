import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.event.ActionEvent;



public class telaRegistro extends tela {
	private int idAtual;
	private String nome;
	private String email;
	private JTextField tfNome;
	private JTextField tfEmail;



	/**
	 * Launch the application.

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					telaRegistro frame = new telaRegistro(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	*/

	/**
	 * Create the frame.
	 */
	public telaRegistro(ArrayList<Cliente> clientes) {
		super("");
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
				int id = idAtual;
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
					idAtual ++;
					clientes.add(new Cliente(nome, id, email));
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
	

	

	
	private Boolean jaRegistrado(ArrayList<Cliente> clientes, String email) {
		for(Cliente cli : clientes) {
			if (cli.getEmail().equals(nome.trim())) {
				return true;
			}
		}
		return false;
	}
}
