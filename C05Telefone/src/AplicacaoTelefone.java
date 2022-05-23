
public class AplicacaoTelefone {
   
	public static void main(String[] args) {
		Telefone telefone;
		telefone = new Telefone();
		   
		telefone.setModelo("FPS02");
		telefone.setNumero("9988-7766");
		telefone.setCustoMinuto(1.50);
		telefone.setCreditoInicial(15.00);
		  
		System.out.println("Modelo..............:" + telefone.getModelo());
		System.out.println("Núnero..............:" + telefone.getNumero());
		System.out.println("Custo Miniuto.......:" + telefone.getCustoMinuto());
		System.out.println("Crédito Inicial....:" + telefone.getCreditoInicial());
	}
	
	
}
