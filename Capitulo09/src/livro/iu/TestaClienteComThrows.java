package livro.iu;

import java.text.SimpleDateFormat;

public class TestaClienteComThrows {
   public static void main(String[] args) {
	   Cliente c1=null;
	    try {
			c1 = new Cliente("Maria clara", "29/02/2007");
		} catch (DataInvalidaException e) {
			System.out.println(e.getMessage());
			
		}
	    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	    System.out.println(c1 + " nasceu em " + sdf.format(c1.getNascimento().getTime()));
   }
}
