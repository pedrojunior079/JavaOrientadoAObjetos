package testes;

import livro.iu.Console;
import livro.telefone.beans.Cliente;
import livro.telefone.beans.Operadora;
import livro.telefone.beans.Plano;

public class TesteColecaoPlanos {
   public static void main(String[] args) {
	   Operadora fps = new Operadora("FPS");
       fps.adicionaPlano(new Plano("FPS30"));
       fps.adicionaPlano(new Plano("FPS50", 0.50, 20));
       
       Operadora fpm = new Operadora("FPM");
       fpm.adicionaPlano(new Plano("FPM30"));
       fpm.adicionaPlano(new Plano("FPM50", 0.50, 20));
       
       Cliente everton = new Cliente("99750861", "Everton Coimbra de Araujo", "Motorola");
       Cliente ana = new Cliente("99750862", "Ana Lucia", "LG");
       
       fps.adicionaCliente(everton);
       fps.adicionaCliente(ana);
       
       for(Cliente cliente : fps.getClientes()) {
    	   Console.exibeLn(cliente.getNome());
       }
       Console.exibeLn("");
       
       everton.adicionaOperadora(fpm);
       for(Operadora operadora : everton.getOperadoras()) {
    	   Console.exibeLn(operadora.getNome());
       }
       Console.exibeLn("");
       Console.exibeLn("Operador fpm");
       fpm.removeCliente(everton);
       for(Cliente cliente : fpm.getClientes()) {
    	   Console.exibeLn(cliente.getNome());
       }
       
       Console.exibeLn("");
       Console.exibeLn("Cliente everton");
       for(Operadora operadora : everton.getOperadoras()) {
    	   Console.exibeLn(operadora.getNome());
       }
   }
}
