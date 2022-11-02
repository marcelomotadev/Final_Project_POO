import java.util.ArrayList;
/**
 * Cliente
 */
public class Cliente {
  private String name; //nome cliente
  private int clientNumber; // numero de contato do cliente
  private ArrayList<String> clientFavRestaurants; // restaurantes favoritos
  private int id; //id de identificação do cliente
  private ArrayList<Compra> comprasFeitas;

  public Cliente(String nome, int telefone, int id){
    this.name = nome;
    this.clientNumber = telefone;
    clientFavRestaurants = new ArrayList<>();
    comprasFeitas = new ArrayList<>();
    this.id = id;
  }


  public String getName(){
    return name;
  }


  public int getNumber(){
    return clientNumber;
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

  public void addCompra(Compra compra){
    comprasFeitas.add(compra);
  }

  public ArrayList<Compra> totalCompras(){
    return comprasFeitas;
  }

  
}