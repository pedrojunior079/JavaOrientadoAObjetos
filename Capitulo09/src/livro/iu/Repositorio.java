package livro.iu;

public interface Repositorio<T> {
   public void adicionar(T o);
   public void remover(T o);
   public T recuperar(T o);
}
