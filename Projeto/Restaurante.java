
import java.util.ArrayList;

public class Restaurante {
 private String nome;
 private String descricao;
 private ArrayList<Item> itens;
 private ArrayList<Integer> avaliacoes;
 private float avaliacaoMedia;



  public Restaurante(String nome, String descricao){
    this.nome = nome;
    this.descricao = descricao;
    itens = new ArrayList();
    avaliacoes = new ArrayList();
    avaliacaoMedia = 0;
  }  

public void addItem(Item item) {
	itens.add(item);
}

public void removeItem(Item item) {
	try {
		itens.remove(item);
	} catch (Exception e) {
	
	}
}

public String getNome() {
	return nome;
}

public ArrayList<Item> getItens() {
	return itens;
}

public String getDescricao() {
	return descricao;
}

public void addAvaliacao(int av) {
	avaliacoes.add(av);
}

public void setAvaliacaoMedia() {
	int soma = 0;
	for (int i : avaliacoes) {
		soma += i;
	}
	avaliacaoMedia = (float) soma / avaliacoes.size();

}

public float getAvaliacaoMedia() {
	return avaliacaoMedia;
}

}