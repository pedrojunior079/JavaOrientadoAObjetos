
public class Plano {
   private String nome;
   private double custoMinuto;
   private int creditoInicial;
   private Operadora operadora;
   
   

   public Plano(String nome, Operadora operadora) {
	 this(nome, 0, 0, operadora);
   }
   
   public Plano(String nome, double custoMinuto, int creditoInicial, Operadora operadora) {
	 this.nome = nome;
	 this.custoMinuto = custoMinuto;
	 this.creditoInicial = creditoInicial;
	 this.operadora = operadora;
   }
   public String getNome() {
	 return nome;
   }
   public void setNome(String nome) {
	 this.nome = nome;
   }
   public double getCustoMinuto() {
	 return custoMinuto;
   }
   public void setCustoMinuto(double custoMinuto) {
	 this.custoMinuto = custoMinuto;
   }
   public int getCreditoInicial() {
	 return creditoInicial;
   }
   public void setCreditoInicial(int creditoInicial) {
	 this.creditoInicial = creditoInicial;
   }
   public Operadora getOperadora() {
	 return operadora;
   }
   public void setOperadora(Operadora operadora) {
	 this.operadora = operadora;
   }
}
