
import java.util.ArrayList;

public class Feed {
  private ArrayList<Restaurante> restaurantes;
  private ArrayList<Cliente> clientes;
  private Cliente clienteAtual;
  private Carrinho carrinhoAtual;

  public Feed() {
    restaurantes = new ArrayList();
    clientes = new ArrayList();
    carrinhoAtual = new Carrinho();

    criaRestaurantes();
  }
  // função que cria os restaurantes assim como os itens dos restaurantes
  public void criaRestaurantes() {
		
		Restaurante silvaLanches, hamburgueria, pizzaPalace, galegoLanches, chinaInBox, casaAlema, casaDoBolo, maderoBurguer, reiDaLasanha, pastelDaJane, pizzaDaNonna;
		Comida coxinha, pastel, xbacon, xfrango, pizzaMedia, pastelGrande, pizzaGrande, pizzaDoce, lasanhaMedia, lasanhaGrande, yakisobaGrande, yakisobaMedio, boloMedio, boloGrande, maderoSuper, maderoBacon, batata, costela, obsComida, docinho;
		Bebida coca, guarana, fanta, suco, milkshake;
		Combo burguerCombo, pizzaCombo, pastelCombo, boloCombo, maderoCombo, lasanhaCombo, yakiCombo;

		// Cria restaurantes
		
		silvaLanches = new Restaurante("Churrascaria silva", "uma churrascaria de grande variedade de carnes");
		hamburgueria = new Restaurante("Hamburgueria leste", "hamburgueria de qualidade");
		pizzaDaNonna = new Restaurante("Pizza da Nonna", "A melhor pizzaria da cidade, feita com a receitada Nonna.");
		pizzaPalace = new Restaurante("Pizza Palace", "Explosao de sabores");
		galegoLanches = new Restaurante("Galego Lanches", "A Melhor Lanchonete 24 horas da cidade");
		chinaInBox = new Restaurante("China in Box", "O melhor Yakisoba da Cidade, perfeito para suas refeicoes do dia-a-dia!");
		casaAlema = new Restaurante("Casa Alema", "Tradicao de compartilhar momentos deliciosos e manter receitas vivas no paladar familiar.");
		casaDoBolo = new Restaurante("Casa do Bolo", "Os melhores Bolos voce encontra aqui");
		maderoBurguer = new Restaurante("Madero Burguer", "The Best Burguer in the World. Experimente e surpreenda-se.");
		reiDaLasanha = new Restaurante("Rei da Lasanha", "A melhor Lasanha da sua vida!");
		pastelDaJane = new Restaurante("Pastel da Jane", "Pastel de qualidade, so no Pastel da jane!");
		
		// adiciona a lista de restaurantes
		
		restaurantes.add(pizzaDaNonna);
		restaurantes.add(maderoBurguer);
		restaurantes.add(galegoLanches);
		restaurantes.add(chinaInBox);
		restaurantes.add(reiDaLasanha);
		restaurantes.add(casaAlema);
		restaurantes.add(pastelDaJane);
		restaurantes.add(casaDoBolo);
		restaurantes.add(hamburgueria);
		restaurantes.add(silvaLanches);
		restaurantes.add(pizzaPalace);
		
		// Cria os items

		// comidas
		coxinha = new Comida("Coxinha", "Coxinha de frango", (float) 3.50);
		coxinha.addVariacao("Com catupiry");
		coxinha.addVariacao("Sem catupiry");
		coxinha.addVariacao("Jaca (vegetariana)");

		pastel = new Comida("Pastel", "Pastel de diversos sabores", 4);
		pastel.addVariacao("Camarao");
		pastel.addVariacao("Carne");
		pastel.addVariacao("Frango");
		pastel.addVariacao("Misto");

		pastelGrande = new Comida("Pastel grande", "Pastel Grande de diversos sabores", 8);
		pastelGrande.addVariacao("Camarao");
		pastelGrande.addVariacao("Carne");
		pastelGrande.addVariacao("Frango");
		pastelGrande.addVariacao("Misto");

		xbacon = new Comida("Xbacon", "Hamburguer com carne, bacon e queijo", 12);

		xfrango = new Comida("Xfrango", "Hamburguer com carne, frango e queijo", 12);

		obsComida = new Comida("AVISO", "FAVOR COLOCAR O SABOR DESEJADO NA OBSERVACAO", 0);

		pizzaMedia = new Comida("Pizza Media", "Pizza de tamanho medio", 20);
		pizzaMedia.addVariacao("Calabresa");
		pizzaMedia.addVariacao("Portuguesa");
		pizzaMedia.addVariacao("Margherita");
		pizzaMedia.addVariacao("Frango");
		
		pizzaGrande = new Comida("Pizza Grande", "Pizza de tamanho grande", 36);
		pizzaGrande.addVariacao("Calabresa");
		pizzaGrande.addVariacao("Portuguesa");
		pizzaGrande.addVariacao("Margherita");
		pizzaGrande.addVariacao("Frango");
		
		pizzaDoce = new Comida("Pizza Doce", "Pizza doce", 24);
		pizzaDoce.addVariacao("Brigadeiro");
		pizzaDoce.addVariacao("Romeu e Julieta");
		pizzaDoce.addVariacao("Morango com Chocolate Branco");
		pizzaDoce.addVariacao("Banana com Canela");

		lasanhaMedia = new Comida("lasanha Media", "Lasanha de tamanho medio", 26);
		lasanhaMedia.addVariacao("Quatro queijos");
		lasanhaMedia.addVariacao("Bolonhesa");
		lasanhaMedia.addVariacao("Frango");
		lasanhaMedia.addVariacao("Berinjela");

		lasanhaGrande = new Comida("lasanha Grande", "Lasanha de tamanho grande", 48);
		lasanhaGrande.addVariacao("Quatro queijos");
		lasanhaGrande.addVariacao("Bolonhesa");
		lasanhaGrande.addVariacao("Frango");
		lasanhaGrande.addVariacao("Berinjela");

		yakisobaMedio = new Comida("Yakisoba Medio", "Yakisoba de tamanho medio", 18);
		yakisobaMedio.addVariacao("Camarao");
		yakisobaMedio.addVariacao("Porco");
		yakisobaMedio.addVariacao("Boi");
		yakisobaMedio.addVariacao("Vegetariano");

		yakisobaGrande = new Comida("Yakisoba Grande", "Yakisoba de tamanho grande", 27);
		yakisobaGrande.addVariacao("Camarao");
		yakisobaGrande.addVariacao("Porco");
		yakisobaGrande.addVariacao("Boi");
		yakisobaGrande.addVariacao("Vegetariano");

		boloMedio = new Comida("Bolo Medio", "Bolo de tamanho medio", 62);
		boloMedio.addVariacao("Negresco");
		boloMedio.addVariacao("Doce de Leite");
		boloMedio.addVariacao("Rede Velvet");

		boloGrande = new Comida("Bolo Grande", "Bolo de tamanho grande", 110);
		boloGrande.addVariacao("Negresco");
		boloGrande.addVariacao("Doce de Leite");
		boloGrande.addVariacao("Rede Velvet");

		docinho = new  Comida("Docinhos", "Deliciosa sobremesa", 12);
		docinho.addVariacao("Moranguinho");
		docinho.addVariacao("Brigadeiro");
		docinho.addVariacao("Surpresa de Uva");

		batata = new Comida("Batata Frita", "Deliciosas Batata Fritas", 38);

		costela = new Comida("Costela com Barbecue", "Deliciosa Costela assada por 8horas, acompanha fritas e farofa.", 88);
		
		maderoBacon = new Comida("Madero Bacon", "Blend de 180g no ponto e Bacon extra cocrante", 58);

		maderoSuper = new Comida("Madero Super", "Dois Blends de 180g no ponto, o dobro de queijo", 62);


		// bebidas
		coca = new Bebida("Coca-cola", "Lata de coca-cola clássica", 4, 300);
		guarana = new Bebida("Guarana", "Garrafa de Guarana antartica", 6, 1500);
		fanta = new Bebida("Fanta", "Garrafa de fanta laranja", (float) 8.50, 2000);
		suco = new Bebida("Suco de Uva", "Suco de poupa de uva", 3, 500);
		milkshake = new Bebida("Milkshake", "Milkshake de chocolate", 4, 200);

		// combos
		
		burguerCombo = new Combo("Burguer Combo", "Dois Xfrangos e uma coca-cola de dois litros", 50, 2);

		pizzaCombo = new Combo("Pizza Combo", "Duas Pizzas Grandes e um Refrigerante de dois litros do dia", 70, 8);

		maderoCombo = new Combo("Madero Combo", "Dois Maderos Supers, batata e Dois Refrigerantes", 100, 2);

		boloCombo = new Combo("Bolo Combo", "Dois Bolos Grandes e um Refrigerantes de dois litros(Colocar sabor dos bolos na obs)", 200, 20);

		pastelCombo = new Combo("Pastel Combo", "10 Pasteis Grandes Sortidos", 68, 5);

		lasanhaCombo = new Combo("Lasanha Combo", "Duas Lasanhas Grandes e um guarana de 1 litro", 90, 8);

		yakiCombo = new Combo("Combo de Yakissoba", "Dois yakissobas Grandes e uma fanta de 1 litro", 50, 4);

		// adiciona os itens aos restaurantes
		silvaLanches.addItem(coxinha);
		silvaLanches.addItem(pastel);
		silvaLanches.addItem(coca);
		silvaLanches.addItem(guarana);

		hamburgueria.addItem(xbacon);
		hamburgueria.addItem(xfrango);
		hamburgueria.addItem(fanta);
		hamburgueria.addItem(suco);
		hamburgueria.addItem(burguerCombo);
		hamburgueria.addItem(milkshake);

		galegoLanches.addItem(xbacon);
		galegoLanches.addItem(xfrango);
		galegoLanches.addItem(guarana);
		galegoLanches.addItem(coca);
		galegoLanches.addItem(fanta);
		galegoLanches.addItem(suco);
		galegoLanches.addItem(burguerCombo);

		pizzaPalace.addItem(obsComida);
		pizzaPalace.addItem(pizzaMedia);
		pizzaPalace.addItem(pizzaGrande);

		pizzaDaNonna.addItem(obsComida);
		pizzaDaNonna.addItem(pizzaGrande);
		pizzaDaNonna.addItem(pizzaMedia);
		pizzaDaNonna.addItem(guarana);
		pizzaDaNonna.addItem(coca);
		pizzaDaNonna.addItem(fanta);
		pizzaDaNonna.addItem(suco);
		pizzaDaNonna.addItem(pizzaDoce);
		pizzaDaNonna.addItem(pizzaCombo);

		reiDaLasanha.addItem(obsComida);
		reiDaLasanha.addItem(lasanhaGrande);
		reiDaLasanha.addItem(lasanhaMedia);
		reiDaLasanha.addItem(coca);
		reiDaLasanha.addItem(guarana);
		reiDaLasanha.addItem(fanta);
		reiDaLasanha.addItem(suco);
		reiDaLasanha.addItem(lasanhaCombo);

		chinaInBox.addItem(obsComida);
		chinaInBox.addItem(yakisobaGrande);
		chinaInBox.addItem(yakisobaMedio);
		chinaInBox.addItem(coca);
		chinaInBox.addItem(guarana);
		chinaInBox.addItem(fanta);
		chinaInBox.addItem(suco);
		chinaInBox.addItem(yakiCombo);

		casaAlema.addItem(obsComida);
		casaAlema.addItem(boloGrande);
		casaAlema.addItem(boloMedio);
		casaAlema.addItem(coxinha);
		casaAlema.addItem(docinho);
		casaAlema.addItem(coca);
		casaAlema.addItem(guarana);
		casaAlema.addItem(fanta);
		casaAlema.addItem(suco);
		casaAlema.addItem(boloCombo);

		maderoBurguer.addItem(batata);
		maderoBurguer.addItem(costela);
		maderoBurguer.addItem(maderoBacon);
		maderoBurguer.addItem(maderoSuper);
		maderoBurguer.addItem(coca);
		maderoBurguer.addItem(guarana);
		maderoBurguer.addItem(fanta);
		maderoBurguer.addItem(suco);
		maderoBurguer.addItem(maderoCombo);

		pastelDaJane.addItem(obsComida);
		pastelDaJane.addItem(pastel);
		pastelDaJane.addItem(pastelGrande);
		pastelDaJane.addItem(coca);
		pastelDaJane.addItem(guarana);
		pastelDaJane.addItem(fanta);
		pastelDaJane.addItem(suco);
		pastelDaJane.addItem(pastelCombo);

		casaDoBolo.addItem(obsComida);
		casaDoBolo.addItem(boloGrande);
		casaDoBolo.addItem(boloMedio);
		casaDoBolo.addItem(coca);
		casaDoBolo.addItem(guarana);
		casaDoBolo.addItem(fanta);
		casaDoBolo.addItem(suco);
		casaDoBolo.addItem(boloCombo);
		
	}

  public void addRestaurante(Restaurante res) {
    restaurantes.add(res);
  }

	public void addCliente(Cliente cli){
		clientes.add(cli);
	}

  public void removeRestaurante(Restaurante res) {
    try {
      restaurantes.remove(res);
    } catch (Exception e) {
      System.out.println("erro, o valor da entrada nao consta na lista de restaurantes");
    }
  }

  public void setClienteAtual(Cliente cliente) {
    clienteAtual = cliente;
  }

  public ArrayList<Restaurante> getRestaurantes() {
    return restaurantes;
  }

  public ArrayList<Cliente> getClientes() {
    return clientes;
  }

  public Carrinho getCarrinho() {
    return carrinhoAtual;
  }
}
