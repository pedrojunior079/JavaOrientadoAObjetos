package livro.apps;

import java.io.IOException;

import livro.iu.Console;
import livro.telefone.beans.Operadora;
import livro.telefone.beans.Plano;

public class TesteInteracao {

	public static void main(String[] args) throws IOException{
		// solicita��o ao usu�rio das infora��es
		Console.exibe("Informe o nome da operadora : ");
		String strOperadora = Console.LeTexto();
		Console.exibe("Informe o nome do plano: ");
		String strPlano = Console.LeTexto();
		Console.exibe("Informe o custo de cada minuto de liga��o : ");
		double dblCustoMinuto = Console.LeReal();
		Console.exibe("Informe o cr�dito inicial de minutos : ");
        int intCreditoInicial = Console.LeInteiro();
        
        // Cria��o dos objetos com valores informados pelo usu�rio
        Operadora operadora = new Operadora(strOperadora);
        Plano plano = new Plano(strPlano, dblCustoMinuto, intCreditoInicial, operadora);
        
        // Exibi��o dos dados dos objetos
        Console.exibeLn("Operadora informada : " + plano.getOperadora().getNome());
	}

}
