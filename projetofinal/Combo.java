public class Combo extends Item{
  private int qtdPessoas; // a quantidade de pessoas que o combo serve, ex: serve 4 pessoas

  public Combo(String nome, String descricao, float preco, int qtdPessoas) {
    super(nome, descricao, preco);
    this.qtdPessoas = qtdPessoas;
  }


  public String descricaoQtd() {
    return("Serve " + Integer.toString(qtdPessoas) + " pessoas.");
  }
}