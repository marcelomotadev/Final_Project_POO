public class Avaliacao {
  private int estrelas;
  private String nome;
  private String comentario;

  public Avaliacao(int estrelas, String nome, String comentario) {
    this.estrelas = estrelas;
    this.nome = nome;
    this.comentario = comentario;
  }

  public void editaEstrelas(int newEstrelas) {
    estrelas = newEstrelas;
  }

  public int getEstrelas() {
    return estrelas;
  }

  public String getNome() {
    return nome;
  }

  public String getComentario() {
    return comentario;
  }
  
  
}