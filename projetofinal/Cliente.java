import java.util.ArrayList;
/**
 * Cliente
 */
public class Cliente {
  private String name; //nome cliente
  private ArrayList<String> clientFavRestaurants; // restaurantes favoritos
  private String email; // email do usuario
  private int id; //id de identificação do cliente
  private ArrayList<Carrinho> pedidos; //histórico de pedidos

  public Cliente(String nome, int id, String email){
	this.email = email;
    this.name = nome;
    clientFavRestaurants = new ArrayList<>();
    pedidos = new ArrayList<>();
    this.id = id;
  }

  public String getEmail() {
	  return email;
  }

  public String getName(){
    return name;
  }

  public int getId(){
    return id;
  }
  
  public void addFav(String restaurant){
    clientFavRestaurants.add(restaurant);
  }

  public void removeFav(String restaurant){
    try {
      clientFavRestaurants.remove(restaurant);
    } catch(Exception e) {
      System.out.println("erro, o valor da entrada nao consta na lista de restaurante favoritos");
    }
  }
  
  public void addPedido(Carrinho pedido) {
	  pedidos.add(pedido);
  }
  
}