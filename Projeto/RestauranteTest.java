import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class RestauranteTest {
  Restaurante madero = new Restaurante("Madero Burguer", "Qualidade e excelencia");
  Item guarana = new Item("guarana", "o melhor do brasil", 6);
  @Test
  public void testGetAvaliacaoMedia() {
    madero.addAvaliacao(5);
    madero.addAvaliacao(4);
    madero.setAvaliacaoMedia();
    assertEquals(4.5, madero.getAvaliacaoMedia(), 0);
  }

  @Test
  public void testGetDescricao() {
    assertEquals("Qualidade e excelencia", madero.getDescricao());
  }

  @Test
  public void testGetItens() {
    madero.addItem(guarana);
    ArrayList<Item> arrayTeste = new ArrayList<>();
    arrayTeste.add(guarana);
    assertEquals(arrayTeste, madero.getItens());
  }

  @Test
  public void testGetNome() {
    assertEquals("Madero Burguer", madero.getNome());
  }
}
