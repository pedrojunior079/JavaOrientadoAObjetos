package livro.iu;

import java.awt.Graphics;

import javax.swing.JFrame;

public class DesenhaFigura extends JFrame{
	Circulo circulo;
	Retangulo retangulo;
	
	public DesenhaFigura() {
		setTitle("Desenho de Figura");
		setSize(400, 300);
		setVisible(true);
	}
	
	public void setCirculo(Circulo circulo) {
		this.circulo = circulo;
	}
	
	public void setRetangulo(Retangulo retangulo) {
		this.retangulo = retangulo;
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		this.circulo.desenhaFigura(g);
		this.retangulo.desenhaFigura(g);
	}
	
    public static void main(String[] args) {
    	DesenhaFigura desenhaFigura = new DesenhaFigura();
    	Circulo c = new Circulo(new Ponto(200, 150), 60);
    	desenhaFigura.setCirculo(c);
    	Retangulo r = new Retangulo(new Ponto(200, 150), 60, 60);
    	desenhaFigura.setRetangulo(r);
    }
}
