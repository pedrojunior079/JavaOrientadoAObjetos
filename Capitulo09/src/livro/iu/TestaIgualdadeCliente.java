package livro.iu;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TestaIgualdadeCliente {
   public static void main(String[] args) {
	   SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	   Calendar nascimento = Calendar.getInstance();
	   try {
		   nascimento.setTime(sdf.parse("04/01/2008"));
	   }catch(ParseException e) {
		   e.printStackTrace();
	   }
	   Cliente c1 = new Cliente("Everton", nascimento);
	   Cliente c2 = c1;
	   Cliente c3 = new Cliente("Everton", nascimento);
	   
	   if(c1 == c2)
		  System.out.println("c1 == c2");
	   else
		  System.out.println("c1 != c2");
	   if(c1 == c3)
		  System.out.println("c1 == c3");
	   else
		  System.out.println("c1 != c3"); 
   }
}
