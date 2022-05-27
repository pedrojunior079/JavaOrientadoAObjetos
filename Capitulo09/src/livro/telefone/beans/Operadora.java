package livro.telefone.beans;

import java.util.ArrayList;

import livro.iu.Console;

public class Operadora {
   private String nome;
   private ArrayList<Plano> planos;
   private ArrayList<Cliente> clientes;
   
   public Operadora(String nome) {
	   planos = new ArrayList<Plano>();
	   this.nome = nome;
   }
   
   public boolean removeCliente(Cliente cliente) {
	   boolean result;
	   result = clientes.remove(cliente);
	   if(result && cliente.getOperadoras().contains(this))
		   cliente.removeOperadora(this);
	   return result;
   }
   
   public ArrayList<Plano>getPlanos(){
	   return planos;
   }
   
   public ArrayList<Plano>getPlanosNaoModificavel(){
	   ArrayList<Plano> newPlanos = new ArrayList<Plano>();
	   for(Plano plano : getPlanos()) {
		   newPlanos.add(new Plano(plano));
	   }
	   return newPlanos;
   }
   
   public void adicionaPlano(Plano plano) {
	   planos.add(plano);
   }
   
   public void adicionaCliente(Cliente cliente) {
	   if(!clientes.contains(cliente))
		   clientes.add(cliente);
	   
	   if(!cliente.getOperadoras().contains(this))
		   cliente.adicionaOperadora(this);
   }
   
   public ArrayList<Cliente>getClientes(){
	   return clientes;
   }
   
   public void exibePlanos() {
	   for(int i = 0; i < planos.size(); i++) {
		   Plano plano = (Plano) planos.get(i);
		   Console.exibeLn(plano.getNome());
	   }
   }
   
   public int getQunatidadePlanos() {
	   return planos.size();
   }
      
      
   public String getNome() {
	   return nome;
   }
   
   public void setNome(String nome) {
	   this.nome = nome;
   }
}
