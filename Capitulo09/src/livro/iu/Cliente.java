package livro.iu;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Objects;

public class Cliente {
    private String nome;
    private Calendar nascimento;
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
    public Cliente(String nome, Calendar nascimento) {
    	this.nome = nome;
    	this.nascimento = nascimento;
    }
    
        
    public Cliente(String nome, String nascimento) throws DataInvalidaException{
    	this.nome = nome;
    	setNascimento(nascimento);
    }
    
    public Calendar getNascimento() {
    	return nascimento;
    }
    
    public String getNome() {
    	return nome;
    }
    
    public void setNascimento(Calendar nascimento) {
    	this.nascimento = nascimento;
    }
    
    public void setNascimento(String nascimento) throws DataInvalidaException{
    	Calendar dataRecebida = Calendar.getInstance();
    	try {
    		dataRecebida.setTime(sdf.parse(nascimento));
    		if(!sdf.format(dataRecebida.getTime()).equals(nascimento))
    			throw new DataInvalidaException(nascimento + " não é uma data valida");
    	}catch(ParseException e) {
    		throw new DataInvalidaException(nascimento + " não é uma data valida");
    	}
    }
    
    public void setNome(String nome) {
    	this.nome = nome;
    }

	@Override
	public String toString() {
		return this.nome;
	}


	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + ((nascimento == null) ? 0 : nascimento.hashCode());
		result = PRIME * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final Cliente other = (Cliente) obj;
		if(nascimento == null) {
		   if(other.nascimento != null)
			  return false; 
		}else if(!nascimento.equals(other.nascimento))
			return false;
		if(nome == null) {
			if(other.nome != null)
			   return false;	
		}else if(!nome.equals(other.nome))
			return false;
		return true;
	}
}
