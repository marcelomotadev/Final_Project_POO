import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BebidaTest {
  @Test
  public void testGetMlsText() {
  Bebida coca = new Bebida("Coca", "Gelada" ,2, 300);

  assertEquals("300 mls", coca.getMlsText());

  }
}
