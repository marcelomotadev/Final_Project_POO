
/**
 * Cliente
 */
public class Cliente {
  private String name; // nome cliente
  private String email; // email do usuario

  public Cliente(String nome, String email) {
    this.email = email;
    this.name = nome;
  }

  public String getEmail() {
    return email;
  }

  public String getName() {
    return name;
  }

}