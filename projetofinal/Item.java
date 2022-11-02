import java.util.ArrayList;

public class Item {
  private String nome;
  private String descricao;
  private float preco;
  private ArrayList<Avaliacao> avaliacoes;

  public Item(String nome, String descricao, float preco) {
    this.nome = nome;
    this.descricao = descricao;
    this.preco = preco;
    avaliacoes = new ArrayList();
  }

  public void mudaPreco(float novoPreco) {
    preco = novoPreco;
  }

  public String getNome() {
    return nome;
  }

  public String getDescricao() {
    return descricao;
  }

  public float getPreco() {
    return preco;
  }

  public void addAvaliacao(Avaliacao av) {
    avaliacoes.add(av);
  }

  public int avaliacaoMedia() {
    int soma = 0;
    int media;
    for (Avaliacao a : avaliacoes) {
      soma += a.getEstrelas();
    }
    media = soma / avaliacoes.size();
    return media;
  }

}