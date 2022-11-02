import java.util.ArrayList;

public class Restaurante {
  private String nome;
  private String descricao;
  private ArrayList<Item> itens;

  public Restaurante(String nome, String descricao) {
    this.nome = nome;
    this.descricao = descricao;
    itens = new ArrayList();
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

}