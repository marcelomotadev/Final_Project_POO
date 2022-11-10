


import java.util.ArrayList;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;



public class telaFeed extends tela {
	 

	
	/*
	 neste codigo os restaurantes são divididos em "blocos" com um limite n (que neste código será 7 restaurantes por pag) de restaurantes. 
	 Cada bloco aparece em uma página 
	 
	 */
	
	private ArrayList<ArrayList<Restaurante>> blocosRestaurante; // uma uma lista de blocos
	private int pagAtual = 1;
	private ArrayList<Restaurante> blocoAtual;
	private JButton btProx;
	private JButton btVolta;;
	private ArrayList<JButton> botoesAtual; // lista de botões que estão na tela no momento
	

	/**
	 * Create the frame.
	 */
	public telaFeed(Feed feed) {
		super("Feed");		
		
		blocosRestaurante = new ArrayList();
		blocoAtual = new ArrayList();
		botoesAtual = new ArrayList();
		
		criaBlocos(feed.getRestaurantes(), 7);
		blocoAtual = blocosRestaurante.get(0);
		addRestaurantes(blocoAtual);

		
		JLabel lbpagAtual = new JLabel(Integer.toString(pagAtual));
		lbpagAtual.setBounds(495, 501, 46, 14);
		getContentPane().add(lbpagAtual);
		
		btProx = new JButton("->");
		btProx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (pagAtual == 1) {
					btVolta.setForeground(Color.BLACK);
				}
				if (pagAtual == blocosRestaurante.size() - 1) {
					btProx.setForeground(Color.LIGHT_GRAY);
				}
				if (pagAtual < blocosRestaurante.size()) {
					pagAtual ++;
					lbpagAtual.setText(Integer.toString(pagAtual));
					blocoAtual = blocosRestaurante.get(pagAtual -1);
					removeRestaurantes();
					addRestaurantes(blocoAtual);
					dispose();
					setVisible(true);
					
				}

			}
		});
		btProx.setBounds(524, 467, 89, 23);
		getContentPane().add(btProx);
		
		btVolta = new JButton("<-");
		btVolta.setForeground(Color.LIGHT_GRAY);
		btVolta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (pagAtual > 1) {
					pagAtual --;
					if (pagAtual == 1) {
						btVolta.setForeground(Color.LIGHT_GRAY);
					}
					if (pagAtual < blocosRestaurante.size()) {
						btProx.setForeground(Color.BLACK);
					}
					lbpagAtual.setText(Integer.toString(pagAtual));
					blocoAtual = blocosRestaurante.get(pagAtual -1);
					removeRestaurantes();
					addRestaurantes(blocoAtual);
					dispose();
					setVisible(true);
				}
			}
		});
		btVolta.setBounds(400, 467, 89, 23);
		getContentPane().add(btVolta);
		
		geraBtVoltar();

		
	}
	
	
	private void criaBlocos(ArrayList<Restaurante> rrts, int numBtsPorTela) {  // cria os blocos dado a lista total de restaurantes e o numero de
		int blocosqtd = rrts.size() / numBtsPorTela;						   // botoes por tela
		int resto = rrts.size() % numBtsPorTela;
		while (blocosqtd > 0) {
			ArrayList<Restaurante> blocoRestaurante = new ArrayList();
			int cont = 0;
			while (cont < numBtsPorTela) {
				blocoRestaurante.add(rrts.get(0));
				rrts.remove(0);
				cont ++;
			}
			blocosRestaurante.add(blocoRestaurante);
			blocosqtd --;
		}
		if (resto > 0) {
			ArrayList<Restaurante> blocoRestaurante = new ArrayList();
			for (Restaurante r : rrts) {
				blocoRestaurante.add(r);
			}
			blocosRestaurante.add(blocoRestaurante);
		}
		blocoAtual = blocosRestaurante.get(0);
	}
	
	public void addRestaurante(Restaurante res, int altura) {
		JButton botaoRes = new JButton(res.getNome());
		botaoRes.setBounds(10, altura, 300, 50);
		contentPane.add(botaoRes);
		botoesAtual.add(botaoRes);
	}
	
	public void addRestaurantes(ArrayList<Restaurante> rrts) {
		int altura = 10;
			for (Restaurante r : rrts) {
				addRestaurante(r, altura);
				altura += 100;
			
			}
	}
	
	
	public void removeRestaurantes() {		// remove os botões ques estão na tela
		for (JButton bt : botoesAtual) {
			contentPane.remove(bt);
		}
	}
	
}
