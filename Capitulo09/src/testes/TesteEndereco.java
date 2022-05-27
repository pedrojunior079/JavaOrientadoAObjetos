package testes;

import livro.telefone.beans.Cliente;
import livro.telefone.beans.Endereco;

public class TesteEndereco {
    public static void main(String[] args) {
    	Endereco e1 = new Endereco("Duke", "92", "Java", "88888-888", "Florianopolis", "SC");
    	Cliente everton = new Cliente("99750861", "Everton Coimbra de Araujo", "Motorola", e1);
    	Cliente ana = new Cliente("99750862", "Ana Lucia", "LG", 
    			new Endereco("OAK", "29", "Carvalhos", "99999-999", "Joinvile", "SC"));
    }
}
