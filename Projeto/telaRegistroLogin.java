import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

// menu onde aparece os botões para login e registro
public class telaRegistroLogin extends tela {


	public telaRegistroLogin(telaRegistro tr, telaLogin tl) {
		super("Registro e Login");
		JButton btnNewButton_1 = new JButton("Logar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tl.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(10, 10, 160, 35);
		getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Registrar");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tr.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(10, 60, 160, 35);
		getContentPane().add(btnNewButton_2);
	}

}
