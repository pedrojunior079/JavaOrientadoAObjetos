package livro.iu;

import java.util.ArrayList;
import java.util.List;

public class RepositorioList<T> implements Repositorio<T>{
   List<T> dados  = new ArrayList<T>();
   public void adicionar(T o) {
	   dados.add(o);
   }
   
   public T recuperar(T o) {
	   int i = dados.indexOf(o);
	   return dados.get(i);
   }

   
   public void remover(T o) {
	   dados.remove(o);
   }
}
