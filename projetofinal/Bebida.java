public class Bebida extends Item{
  private int mls;
  private boolean alcoolica;
  private String marca;

  public Bebida(String nome, String descricao, float preco, int mls, boolean alcoolica, String marca) {
    super(nome, descricao, preco);
    this.mls = mls;
    this.alcoolica = alcoolica;
    this.marca = marca;
      }

  
}

