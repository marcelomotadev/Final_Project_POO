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

public class telaPesquisa extends tela {
    
	public telaPesquisa() {
    super("Pesquisa");
		setAlwaysOnTop(true);
		geraBtVoltar();
		
		JLabel lblNewLabel = new JLabel("ITEM");
		lblNewLabel.setBounds(229, 50, 24, 22);
		lblNewLabel.setToolTipText("ITEM");
		contentPane.add(lblNewLabel);
		
		JComboBox ITEm = new JComboBox();
		ITEm.setBounds(257, 49, 122, 24);
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
		comboBox.setBounds(101, 49, 122, 25);
		comboBox.setToolTipText("RESTAURANTE");
		comboBox.setEditable(true);
		contentPane.add(comboBox);
		
		JButton btnNewButton = new JButton("Pesquisar");
		btnNewButton.setBounds(389, 50, 89, 23);
		contentPane.add(btnNewButton);
		

		
		JLabel lblNewLabel_2 = new JLabel("O que você está procurando ?");
		lblNewLabel_2.setBounds(157, 17, 167, 22);
		contentPane.add(lblNewLabel_2);
	}
}
