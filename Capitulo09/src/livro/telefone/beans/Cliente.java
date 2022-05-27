package livro.telefone.beans;

import java.util.Vector;

public class Cliente {
     private String numero;
     private String nome;
     private String aparelho;
     private Vector<Operadora> operadoras;
     private Endereco endereco;
     
          
     public Endereco getEndereco() {
		return endereco;
	 }
	 public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	 }
	
	 public Cliente(String numero, String nome, String aparelho, Endereco endereco) {
    	 this.numero = numero;
    	 this.nome = nome;
    	 this.aparelho = aparelho;
    	 this.operadoras = new Vector<Operadora>();
    	 this.endereco = endereco;
     }
     public void adicionaOperadora(Operadora operadora) {
    	 if(!operadoras.contains(operadora))
    		 operadoras.add(operadora);
    	 if(!operadora.getClientes().contains(this))
    		 operadora.adicionaCliente(this);
     }
     
     public boolean removeOperadora(Operadora operadora) {
    	 boolean result;
    	 result = operadoras.remove(operadora);
    	 if(result && operadora.getClientes().contains(this))
    		 operadora.removeCliente(this);
    	 return result;
     }
     
	 public String getNumero() {
		return numero;
	 }
	 public void setNumero(String numero) {
		this.numero = numero;
	 }
	 public String getNome() {
		return nome;
	 }
	 public void setNome(String nome) {
		this.nome = nome;
	 }
	 public String getAparelho() {
		return aparelho;
	 }
	 public void setAparelho(String aparelho) {
		this.aparelho = aparelho;
	 }
	 public Vector<Operadora> getOperadoras() {
		return operadoras;
	 }
	 public void setOperadoras(Vector<Operadora> operadoras) {
		this.operadoras = operadoras;
	 }
}
