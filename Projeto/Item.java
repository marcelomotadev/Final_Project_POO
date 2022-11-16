
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.SpinnerModel;

public class Item {
  private String nome;
  private String descricao;
  private float preco;
  private int quantidadeCliente; // quantidade desse item 
  private float precoQuantidade; // preço total
  private JSpinner spinner;



  public Item(String nome, String descricao, float preco) {
	SpinnerModel modelo = new SpinnerNumberModel(0, 0, 100, 1); // spinner começa do 0 e tem limites de 0 a 100
	spinner = new JSpinner(modelo);
	this.nome = nome;
    this.descricao = descricao;
    this.preco = preco;
    this.quantidadeCliente = 0;
    this.precoQuantidade = 0;
  }


  public void mudaPreco(float novoPreco){
    preco = novoPreco;
  }

  public void addQuantidadeCliente() {
    precoQuantidade = preco * quantidadeCliente;
  }

   public int getQuantidadeCliente() {
	  return quantidadeCliente;
  }

  public void subQuantidadeCliente() {
    quantidadeCliente--;
    precoQuantidade = preco * quantidadeCliente;
  }
  
  public float getPrecoQuantidade() {
	  return precoQuantidade;
  }


  public String getNome() {
    return nome;
  }

  public String getDescricao() {
    return descricao;
  }

  public float getPreco() {
    return preco;
  }

  public JSpinner getSpinner() {
	  return spinner;
  }

  public void setQuantidadeCliente() {
	  quantidadeCliente = (int) spinner.getValue();
  }
  
  public void setQuantidadeClienteTeste(int quantidade){
    quantidadeCliente = quantidade;
  }
  
}