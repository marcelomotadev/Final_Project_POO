//import java.util.ArrayList;
//import javax.swing.JButton;
//import javax.swing.JLabel;
//import javax.swing.JTextField;
//import java.awt.event.ActionListener;
//import java.awt.Color;
//import java.awt.event.ActionEvent;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

public class telaPesquisaC extends JFrame {
    
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					telaPesquisaC frame = new telaPesquisaC();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public telaPesquisaC() {
		setAlwaysOnTop(true);
		setTitle("Pesquisa por item ou Restaurante");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 504, 300);
		contentPane = new JPanel();
		contentPane.setToolTipText("Pesquisa por Item ou Restaurante");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ITEM");
		lblNewLabel.setBounds(217, 50, 24, 22);
		lblNewLabel.setToolTipText("ITEM");
		contentPane.add(lblNewLabel);
		
		JComboBox ITEm = new JComboBox();
		ITEm.setBounds(247, 48, 122, 24);
		ITEm.setFont(new Font("Tahoma", Font.PLAIN, 11));
		ITEm.setModel(new DefaultComboBoxModel(new String[] {"SELECIONE", "ITEM A", "ITEM B", "ITEM C", "ITEM D", "ITEM E"}));
		ITEm.setBackground(Color.DARK_GRAY);
		ITEm.setToolTipText("ITEM");
		ITEm.setEditable(true);
		contentPane.add(ITEm);
		
		JLabel lblNewLabel_1 = new JLabel("RESTAURANTE");
		lblNewLabel_1.setBounds(10, 51, 81, 20);
		contentPane.add(lblNewLabel_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"SELECIONE", "RESTAURANTE 1", "RESTAURANTE 2", "RESTAURANTE 3", "RESTAURANTE 4", "RESTAURANTE 5"}));
		comboBox.setBounds(85, 49, 122, 25);
		comboBox.setToolTipText("RESTAURANTE");
		comboBox.setEditable(true);
		contentPane.add(comboBox);
		
		JTextPane txtpnOQueVoc = new JTextPane();
		txtpnOQueVoc.setText("O que você procura ?");
		txtpnOQueVoc.setBounds(169, 15, 175, 20);
		contentPane.add(txtpnOQueVoc);
		
		JButton btnNewButton = new JButton("Pesquisar");
		btnNewButton.setBounds(389, 50, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Voltar");
		btnNewButton_1.setBounds(389, 227, 89, 23);
		contentPane.add(btnNewButton_1);
	}
}
