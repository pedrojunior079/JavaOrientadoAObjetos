package livro.iu;

import java.awt.Graphics;

public class Retangulo extends Figura{
     private int largura;
     private int altura;
     
     public Retangulo(Ponto p, int l, int a) {
    	 super(p);
    	 largura = l;
    	 altura = a;
     }
     
     public void desenhaFigura(Graphics g) {
    	 int pX, pY;
    	 pX = getCentro().getX() - getLargura()/2;
 		 pY = getCentro().getY() - getAltura()/2;
 		 g.drawOval(pX, pY, getLargura(), getAltura());
     }
     
     public double getArea() {
    	 return getLargura() * getAltura();
     }

	public int getLargura() {
		return largura;
	}

	public void setLargura(int largura) {
		this.largura = largura;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	@Override
	public void desenharFigura(Graphics g) {
		// TODO Auto-generated method stub
		
	}
     
     
}
