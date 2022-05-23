
public class Pedido {
  private int mesa;
  private String cliente;
  private String garcom;
  private String produto;
  private double preco;
  private int quantidade;

  public int getMesa() {
	return mesa;
  }
  public void setMesa(int mesa) {
	if(mesa >= 0)
	   this.mesa = mesa;
	else
       System.out.println("O valor " + mesa + 
    		   " não é válido para a propriedade MESA.");		
  }
  public String getCliente() {
	return cliente;
  }
  public void setCliente(String cliente) {
	if(cliente.trim().length() == 0)
	   this.cliente = cliente;
	else
	   System.out.println("A propriedade CLIENTE não pode receber um valor NULO.");	
  }
  public String getGarcom() {
	return garcom;
  }
  public void setGarcom(String garcom) {
	if(garcom.trim().length() == 0)
	   this.garcom = garcom;
	else
	   System.out.println("A propriedade MODELO não pode receber um valor NULO.");	
  }
  public String getProduto() {
	return produto;
  }
  public void setProduto(String produto) {
	if(produto.trim().length() == 0)
	   this.produto = produto;
	else
	   System.out.println("A propriedade PRODUTO não pode receber um valor NULO"); 	
  }
  public double getPreco() {
	return preco;
  }
  public void setPreco(double preco) {
	if(preco >= 0)
	   this.preco = preco;
	else
	   System.out.println("O valor " + preco +
			   " não é valido para a propriedade PRECO");	
  }
  public int getQuantidade() {
	return quantidade;
  }
  public void setQuantidade(int quantidade) {
	if(quantidade >= 0)
	   this.quantidade = quantidade;
	else
	   System.out.println("O valor " + quantidade +
				   " não é valido para a propriedade QUANTIDADE");	
  }
}
