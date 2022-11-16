import static org.junit.Assert.assertEquals;


import org.junit.Test;

public class ComidaTest {
  Comida pastel = new Comida("Pastel", "Pastel de diferentes sabores", 4);
  @Test
  public void testGetTextSabores() {
    pastel.addVariacao("Camarao");
    pastel.addVariacao("Queijo");
    pastel.addVariacao("Carne");
    assertEquals("Camarao, Queijo, Carne", pastel.getTextSabores());
  }
}
