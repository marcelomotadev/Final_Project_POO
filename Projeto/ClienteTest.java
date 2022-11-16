import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ClienteTest {
  Cliente marcelo = new Cliente("marcelo", "marcelo@gmail");
  @Test
  public void testGetEmail() {
    assertEquals("marcelo@gmail", marcelo.getEmail());
  }

  @Test
  public void testGetName() {
    assertEquals("marcelo", marcelo.getName());
  }
}
