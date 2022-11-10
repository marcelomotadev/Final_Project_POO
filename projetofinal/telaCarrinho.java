import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JOptionPane;

public class telaCarrinho extends tela {
	private JTextField addressField;
	private JTextField txtContact;
	private JTextField obsField;
	private JTextField textPayment;
	private Carrinho carrinhoTela;
	private ArrayList<JLabel> labelsAtual;

	public telaCarrinho(Feed feed) {
		super("Carrinho");
		labelsAtual = new ArrayList();

		carrinhoTela = feed.getCarrinho();

		getContentPane().setLayout(null);
		geraBtVoltar();

		JLabel lblNewLabel_2 = new JLabel("Este é seu carrinho!");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(166, 11, 150, 33);
		getContentPane().add(lblNewLabel_2);

		JButton btnNewButton = new JButton("Pedir");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				carrinhoTela = feed.getCarrinho();
				
				carrinhoTela.addAddress(addressField.getText());
				carrinhoTela.addContact(txtContact.getText());
				carrinhoTela.addObs(obsField.getText());
				carrinhoTela.addPayment(textPayment.getText());
				
				telaPedido framePedido = new telaPedido(carrinhoTela);

				framePedido.setVisible(true);
			}
		});
		btnNewButton.setBounds(192, 621, 89, 23);
		getContentPane().add(btnNewButton);

		JLabel total = new JLabel(carrinhoTela.getValorTotal(carrinhoTela.getItens()));
		total.setHorizontalAlignment(SwingConstants.CENTER);
		total.setBounds(215, 587, 46, 23);
		getContentPane().add(total);

		JLabel lblNewLabel_1_1 = new JLabel("Total:");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setBounds(141, 587, 66, 23);
		getContentPane().add(lblNewLabel_1_1);

		JLabel lblNewLabel_3 = new JLabel("Pagamento:");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3.setBounds(61, 551, 70, 25);
		getContentPane().add(lblNewLabel_3);

		JLabel lblNewLabel_1_2 = new JLabel("Contato:");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_2.setBounds(61, 518, 89, 25);
		getContentPane().add(lblNewLabel_1_2);

		JLabel lblNewLabel_4 = new JLabel("Endereço:");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_4.setBounds(61, 488, 89, 25);
		getContentPane().add(lblNewLabel_4);

		addressField = new JTextField();
		addressField.setHorizontalAlignment(SwingConstants.LEFT);
		addressField.setBounds(141, 490, 175, 20);
		getContentPane().add(addressField);
		addressField.setColumns(10);

		txtContact = new JTextField();
		txtContact.setHorizontalAlignment(SwingConstants.CENTER);
		txtContact.setBounds(141, 520, 175, 20);
		getContentPane().add(txtContact);
		txtContact.setColumns(10);

		JLabel lblNewLabel_5 = new JLabel("Obs:");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_5.setBounds(61, 466, 46, 14);
		getContentPane().add(lblNewLabel_5);

		obsField = new JTextField();
		obsField.setBounds(141, 463, 175, 20);
		getContentPane().add(obsField);
		obsField.setColumns(10);

		textPayment = new JTextField();
		textPayment.setHorizontalAlignment(SwingConstants.CENTER);
		textPayment.setColumns(10);
		textPayment.setBounds(141, 553, 175, 20);
		getContentPane().add(textPayment);

	}

	public telaCarrinho(String string) {
		super(string);
	}

	public void addItem(Item item, int altura) {
		
		JLabel product1 = new JLabel(item.getNome());
		product1.setHorizontalAlignment(SwingConstants.CENTER);
		product1.setBounds(40, altura - 9, 106, 33);		

		JLabel quant1 = new JLabel(Integer.toString(item.getQuantidadeCliente()));
		quant1.setHorizontalAlignment(SwingConstants.CENTER);
		quant1.setBounds(166, altura, 46, 14);		

		JLabel value1 = new JLabel( "R$" + Float.toString(item.getPrecoQuantidade()));
		value1.setHorizontalAlignment(SwingConstants.CENTER);
		value1.setBounds(231, altura, 46, 14);		
		
		labelsAtual.add(product1);
		labelsAtual.add(quant1);
		labelsAtual.add(value1);
		getContentPane().add(product1);
		getContentPane().add(quant1);
		getContentPane().add(value1);
	}

	public void removeItens() {
		for (JLabel lb : labelsAtual) {
			contentPane.remove(lb);
		}
	}
	
	public void addItens(ArrayList<Item> itens) {
		int altura = 67;
		for (Item r : itens) {
			addItem(r, altura);
			altura += 35;
		}
	}
}
