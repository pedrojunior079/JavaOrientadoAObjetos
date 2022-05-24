
public class AplicacaoTelefone {
   
	public static void main(String[] args) {
		
		Operadora operadora = new Operadora("TLfonia");
		Plano planoFilhoQuerido = new Plano("Filho querido", 0.50, 20, operadora);
		System.out.println("Operadora do plano FILHO QUERIDO é : " + 
		  planoFilhoQuerido.getOperadora().getNome());
		
		operadora.setNome("Fale mais e pague mais Telecom");
		System.out.println("Operadora do plano FILHO QUERIDO é : " + 
		   planoFilhoQuerido.getOperadora().getNome());
		
		Plano planoPaiExecutivo = new Plano("Pai Executivo", 0.40, 40,
				new Operadora("TLFonia"));
		
		System.out.println("Operadora do plano PAI EXECUTIVO é : " +
		    planoPaiExecutivo.getOperadora().getNome());
		
	}
}
