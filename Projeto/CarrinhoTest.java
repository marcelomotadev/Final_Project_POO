import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class CarrinhoTest {
  Carrinho carrinhoTeste = new Carrinho();
  Bebida coca = new Bebida("Coca", "Gelada", 2, 300);
  Bebida guarana = new Bebida("Guarana", "Gelada", 3, 300);

  @Test
  public void testGetAddress() {
    carrinhoTeste.addAddress("Rua tal");
    assertEquals("Rua tal", carrinhoTeste.getAddress());
  }

  @Test
  public void testGetContact() {
    carrinhoTeste.addContact("99992129");
    assertEquals("99992129", carrinhoTeste.getContact());
  }

  @Test
  public void testGetItens() {
    carrinhoTeste.addCarrinho(coca);
    carrinhoTeste.addCarrinho(guarana);
    ArrayList<Item> arrayTeste = new ArrayList<>();
    arrayTeste.add(coca);
    arrayTeste.add(guarana);
    assertEquals(arrayTeste, carrinhoTeste.getItens());
  }

  @Test
  public void testGetObs() {
    carrinhoTeste.addObs("Sem cebola");
    assertEquals("Sem cebola", carrinhoTeste.getObs());
  }

  @Test
  public void testGetPayment() {
    carrinhoTeste.addPayment("debito");
    assertEquals("debito", carrinhoTeste.getPayment());
  }

  @Test
  public void testGetValorTotal() {
    carrinhoTeste.addCarrinho(coca);
    carrinhoTeste.addCarrinho(guarana);
    assertEquals(5, carrinhoTeste.getValorTotal(), 5);
  }
}
