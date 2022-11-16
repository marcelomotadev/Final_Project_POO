
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class telaPedido extends tela {
  private Carrinho carrinhoPedido;

  public telaPedido(Carrinho carrinho) {
    super("Pedido realizado!");
    geraBtVoltar();

    addItens(carrinho.getItens());

    JLabel lblNewLabel_2 = new JLabel("Obrigado pelo seu pedido!");
    lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
    lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 16));
    lblNewLabel_2.setBounds(125, 11, 202, 33);
    getContentPane().add(lblNewLabel_2);

    JLabel lblNewLabel = new JLabel("Endereço:");
    lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
    lblNewLabel.setBounds(10, 44, 89, 25);
    getContentPane().add(lblNewLabel);

    JLabel lblNewLabel_1 = new JLabel("Contato:");
    lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
    lblNewLabel_1.setBounds(10, 71, 89, 25);
    getContentPane().add(lblNewLabel_1);

    JLabel lblNewLabel_3 = new JLabel("Pagamento:");
    lblNewLabel_3.setHorizontalAlignment(SwingConstants.LEFT);
    lblNewLabel_3.setBounds(10, 96, 121, 25);
    getContentPane().add(lblNewLabel_3);

    JLabel lblNewLabel_4 = new JLabel("Total:");
    lblNewLabel_4.setBounds(10, 124, 46, 14);
    getContentPane().add(lblNewLabel_4);

    JLabel lblNewLabel_2_1 = new JLabel("Itens pedidos:");
    lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
    lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
    lblNewLabel_2_1.setBounds(135, 151, 149, 33);
    getContentPane().add(lblNewLabel_2_1);

    JLabel contact = new JLabel(carrinho.getContact());
    contact.setBounds(125, 76, 329, 14);
    getContentPane().add(contact);

    JLabel address = new JLabel(carrinho.getAddress());
    address.setBounds(125, 49, 329, 14);
    getContentPane().add(address);

    JLabel payment = new JLabel(carrinho.getPayment());
    payment.setBounds(125, 101, 329, 14);
    getContentPane().add(payment);

    JLabel value = new JLabel(Float.toString(carrinho.getValorTotal()));
    value.setBounds(125, 124, 329, 14);
    getContentPane().add(value);
  }

  public void addItem(Item item, int altura) {
    JLabel product1 = new JLabel(item.getNome());
    product1.setHorizontalAlignment(SwingConstants.CENTER);
    product1.setBounds(40, altura - 9, 106, 33);
    getContentPane().add(product1);

    JLabel quant1 = new JLabel(Integer.toString(item.getQuantidadeCliente()));
    quant1.setHorizontalAlignment(SwingConstants.CENTER);
    quant1.setBounds(166, altura, 46, 14);
    getContentPane().add(quant1);

    JLabel value1 = new JLabel("R$ " + Float.toString(item.getPrecoQuantidade()));
    value1.setHorizontalAlignment(SwingConstants.CENTER);
    value1.setBounds(231, altura, 46, 14);
    getContentPane().add(value1);

  }

  public void addItens(ArrayList<Item> itens) {
    int altura = 187;
    for (Item r : itens) {
      addItem(r, altura);
      altura += 35;
    }
  }
}
