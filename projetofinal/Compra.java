
/**
 * Compra
 */
public class Compra {
  private String paymentMethod; // método de pagamento
  private String address; //endereço cliente
  private double total;

  public Compra(String endereco, String paymentMethod){
    this.address = endereco;
    this.paymentMethod = paymentMethod;
    this.total = 0;
  }


  public String getAddress() {
    return address;
  }



  public double valorDevido() {
    return total;
  }


  


  
}