package livro.iu;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TestaCliente {
   public static void main(String[] args) {
	   SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	   Calendar nascimento = Calendar.getInstance();
	   try {
		nascimento.setTime(sdf.parse("04/01/2008"));
	   } catch (ParseException e) {
		e.printStackTrace();
	   }
	   Cliente c1 = new Cliente("Everton", nascimento);
	   System.out.println(c1);	   
   }
}
