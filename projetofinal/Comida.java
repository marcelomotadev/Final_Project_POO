import java.util.ArrayList;

public class Comida extends Item {
  private ArrayList<String> sabores; // ex: sabor queijo, carne, vegetariano etc.

  public Comida(String nome, String descricao, float preco) {
    super(nome, descricao, preco);
    sabores = new ArrayList();
  }

  public void addVariacao(String sabor) {
    sabores.add(sabor);
  }

  public void removeVariacao(String sabor) {
    try {
      sabores.remove(sabor);}
    catch(Exception e) {
      System.out.println("erro, o valor da entrada nao consta na lista de sabores");
    }
  }
}