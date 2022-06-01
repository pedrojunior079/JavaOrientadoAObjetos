package livro.iu;

public class Contato {
    private String nome;
    private String endereco;
    private String telefone;
    private RepositorioList<Contato> repositorio = new RepositorioList<Contato>();
	
    public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public void adicionar() {
		repositorio.adicionar(this);
	}
    public Contato recuperar() {
    	return repositorio.recuperar(this);
    }
    public void remover() {
    	repositorio.remover(this);
    }
    @Override
    public int hashCode() {
    	final int PRIME = 31;
    	int result = 1;
    	result = PRIME * result + ((nome == null) ? 0 : nome.hashCode());
    	result = PRIME * result + ((telefone == null)? 0 : telefone.hashCode());
    	return result;
    }
    @Override
    public boolean equals(Object obj) {
    	if(this == obj)
    	   return true;
    	if(obj == null)
    	   return false;
    	if(getClass() != obj.getClass())
    		return false;
    	final Contato other = (Contato) obj;
    	if(nome == null) {
    		if(other.nome != null)
    		   return false;	
    	}else if(!nome.equals(other.nome))
    		return false;
    	if(telefone == null) {
    	   if(other.telefone != null)
    		  return false; 
    	}else if(!telefone.equals(other.telefone))
    		return false;
    	return true;
    }
}
