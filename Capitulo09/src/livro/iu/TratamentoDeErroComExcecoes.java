package livro.iu;

public class TratamentoDeErroComExcecoes {
    public static void main(String[] args) {
    	int numerador = 100;
    	int divisor = 0;
    	int resultado;
    	try {
    		resultado = (numerador/divisor);
    		System.out.println(numerador + " dividido por " + divisor + " é igual a " + resultado);
    	}
    	catch(Exception e) {
    		System.out.println("Impossivel dividir um número por zero");
    	}
    }
}
