import java.awt.EventQueue;


public class Principal{
  public static void main(String[] args) {
	Feed feed;
	
	

	feed = new Feed();
	
	EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					telaCarrinho frameCarrinho = new telaCarrinho(feed);
					telaPesquisa framePesquisa = new telaPesquisa(feed, frameCarrinho);
					telaFeed frameFeed = new telaFeed(frameCarrinho, feed);
					telaInicial frameInicial = new telaInicial(frameFeed, framePesquisa, frameCarrinho, feed);
					telaRegistro frameReg = new telaRegistro(feed.getClientes());
					telaLogin frameLog = new telaLogin(feed, frameInicial);
					telaRegistroLogin frameRegLog = new telaRegistroLogin(frameReg, frameLog);
					frameRegLog.setVisible(true);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	  
	  
  }
  
}

