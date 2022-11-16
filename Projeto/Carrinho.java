import java.util.ArrayList;

public class Carrinho {
  private ArrayList<Item> carrinho;
  private String endereco;
  private String contato;
  private String obs;
  private String pagamento;

  public Carrinho() {
    carrinho = new ArrayList<>();

  }

  public float getValorTotal() {
    float total = 0;
    for (Item r : carrinho) {
      total += r.getPrecoQuantidade();
    }
    return total;
  }

  public void limpaCarrinho() {
    carrinho.clear();
  }

  public void addCarrinho(Item item) {
    carrinho.add(item);
  }

  public void addAddress(String address) {
    endereco = address;
  }

  public String getAddress() {
    return endereco;
  }

  public void addContact(String contact) {
    contato = contact;
  }

  public String getContact() {
    return contato;
  }

  public void addObs(String observacoes) {
    obs = observacoes;
  }

  public String getObs() {
    return obs;
  }

  public void addPayment(String payment) {
    pagamento = payment;
  }

  public String getPayment() {
    return pagamento;
  }

  public ArrayList<Item> getItens() {
    return carrinho;
  }

}
