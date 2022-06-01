package livro.iu;

import java.awt.Graphics;

public abstract class Figura {
    private Ponto centro;
    
    public Figura(Ponto centro) {
    	this.centro = centro; 
    }
    
    public void setCentro(Ponto centro) {
    	this.centro = centro;
    }
    
    public Ponto getCentro() {
    	return(this.centro); 
    }
    
    public abstract double getArea();
    public abstract void desenharFigura(Graphics g);
}
