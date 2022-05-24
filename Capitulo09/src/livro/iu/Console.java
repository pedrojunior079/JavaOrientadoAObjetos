package livro.iu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Console {
   public static void exibe(String mensagem) {
	   System.out.print(mensagem);
   }
   
   public static void exibeLn(String mensagem){
	   System.out.println(mensagem);
   }
   
   public static String LeTexto() throws IOException{
	   InputStreamReader isr = new InputStreamReader(System.in);
	   BufferedReader br = new BufferedReader(isr);
	   String textoDigitado = br.readLine();
	   return textoDigitado;
   }
   
   public static char LeCaractere() throws IOException{
	   return LeTexto().charAt(0);
   }
   
   public static int LeInteiro() throws IOException{
	   return Integer.parseInt(LeTexto());
   }
   
   public static double LeReal() throws IOException{
	   return Double.parseDouble(LeTexto());
   }
}
