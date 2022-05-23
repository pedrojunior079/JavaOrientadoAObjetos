
public class AplicacaoPedido {
  public static void main(String[] args) {
	  Pedido pedido;
	  pedido = new Pedido();
	  
	  pedido.setMesa(1);
	  pedido.setCliente("Maria Clara");
	  pedido.setGarcom("Gabriel");
	  pedido.setProduto("Pizza de Calabreza");
	  pedido.setPreco(12.54);
	  pedido.setQuantidade(1);
	  
	  System.out.println("Mesa.......:" + pedido.getMesa());
	  System.out.println("Cliente....:" + pedido.getCliente());
	  System.out.println("Garçom.....:" + pedido.getGarcom());
	  System.out.println("Produto....:" + pedido.getProduto());
	  System.out.println("Preco......:" + pedido.getPreco());
	  System.out.println("Quantidade.:" + pedido.getQuantidade());
  }
}
