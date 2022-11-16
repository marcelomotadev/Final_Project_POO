import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class FeedTest {

  Feed feedTeste = new Feed();
  Cliente marcelo = new Cliente("marcelo", "marcelo@gmail");
  Cliente max = new Cliente("max", "max@gmail");
  Cliente antony = new Cliente("Antony", "Antony@gmail");
  Restaurante maderoBurguer, pastelDaJane;
  

  @Test
  public void testGetClientes() {
    feedTeste.addCliente(antony);
    feedTeste.addCliente(max);
    feedTeste.addCliente(marcelo);

    ArrayList<Cliente> clienteTeste = new ArrayList<>();
    clienteTeste.add(antony);
    clienteTeste.add(max);
    clienteTeste.add(marcelo);

    assertEquals(clienteTeste, feedTeste.getClientes());
  }
}
