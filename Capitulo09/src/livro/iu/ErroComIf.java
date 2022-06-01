package livro.iu;

public class ErroComIf {
   public static void main(String[] args) {
	   int numerador = 100;
	   int divisor = 0;
	   int resultado;
	   if(divisor != 0) {
		   resultado = (numerador/divisor);
		   System.out.println(numerador + " dividido por " + divisor + " é igual a " + resultado);
	   }
	   else
		   System.out.println("Impossivel dividir um número por zero");
   }
}
