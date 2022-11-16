import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ItemTest {
  Item guarana = new Item("guarana", "o melhor do brasil", 6);
  @Test
  public void testGetDescricao() {
    assertEquals("o melhor do brasil", guarana.getDescricao());
  }

  @Test
  public void testGetNome() {
    assertEquals("guarana", guarana.getNome());
  }

  @Test
  public void testGetPreco() {
    assertEquals(6, guarana.getPreco(), 0);
  }

  @Test
  public void testGetPrecoQuantidade() {
    guarana.setQuantidadeClienteTeste(4);
    guarana.addQuantidadeCliente();
    assertEquals(24, guarana.getPrecoQuantidade(), 0);
  }

  @Test
  public void testGetQuantidadeCliente() {
    guarana.setQuantidadeClienteTeste(5);
    assertEquals(5, guarana.getQuantidadeCliente(), 0);
  }
}
