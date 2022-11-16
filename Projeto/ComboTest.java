import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ComboTest {
  Combo bigGalegos = new Combo("Combo do Galegos", "Serve 4 pessoas", 60, 4);
  @Test
  public void testDescricaoQtd() {
    assertEquals("Serve 4 pessoas.", bigGalegos.descricaoQtd());
  }
}
