import java.util.ArrayList;

public class Carrinho {
  private ArrayList<Item> carrinho;

  public Carrinho(){
    carrinho = new ArrayList<>();
  }

  public void addCarrinho(Item item){
    carrinho.add(item);
  }

  

}
