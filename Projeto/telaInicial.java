
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

// menu inicial com os botões de "ver restaurantes", "pesquisa", "carrinho" e "sair da conta
public class telaInicial extends tela {

	public telaInicial(telaFeed tf, telaPesquisa tp, telaCarrinho tc, Feed feed) {
		super("Tela Inicial");
		
		getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Ver restaurantes");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setVisible(true);
			}
		});
		btnNewButton.setBounds(10, 10, 160, 35);
		getContentPane().add(btnNewButton);		
		
	    JButton btnNewButton_3 = new JButton("Pesquisar");
			btnNewButton_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					tp.setVisible(true);
				}
			});
			btnNewButton_3.setBounds(10, 56, 160, 35);
			getContentPane().add(btnNewButton_3);

	    JButton btnNewButton_4 = new JButton("Carrinho");
			btnNewButton_4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

				if (feed.getCarrinho().getItens().size() == 0) {
					JOptionPane.showMessageDialog(null, "Carrinho Vazio!");
				} else {
					Carrinho carrinhoInicial = feed.getCarrinho();
					ArrayList<Item> itensConst = carrinhoInicial.getItens();
					tc.addItens(itensConst);

					tc.setVisible(true);
				}
				}
			});
			btnNewButton_4.setBounds(10, 102, 160, 35);
			getContentPane().add(btnNewButton_4);
			
			JButton btnNewButton_1 = new JButton("Sair da conta");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					feed.setClienteAtual(null);
					setVisible(false);
				}
			});
			btnNewButton_1.setBounds(10, 148, 160, 35);
			getContentPane().add(btnNewButton_1);
	}
}
