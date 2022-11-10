import java.util.ArrayList;
public class Feed{
  private ArrayList<Restaurante> restaurantes;
  private ArrayList<Cliente> clientes;
  private Cliente clienteAtual;
  private Carrinho carrinhoAtual;


  public Feed() {    
    restaurantes = new ArrayList();
    clientes = new ArrayList();
    carrinhoAtual = new Carrinho();
    clienteAtual = new Cliente("marcelo", 0, "marcelo");
  
    clientes.add(clienteAtual);

    criaRestaurantes();
    criaCarrinho();
  }

  
  public void criaRestaurantes() {
	  Restaurante silvaLanches, hamburgueria, pizzaPalace;
	  Item coxinha, pastel, xbacon, xfrango, pizzaMedia;
	  // Cria restaurantes
	  silvaLanches = new Restaurante("churrascaria silva", "uma churrascaria de grande variedade de carnes");
	  hamburgueria = new Restaurante("hamburgueria leste", "hamburgueria de qualidade");
	  pizzaPalace = new Restaurante("Sorveteria sabores", "explosao de sabores");
	  // adiciona a lista de restaurantes
	  restaurantes.add(silvaLanches);
	  restaurantes.add(hamburgueria);
	  restaurantes.add(pizzaPalace);
	  // Cria os items
	  coxinha = new Comida("coxinha", "coxinha de frango", (float) 3.50);
	  pastel = new Comida("pastel", "pastel de diversos sabores", 4);
	  xbacon = new Comida("xbacon", "hamburguer com carne, bacon e queijo", 12);
	  xfrango = new Comida("xfrango", "hamburguer com carne, frango e queijo" , 12);
	  pizzaMedia = new Comida("Pizza Media", "pizza de tamanho medio", 20);
	  // adiciona os itens aos restaurantes
	  silvaLanches.addItem(coxinha);
	  silvaLanches.addItem(pastel);
	  hamburgueria.addItem(xbacon);
	  hamburgueria.addItem(xfrango);
	  pizzaPalace.addItem(pizzaMedia);
	
  }
  
  public void criaCarrinho(){
		 Item coxinha, pastel, xbacon, xfrango, pizzaMedia;
		 
		 coxinha = new Comida("coxinha", "coxinha de frango", (float) 3.50);
		 pastel = new Comida("pastel", "pastel de diversos sabores", 4);
		 xbacon = new Comida("xbacon", "hamburguer com carne, bacon e queijo", 12);
		 xfrango = new Comida("xfrango", "hamburguer com carne, frango e queijo" , 12);
		 pizzaMedia = new Comida("Pizza Media", "pizza de tamanho medio", 20);
		 
		 carrinhoAtual.addCarrinho(pizzaMedia);
		 carrinhoAtual.addCarrinho(pastel);
		 carrinhoAtual.addCarrinho(coxinha);
		 carrinhoAtual.addCarrinho(xfrango);
		 carrinhoAtual.addCarrinho(xbacon);
		 carrinhoAtual.addCarrinho(pizzaMedia);
		 carrinhoAtual.addCarrinho(pizzaMedia);
		 carrinhoAtual.addCarrinho(pizzaMedia);
		 carrinhoAtual.addCarrinho(pizzaMedia);
		 carrinhoAtual.addAddress("1");
		 carrinhoAtual.addContact("1");
		 
		 
	 }
  
  public void addRestaurante(Restaurante res) {
    restaurantes.add(res);
  }

  public void removeRestaurante(Restaurante res) {
    try {
      restaurantes.remove(res);
    } catch(Exception e) {
      System.out.println("erro, o valor da entrada nao consta na lista de restaurantes");
    }
  }
  
  public void setClienteAtual(Cliente cliente) {
	  clienteAtual = cliente;
  }
  
  public Cliente getClienteAtual() {
	  return clienteAtual;
  }

  public ArrayList<Restaurante> getRestaurantes() {
	  return restaurantes;
  }
  
  public ArrayList<Cliente> getClientes() {
	  return clientes;
  }
  public Carrinho getCarrinho(){
		 return carrinhoAtual;
  } 
}

