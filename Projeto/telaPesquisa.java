
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class telaPesquisa extends tela {

	private JComboBox comboBox;
	private HashMap<String, Restaurante> restaurantesMap; // hashma com o nome do restaurante como chave e o restaurante como conteudo
	
	public telaPesquisa(Feed feed, telaCarrinho tc) {
		super("Pesquisa");
		geraBtVoltar();
		
		restaurantesMap = new HashMap();
		
		comboBox = new JComboBox();
		comboBox.setBounds(112, 125, 329, 22);
		getContentPane().add(comboBox);
		
		comboBox.addItem("Restaurantes");
		addNomes(feed.getRestaurantes());
		
		JButton btnNewButton = new JButton("Pesquisar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cbTexto = comboBox.getSelectedItem().toString();
				if (!cbTexto.equals("Restaurantes")) {
					
					telaRestaurante telaRes = new telaRestaurante(tc, feed, restaurantesMap.get(cbTexto));
					telaRes.setVisible(true);
				}
			}
		});
		btnNewButton.setBounds(468, 125, 89, 23);
		getContentPane().add(btnNewButton);
		
	}
	
	private void addNomes(ArrayList<Restaurante> rrts) { // adiciona os nomes à comboBox e ao hashmap
		for (Restaurante r : rrts) {
			comboBox.addItem(r.getNome());
			restaurantesMap.put(r.getNome(), r);
		}
	}
	
	private Restaurante achaRestaurante(ArrayList<Restaurante> rrts, String nome) { // acha um restaurante dado o nome do restaurante
		for (Restaurante r : rrts) {
			if (r.getNome().equals(nome)) {
				return r;
			}
		}
		return null;
	}
}
