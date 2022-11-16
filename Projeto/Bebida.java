public class Bebida extends Item{
  private int mls;

  public Bebida(String nome, String descricao, float preco, int mls) {
    super(nome, descricao, preco);
    this.mls = mls;
      }

  public String getMlsText() {
	  String mlsTexto;
	  int litro = mls / 1000;
	  int resto = mls % 1000;
	  
	  if (mls >= 2000) {
		  if (resto > 0) {
			  mlsTexto = Integer.toString(litro) + "Litros" + " e " + Integer.toString(resto) + " mls";
		  } else {
			  mlsTexto =  Integer.toString(litro) + "Litros";
		  }

	  }
	  else if (mls >= 1000) {
		  if (resto > 0) {
			  mlsTexto = Integer.toString(litro) + "Litro" + " e " + Integer.toString(resto) + " mls";
		  } else {
			  mlsTexto =  Integer.toString(litro) + "Litro";
		  }

	  } else {
		  mlsTexto = Integer.toString(mls) + " mls";
	  }
	  return mlsTexto;
  }
  
}

