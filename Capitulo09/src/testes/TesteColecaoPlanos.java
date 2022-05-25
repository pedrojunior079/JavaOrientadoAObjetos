package testes;



import java.util.Iterator;

import livro.iu.Console;
import livro.telefone.beans.Operadora;
import livro.telefone.beans.Plano;

public class TesteColecaoPlanos {
   public static void main(String[] args) {
	   Operadora operadora = new Operadora("FPS");
       operadora.adicionaPlano(new Plano("FPS30"));
	   operadora.adicionaPlano(new Plano("FPS50", 0.50, 20));
	   
	   Iterator<Plano> planos = operadora.getPlanos().iterator();
	   while(planos.hasNext()) {
		   Plano plano = planos.next();
		   Console.exibeLn(plano.getNome());
	   }
   }
}
