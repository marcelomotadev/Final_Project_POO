
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class telaCarrinho extends tela {
	private JTextField addressField;
	private JTextField txtContact;
	private JTextField obsField;
	private JTextField textPayment;
	private Carrinho carrinhoTela;
	private ArrayList<JLabel> labelsAtual;
	private JLabel total;

	/**
	 * @wbp.parser.constructor
	 */
	public telaCarrinho(Feed feed) {
		super("Carrinho");
		labelsAtual = new ArrayList();

		carrinhoTela = feed.getCarrinho();

		getContentPane().setLayout(null);
		geraBtVoltar();

		JLabel lblNewLabel_2 = new JLabel("Este eh seu carrinho!");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(166, 11, 150, 33);
		getContentPane().add(lblNewLabel_2);

		JLabel lbMsgAddress = new JLabel("");
		lbMsgAddress.setForeground(UIManager.getColor("ToolBar.dockingForeground"));
		lbMsgAddress.setBounds(326, 493, 223, 14);
		getContentPane().add(lbMsgAddress);

		JLabel lbMsgContact = new JLabel("");
		lbMsgContact.setForeground(UIManager.getColor("ToolBar.dockingForeground"));
		lbMsgContact.setBounds(326, 523, 223, 14);
		getContentPane().add(lbMsgContact);

		JLabel lbMsgPayment = new JLabel("");
		lbMsgPayment.setForeground(UIManager.getColor("ToolBar.dockingForeground"));
		lbMsgPayment.setBounds(326, 556, 223, 14);
		getContentPane().add(lbMsgPayment);

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

		JLabel lblNewLabel_4 = new JLabel("Endereco:");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_4.setBounds(61, 488, 89, 25);
		getContentPane().add(lblNewLabel_4);

		addressField = new JTextField();
		addressField.setHorizontalAlignment(SwingConstants.LEFT);
		addressField.setBounds(141, 490, 175, 20);
		getContentPane().add(addressField);
		addressField.setColumns(10);

		txtContact = new JTextField();
		txtContact.setHorizontalAlignment(SwingConstants.LEFT);
		txtContact.setBounds(141, 520, 175, 20);
		getContentPane().add(txtContact);
		txtContact.setColumns(10);

		JLabel lblNewLabel_5 = new JLabel("Obs:");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_5.setBounds(61, 466, 46, 14);
		getContentPane().add(lblNewLabel_5);

		obsField = new JTextField();
		obsField.setHorizontalAlignment(SwingConstants.LEFT);
		obsField.setBounds(141, 463, 175, 20);
		getContentPane().add(obsField);
		obsField.setColumns(10);

		textPayment = new JTextField();
		textPayment.setHorizontalAlignment(SwingConstants.LEFT);
		textPayment.setColumns(10);
		textPayment.setBounds(141, 553, 175, 20);
		getContentPane().add(textPayment);

		JButton btnNewButton = new JButton("Pedir");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				carrinhoTela = feed.getCarrinho();

				carrinhoTela.addObs(obsField.getText());

				if (addressField.getText().trim().equals("")) {
					lbMsgAddress.setText("Preenchimento obrigatorio.");
				} else {
					carrinhoTela.addAddress(addressField.getText());
				}

				if (txtContact.getText().trim().equals("")) {
					lbMsgContact.setText("Preenchimento obrigatorio.");
				} else {
					carrinhoTela.addContact(txtContact.getText());
				}

				if (textPayment.getText().trim().equals("")) {
					lbMsgPayment.setText("Preenchimento obrigatorio.");
				} else {
					carrinhoTela.addPayment(textPayment.getText());
				}

				if ((addressField.getText().trim().equals("") == false) && (txtContact.getText().trim().equals("") == false)
						&& (textPayment.getText().trim().equals("") == false)) {
					telaPedido framePedido = new telaPedido(carrinhoTela);

					dispose();
					setVisible(true);

					framePedido.setVisible(true);
					removeItens();
					carrinhoTela.limpaCarrinho();
				}

			}
		});
		btnNewButton.setBounds(192, 621, 89, 23);
		getContentPane().add(btnNewButton);

		total = new JLabel("");
		total.setBounds(192, 591, 89, 14);
		getContentPane().add(total);
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

		JLabel value1 = new JLabel("R$" + Float.toString(item.getPrecoQuantidade()));
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

	public void setTotal(float n) {
		total.setText(Float.toString(n));
		total.setHorizontalAlignment(SwingConstants.CENTER);
		total.setBounds(215, 587, 46, 23);
		getContentPane().add(total);
	}
}
