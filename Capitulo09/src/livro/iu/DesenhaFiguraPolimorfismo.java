package livro.iu;

import java.awt.Graphics;
import java.util.Vector;

import javax.swing.JFrame;

public class DesenhaFiguraPolimorfismo extends JFrame{
	private Vector<Figura> figuras = new Vector<Figura>();
	
	public DesenhaFiguraPolimorfismo() {
		setTitle("Desenho de Figuras");
		setSize(400, 300);
		setVisible(true);
	}
	
	public void adicionaFigura(Figura figura) {
		figuras.add(figura);
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		for(Figura figura : figuras) {
			figura.desenharFigura(g);
		}
	}

	public static void main(String[] args) {
		DesenhaFiguraPolimorfismo desenhaFigura = new DesenhaFiguraPolimorfismo();
		desenhaFigura.adicionaFigura(new Circulo(new Ponto(200, 150), 60));
		desenhaFigura.adicionaFigura(new Retangulo(new Ponto(200, 150), 60, 60));

	}

}
