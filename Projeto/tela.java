
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import java.awt.Color;

public class tela extends JFrame {

	protected JPanel contentPane;
	protected JButton btVoltar;

	public tela(String titulo) {
    // caracteristicas gerais para todas as telas
		setBackground(new Color(139, 0, 0));
		setForeground(new Color(240, 230, 140));
		setTitle(titulo);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 0, 720, 720);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(250, 128, 114));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane); 
		contentPane.setLayout(null);
	}
	
	protected void geraBtVoltar() {
		btVoltar = new JButton("Voltar");
		btVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btVoltar.setBounds(400, 20, 89, 23);
		getContentPane().add(btVoltar);
	}
	



}
