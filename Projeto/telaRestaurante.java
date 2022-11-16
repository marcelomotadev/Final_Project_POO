import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

// essa classe divide a lista de itens  em cada restaurante em bebidas, comidas e combos, cada um aparecendo em uma tela 
public class telaRestaurante extends tela {

	private ArrayList<Comida> comidas;
	private ArrayList<Bebida> bebidas;
	private ArrayList<Combo> combos;
	private String pagAtual;
	private ArrayList<JLabel> labelsAtual;
	private ArrayList<JSpinner> spinnersAtual;
	private JLabel lbAvaliacao;
	private JTextField tfAvaliacao;
	private JLabel lbErroAvaliacao = new JLabel("");;

	public telaRestaurante(telaCarrinho tc, Feed feed, Restaurante res) {
		super(res.getNome());
		pagAtual = "comidas";

		comidas = new ArrayList();
		bebidas = new ArrayList();
		combos = new ArrayList();
		labelsAtual = new ArrayList();
		spinnersAtual = new ArrayList();

		JButton btComidas = new JButton("Comidas");
		JButton btBebidas = new JButton("Bebidas");
		JButton btCombos = new JButton("Combos");

		JLabel tituloAvaliacao = new JLabel("Avaliacao: ");
		tituloAvaliacao.setBounds(500, 80, 50, 30);
		getContentPane().add(tituloAvaliacao);

		lbAvaliacao = new JLabel("");
		lbAvaliacao.setBounds(551, 88, 89, 14);
		getContentPane().add(lbAvaliacao);

		setLbAvaliacao(res);
		divideItens(res.getItens());
		addComidas(comidas, "Comidas");
		geraBtVoltar();

		btComidas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (pagAtual != "comidas") {
					removeItens();
					addComidas(comidas, "Comidas");
					btComidas.setForeground(Color.LIGHT_GRAY);
					btBebidas.setForeground(Color.BLACK);
					btCombos.setForeground(Color.BLACK);
					pagAtual = "comidas";
					dispose();
					setVisible(true);
				}
			}
		});
		btComidas.setBounds(10, 22, 89, 23);
		btComidas.setForeground(Color.LIGHT_GRAY);
		getContentPane().add(btComidas);

		btBebidas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (pagAtual != "bebidas") {
					removeItens();
					addBebidas(bebidas, "Bebidas");
					btBebidas.setForeground(Color.LIGHT_GRAY);
					btComidas.setForeground(Color.BLACK);
					btCombos.setForeground(Color.BLACK);
					pagAtual = "bebidas";
					dispose();
					setVisible(true);
				}
			}
		});
		btBebidas.setBounds(109, 22, 89, 23);
		getContentPane().add(btBebidas);

		btCombos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (pagAtual != "combos") {
					removeItens();
					addCombos(combos, "Combos");
					btCombos.setForeground(Color.LIGHT_GRAY);
					btBebidas.setForeground(Color.BLACK);
					btComidas.setForeground(Color.BLACK);
					pagAtual = "combos";
					dispose();
					setVisible(true);
				}
			}
		});
		btCombos.setBounds(208, 22, 89, 23);
		getContentPane().add(btCombos);

		JButton btnNewButton = new JButton("Comprar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (Item it : res.getItens()) {
					it.setQuantidadeCliente();
					if (it.getQuantidadeCliente() > 0) {
						it.addQuantidadeCliente();
						feed.getCarrinho().addCarrinho(it);
					}
				}
				tc.setTotal(feed.getCarrinho().getValorTotal());
				tc.removeItens();
				tc.addItens(feed.getCarrinho().getItens());
				tc.setVisible(true);

			}
		});
		btnNewButton.setBounds(400, 600, 89, 23);
		getContentPane().add(btnNewButton);

		tfAvaliacao = new JTextField();
		tfAvaliacao.setBounds(490, 109, 45, 20);
		getContentPane().add(tfAvaliacao);
		tfAvaliacao.setColumns(10);

		lbErroAvaliacao.setForeground(Color.RED);
		lbErroAvaliacao.setBounds(413, 140, 264, 14);
		getContentPane().add(lbErroAvaliacao);

		JButton btAvaliacao = new JButton("Deixar Avaliacao");
		btAvaliacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String textoTf = tfAvaliacao.getText().trim();
				if (textoTf.matches("[0-9]+") && textoTf.length() > 0 && Integer.parseInt(textoTf) >= 0
						&& Integer.parseInt(textoTf) <= 5) {
					res.addAvaliacao(Integer.parseInt(textoTf));
					res.setAvaliacaoMedia();
					setLbAvaliacao(res);
					lbErroAvaliacao.setText("");
					dispose();
					setVisible(true);
				} else {
					lbErroAvaliacao.setText("Digite apenas numeros inteiros de 1 a 5");
				}

			}
		});
		btAvaliacao.setBounds(547, 108, 130, 23);
		getContentPane().add(btAvaliacao);
	}

	public void divideItens(ArrayList<Item> itens) { // divide os itens nas listas de bebidas, comidas e combos
		for (Item it : itens) {
			if (it instanceof Bebida) {
				bebidas.add((Bebida) it);
			} else if (it instanceof Comida) {
				comidas.add((Comida) it);
			} else if (it instanceof Combo) {
				combos.add((Combo) it);
			}
		}
	}

	public void addItem(Item item, int altura) { // adiciona um item a tela com labels e spinner
		JLabel lbItem = new JLabel(item.getNome());
		lbItem.setBounds(60, altura, 300, 50);
		lbItem.setFont(new Font("Nirmala UI Semilight", Font.BOLD, 14));

		JLabel lbDescricao = new JLabel(item.getDescricao());
		lbDescricao.setBounds(60, altura + 25, 600, 50);
		lbDescricao.setForeground(Color.DARK_GRAY);
		lbDescricao.setFont(new Font("Tahoma", Font.BOLD, 12));

		JLabel lbPreco = new JLabel("R$" + Float.toString(item.getPreco()));
		lbPreco.setBounds(250, altura, 300, 50);
		lbPreco.setFont(new Font("Nirmala UI Semilight", Font.BOLD, 12));
		lbPreco.setForeground(Color.BLUE);

		item.getSpinner().setBounds(300, altura + 10, 30, 20);
		contentPane.add(item.getSpinner());
		spinnersAtual.add(item.getSpinner());

		if (item instanceof Comida) {
			Comida comida = (Comida) item;
			JLabel lbSabores = new JLabel(comida.getTextSabores());
			lbSabores.setFont(new Font("Tahoma", Font.BOLD, 11));
			lbSabores.setForeground(Color.YELLOW);
			lbSabores.setBounds(60, altura + 50, 300, 50);

			contentPane.add(lbSabores);
			labelsAtual.add(lbSabores);
		} else if (item instanceof Bebida) {
			Bebida bebida = (Bebida) item;
			JLabel lbMls = new JLabel(bebida.getMlsText());
			lbMls.setFont(new Font("Tahoma", Font.BOLD, 11));
			lbMls.setForeground(Color.YELLOW);
			lbMls.setBounds(60, altura + 50, 300, 50);

			contentPane.add(lbMls);
			labelsAtual.add(lbMls);
		} else if (item instanceof Combo) {
			Combo combo = (Combo) item;
			JLabel lbqtdPessoas = new JLabel(combo.descricaoQtd());
			lbqtdPessoas.setFont(new Font("Tahoma", Font.BOLD, 11));
			lbqtdPessoas.setForeground(Color.YELLOW);
			lbqtdPessoas.setBounds(60, altura + 50, 300, 50);

			contentPane.add(lbqtdPessoas);
			labelsAtual.add(lbqtdPessoas);
		}

		labelsAtual.add(lbItem);
		labelsAtual.add(lbDescricao);
		labelsAtual.add(lbPreco);
		contentPane.add(lbItem);
		contentPane.add(lbDescricao);
		contentPane.add(lbPreco);
	}

	private void addTitulo(String titulo) {
		JLabel lbTitulo = new JLabel(titulo);
		lbTitulo.setFont(new Font("Nirmala UI Semilight", Font.BOLD, 16));
		lbTitulo.setBounds(115, 80, 169, 30);
		contentPane.add(lbTitulo);
		labelsAtual.add(lbTitulo);
	}

	public void addComidas(ArrayList<Comida> comidas, String titulo) {
		addTitulo(titulo);
		int altura = 120;
		for (Item it : comidas) {
			addItem(it, altura);
			altura += 100;
		}
	}

	public void addBebidas(ArrayList<Bebida> bebidas, String titulo) {
		addTitulo(titulo);
		int altura = 120;
		for (Item it : bebidas) {
			addItem(it, altura);
			altura += 100;
		}
	}

	public void addCombos(ArrayList<Combo> combos, String titulo) {
		addTitulo(titulo);
		int altura = 120;
		for (Item it : combos) {
			addItem(it, altura);
			altura += 100;
		}
	}

	public void removeItens() { // remove os labels da tela relacionado aos itens
		for (JLabel lb : labelsAtual) {
			contentPane.remove(lb);
		}
		for (JSpinner sp : spinnersAtual) {
			contentPane.remove(sp);
		}
	}

	public void setLbAvaliacao(Restaurante res) { // coloca o label da avaliação media do restaurante
		lbAvaliacao.setText(String.format("%.1f", res.getAvaliacaoMedia()));
		lbErroAvaliacao.setText("");
	}
}
